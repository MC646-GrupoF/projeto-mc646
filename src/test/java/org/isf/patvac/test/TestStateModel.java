/*
 * Open Hospital (www.open-hospital.org)
 * Copyright © 2006-2021 Informatici Senza Frontiere (info@informaticisenzafrontiere.org)
 *
 * Open Hospital is a free and open source software for healthcare data management.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * https://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.isf.patvac.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import org.assertj.core.api.Condition;
import org.isf.OHCoreTestCase;
import org.isf.patient.model.Patient;
import org.isf.patient.model.PatientMergedEvent;
import org.isf.patient.service.PatientIoOperationRepository;
import org.isf.patient.test.TestPatient;
import org.isf.patvac.manager.PatVacManager;
import org.isf.patvac.model.PatientVaccine;
import org.isf.patvac.service.PatVacIoOperationRepository;
import org.isf.patvac.service.PatVacIoOperations;
import org.isf.utils.exception.OHServiceException;
import org.isf.utils.time.TimeTools;
import org.isf.vaccine.model.Vaccine;
import org.isf.vaccine.service.VaccineIoOperationRepository;
import org.isf.vaccine.test.TestVaccine;
import org.isf.vactype.model.VaccineType;
import org.isf.vactype.service.VaccineTypeIoOperationRepository;
import org.isf.vactype.test.TestVaccineType;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.transaction.annotation.Transactional;

public class TestStateModel extends OHCoreTestCase {
	
	private static TestPatientVaccine testPatientVaccine;
	private static TestVaccine testVaccine;
	private static TestVaccineType testVaccineType;
	private static TestPatient testPatient;

	@Autowired
	PatVacIoOperations patvacIoOperation;
	@Autowired
	PatientIoOperationRepository patientIoOperationRepository;
	@Autowired
	PatVacManager patVacManager;
	@Autowired
	VaccineIoOperationRepository vaccineIoOperationRepository;
	@Autowired
	VaccineTypeIoOperationRepository vaccineTypeIoOperationRepository;
	@Autowired
	PatVacIoOperationRepository patVacIoOperationRepository;
	@Autowired
	ApplicationEventPublisher applicationEventPublisher;

	@BeforeClass
	public static void setUpClass() {
		testPatientVaccine = new TestPatientVaccine();
		testPatient = new TestPatient();
		testVaccine = new TestVaccine();
		testVaccineType = new TestVaccineType();
	}

	@Before
	public void setUp() {
		cleanH2InMemoryDb();
	}
	
	// Vertexes:
	public void v_EmptyPatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		assertThat(patientVaccineList.size() == 0).isTrue();
	}
	
	public void v_NonEmptyPatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		assertThat(patientVaccineList.size() > 0).isTrue();
	}
	
	// Edges:
	public void e_NewPatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		int code = 0;
	    for (PatientVaccine pv : patientVaccineList) {
	    	if (pv.getCode() > code) {
	    		code = pv.getCode();
	    	}
	    }
		
		Patient patient = testPatient.setup(false);
		
		VaccineType vaccineType = testVaccineType.setup(false);
		vaccineType.setCode(String.valueOf(code + 1));
		
		Vaccine vaccine = testVaccine.setup(vaccineType, false);
		vaccine.setCode(String.valueOf(code + 1));
		
		patientIoOperationRepository.saveAndFlush(patient);
		vaccineTypeIoOperationRepository.saveAndFlush(vaccineType);
		vaccineIoOperationRepository.saveAndFlush(vaccine);
		
		PatientVaccine patientVaccine = testPatientVaccine.setup(
			patient, vaccine, true
		);
		patientVaccine.setCode(code + 1);
		
		boolean result = patVacManager.newPatientVaccine(patientVaccine);
		assertThat(result).isTrue();
	}
	
	public void e_FailedNewPatVac() throws Exception {
		PatientVaccine patientVaccine = testPatientVaccine.setup(
			null, null, false
		);
		boolean result = false;
		try {
			result = patVacManager.newPatientVaccine(patientVaccine);
		} catch (OHServiceException o) {
			return;
		} 
		assertThat(result).isFalse();
		int code = patientVaccine.getCode();
		result = patvacIoOperation.isCodePresent(code);
		assertThat(result).isFalse();
	}
	
	public void e_DeletePatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		Random rand = new Random(12345);
	    PatientVaccine patientVaccine = patientVaccineList.get(rand.nextInt(patientVaccineList.size()));
		boolean result = patVacManager.deletePatientVaccine(patientVaccine);
		assertThat(result).isTrue();
		assertThat(patvacIoOperation.isCodePresent(patientVaccine.getCode())).isFalse();
	}
	
	public void e_FailedDeletePatVac() throws Exception {
		boolean result = false;
		try {
			result = patVacManager.deletePatientVaccine(null);
		} catch (OHServiceException o) {
			return;
		}
		assertThat(result).isFalse();
	}
	
	public void e_GetPatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		if (patientVaccineList.size() > 0) {
			Random rand = new Random(12345);
		    PatientVaccine patientVaccine = patientVaccineList.get(rand.nextInt(patientVaccineList.size()));
			List<PatientVaccine> patientVaccines = patVacManager.getPatientVaccine(
					patientVaccine.getVaccine().getVaccineType().getCode(),
					patientVaccine.getVaccine().getCode(),
					patientVaccine.getVaccineDate(),
					patientVaccine.getVaccineDate(),
					patientVaccine.getPatient().getSex(),
					patientVaccine.getPatient().getAge(),
					patientVaccine.getPatient().getAge());
			assertThat(patientVaccines.get(patientVaccines.size() - 1).getPatName()).isEqualTo(patientVaccine.getPatName());
		} else {
			List<PatientVaccine> patientVaccines = patVacManager.getPatientVaccine(null, null, null, null, 'A', 0, 0);
			assertThat(patientVaccines.size()).isEqualTo(0);
		}
		
	}
	
	public void e_GetPatVacMinusOneWeek() throws Exception {
		GregorianCalendar timeFrom = TimeTools.getDateToday0();
		timeFrom.add(GregorianCalendar.WEEK_OF_YEAR, -1);
		GregorianCalendar timeTo = TimeTools.getDateToday24();
		List<PatientVaccine> patientVaccines = patVacManager.getPatientVaccine(true);
		for (PatientVaccine patientVaccine : patientVaccines) {
			assertThat(patientVaccine.getVaccineDate().after(timeFrom)).isTrue();
			assertThat(patientVaccine.getVaccineDate().before(timeTo)).isTrue();
		}
	}
	
	public void e_GetPatVacMinusOneDay() throws Exception {
		GregorianCalendar timeFrom = TimeTools.getDateToday0();
		GregorianCalendar timeTo = TimeTools.getDateToday24();
		List<PatientVaccine> patientVaccines = patVacManager.getPatientVaccine(false);
		for (PatientVaccine patientVaccine : patientVaccines) {
			assertThat(patientVaccine.getVaccineDate().after(timeFrom)).isTrue();
			assertThat(patientVaccine.getVaccineDate().before(timeTo)).isTrue();
		}
	}
	
	
	public void e_UpdatePatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		Random rand = new Random(12345);
	    PatientVaccine patientVaccine = patientVaccineList.get(rand.nextInt(patientVaccineList.size()));
		GregorianCalendar newDate = new GregorianCalendar();
		patientVaccine.setVaccineDate(newDate);
		boolean result = patVacManager.updatePatientVaccine(patientVaccine);
		assertThat(result).isTrue();
		PatientVaccine updatePatientVaccine = patVacIoOperationRepository.findOne(patientVaccine.getCode());
		assertThat(updatePatientVaccine.getVaccineDate().equals(newDate));
	}
	
	public void e_FailedUpdatePatVac() throws Exception {
		List<PatientVaccine> patientVaccineList;
		patientVaccineList = patvacIoOperation.getPatientVaccine(
			null, null, null, null, 'A', 0, 0
		);
		if (patientVaccineList.size() > 0) {
			Random rand = new Random(12345);
		    PatientVaccine patientVaccine = patientVaccineList.get(rand.nextInt(patientVaccineList.size()));
			patientVaccine.setVaccineDate(null);
			boolean result = false;
			try {
				result = patVacManager.updatePatientVaccine(patientVaccine);
			} catch (OHServiceException o) {
				return;
			}
			assertThat(result).isFalse();
		} else {
			PatientVaccine patientVaccine = testPatientVaccine.setup(
				null, null, false
			);
			boolean result = false;
			try {
				result = patVacManager.updatePatientVaccine(patientVaccine);
			} catch (OHServiceException o) {
				return;
			} 
			assertThat(result).isFalse();
		}
	}
	
	public void e_GetProgYear() throws Exception {
		int prog_year = 0;
		int found_prog_year = 0;

		List<PatientVaccine> patientVaccineList = patVacManager.getPatientVaccine(null, null, null, null, 'A', 0, 0);
		for (PatientVaccine patVac : patientVaccineList) {
			if (patVac.getProgr() > found_prog_year)
				found_prog_year = patVac.getProgr();
		}
		prog_year = patVacManager.getProgYear(0);
		assertThat(prog_year).isEqualTo(found_prog_year);
	}

	private void _checkPatientVaccineIntoDb(int code) {
		PatientVaccine foundPatientVaccine = patVacIoOperationRepository.findOne(code);
		testPatientVaccine.check(foundPatientVaccine);
	}
}