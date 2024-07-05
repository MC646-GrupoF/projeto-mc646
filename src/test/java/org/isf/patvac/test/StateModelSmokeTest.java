package org.isf.patvac.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class StateModelSmokeTest extends TestStateModel {

	@Test
	public void TestNewDeletePatVac() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyFailedNewPatVac() throws Exception {
		v_EmptyPatVac();
		e_FailedNewPatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testFailedNewPatVac() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_FailedNewPatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyFailedDeletePatVac() throws Exception {
		v_EmptyPatVac();
		e_FailedDeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testFailedDeletePatVac() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_FailedDeletePatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testUpdatePatVac() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_UpdatePatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyFailedUpdatePatVac() throws Exception {
		v_EmptyPatVac();
		e_FailedUpdatePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testFailedUpdatePatVac() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_FailedUpdatePatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyGetPatVac() throws Exception {
		v_EmptyPatVac();
		e_GetPatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testGetPatVac() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_GetPatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyGetPatVacMinusOneWeek() throws Exception {
		v_EmptyPatVac();
		e_GetPatVacMinusOneWeek();
		v_EmptyPatVac();
	}
	
	@Test
	public void testGetPatVacMinusOneWeek() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_GetPatVacMinusOneWeek();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyGetPatVacMinusOneDay() throws Exception {
		v_EmptyPatVac();
		e_GetPatVacMinusOneDay();
		v_EmptyPatVac();
	}
	
	@Test
	public void testGetPatVacMinusOneDay() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_GetPatVacMinusOneDay();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void testEmptyGetProgYear() throws Exception {
		v_EmptyPatVac();
		e_GetProgYear();
		v_EmptyPatVac();
	}
	
	@Test
	public void testGetProgYear() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_GetProgYear();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
}
