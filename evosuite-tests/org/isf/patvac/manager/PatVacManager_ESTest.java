/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 15:58:50 GMT 2024
 */

package org.isf.patvac.manager;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.isf.patient.model.Patient;
import org.isf.patvac.manager.PatVacManager;
import org.isf.patvac.model.PatientVaccine;
import org.isf.vaccine.model.Vaccine;
import org.isf.vactype.model.VaccineType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PatVacManager_ESTest extends PatVacManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1489, (-312), 1489, 0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1500), 1489, 1489, (-429), 0, (-2745));
      // Undeclared exception!
      try { 
        patVacManager0.getPatientVaccine("", "", (GregorianCalendar) mockGregorianCalendar0, (GregorianCalendar) mockGregorianCalendar1, '0', 0, (-450));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = new Locale("", "patId", "Nj=uGn()|]");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      // Undeclared exception!
      try { 
        patVacManager0.getPatientVaccine("dicomPatientAge", "7?^FIcEYedNjZ`xIk", (GregorianCalendar) mockGregorianCalendar0, (GregorianCalendar) mockGregorianCalendar0, 'x', 0, (-1914));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      try { 
        patVacManager0.validatePatientVaccine(patientVaccine0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      // Undeclared exception!
      try { 
        patVacManager0.validatePatientVaccine((PatientVaccine) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      // Undeclared exception!
      try { 
        patVacManager0.updatePatientVaccine((PatientVaccine) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      // Undeclared exception!
      try { 
        patVacManager0.newPatientVaccine((PatientVaccine) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Vaccine vaccine0 = new Vaccine("+cRZC<TiPi", "+cRZC<TiPi", (VaccineType) null);
      patientVaccine0.setVaccine(vaccine0);
      try { 
        patVacManager0.newPatientVaccine(patientVaccine0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      VaccineType vaccineType0 = new VaccineType();
      Vaccine vaccine0 = new Vaccine("angal.patvac.allvaccine", "angal.patvac.allvaccine", vaccineType0);
      patientVaccine0.setVaccine(vaccine0);
      try { 
        patVacManager0.updatePatientVaccine(patientVaccine0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      patientVaccine0.setProgr((-363));
      try { 
        patVacManager0.newPatientVaccine(patientVaccine0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      // Undeclared exception!
      try { 
        patVacManager0.getPatientVaccine(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      PatientVaccine patientVaccine0 = new PatientVaccine(24, 24, mockGregorianCalendar0, (Patient) null, (Vaccine) null, 24);
      try { 
        patVacManager0.newPatientVaccine(patientVaccine0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      // Undeclared exception!
      try { 
        patVacManager0.getProgYear((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PatVacManager patVacManager0 = new PatVacManager();
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patVacManager0.deletePatientVaccine(patientVaccine0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.manager.PatVacManager", e);
      }
  }
}
