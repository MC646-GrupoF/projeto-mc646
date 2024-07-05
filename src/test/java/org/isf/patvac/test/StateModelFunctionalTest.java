package org.isf.patvac.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class StateModelFunctionalTest extends TestStateModel {

	@Test
	public void test1() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_GetProgYear();
		v_NonEmptyPatVac();
		e_GetProgYear();
		v_NonEmptyPatVac();
		e_GetPatVacMinusOneWeek();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
	
	@Test
	public void test2() throws Exception {
		v_EmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_GetProgYear();
		v_NonEmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_UpdatePatVac();
		v_NonEmptyPatVac();
		e_NewPatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_NonEmptyPatVac();
		e_UpdatePatVac();
		v_NonEmptyPatVac();
		e_GetPatVac();
		v_NonEmptyPatVac();
		e_GetProgYear();
		v_NonEmptyPatVac();
		e_GetPatVacMinusOneDay();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_NonEmptyPatVac();
		e_DeletePatVac();
		v_EmptyPatVac();
	}
}
