/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 00:19:27 GMT 2024
 */

package org.isf.patvac.model;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.isf.disease.model.Disease;
import org.isf.distype.model.DiseaseType;
import org.isf.opd.model.Opd;
import org.isf.patient.model.Patient;
import org.isf.vaccine.model.Vaccine;
import org.isf.vactype.model.VaccineType;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.isf.patvac.model.PatientVaccine_ESTest_scaffolding;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PatientVaccine_ESTest extends PatientVaccine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      patientVaccine1.setCode((-928));
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertEquals((-928), patientVaccine1.getCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      GregorianCalendar gregorianCalendar0 = patientVaccine0.getVaccineDate();
      assertNull(gregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1758), 13, 13);
      Patient patient0 = new Patient();
      VaccineType vaccineType0 = new VaccineType((String) null, "org.isf.patvac.model.PatientVaccine");
      Vaccine vaccine0 = new Vaccine((String) null, "", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine((-1374), (-1374), mockGregorianCalendar0, patient0, vaccine0, 31);
      mockGregorianCalendar0.setLenient(false);
      patientVaccine0.getVaccineDate();
      assertEquals(31, patientVaccine0.getLock());
      assertEquals((-1374), patientVaccine0.getCode());
      assertEquals((-1374), patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3625, (-2953), 3625, (-1174), (-3082), (-1945));
      Vaccine vaccine0 = new Vaccine();
      mockGregorianCalendar0.setFirstDayOfWeek((-3082));
      PatientVaccine patientVaccine0 = new PatientVaccine(3625, 3625, mockGregorianCalendar0, (Patient) null, vaccine0, (-3082));
      patientVaccine0.getVaccineDate();
      assertEquals(3625, patientVaccine0.getCode());
      assertEquals((-3082), patientVaccine0.getLock());
      assertEquals(3625, patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Vaccine vaccine0 = new Vaccine();
      vaccine0.setActive(0);
      patientVaccine0.setVaccine(vaccine0);
      Vaccine vaccine1 = patientVaccine0.getVaccine();
      assertEquals(0, vaccine1.getActive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Vaccine vaccine0 = new Vaccine();
      patientVaccine0.setVaccine(vaccine0);
      Vaccine vaccine1 = patientVaccine0.getVaccine();
      assertNull(vaccine1.getLock());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(0, 0, (GregorianCalendar) null, (Patient) null, vaccine0, 0);
      vaccine0.setActive((-1819));
      patientVaccine0.getVaccine();
      assertEquals(0, patientVaccine0.getCode());
      assertEquals(0, patientVaccine0.getProgr());
      assertEquals(0, patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      int int0 = patientVaccine0.getProgr();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VaccineType vaccineType0 = new VaccineType("|`h`M9dRUg:Bg5Af", ",~<3[]Y[Ma{");
      Vaccine vaccine0 = new Vaccine("", "|`h`M9dRUg:Bg5Af", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine(0, 1547, (GregorianCalendar) null, (Patient) null, vaccine0, 1);
      int int0 = patientVaccine0.getProgr();
      assertEquals(1, patientVaccine0.getLock());
      assertEquals(1547, int0);
      assertEquals(0, patientVaccine0.getCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = patientVaccine0.getPatient();
      assertNull(patient0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2879, 31, 31);
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine((-869), (-869), mockGregorianCalendar0, patient0, vaccine0, 333);
      patient0.setLock(919);
      patientVaccine0.getPatient();
      assertEquals(333, patientVaccine0.getLock());
      assertEquals((-869), patientVaccine0.getCode());
      assertEquals((-869), patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Patient patient0 = new Patient(0, "", "", "", mockDate0, 2318, "", '9', "HFQ^DLQ'", "HFQ^DLQ'", "xQRm3DC1Dx2']hIc{)", "xQRm3DC1Dx2']hIc{)", "", "xQRm3DC1Dx2']hIc{)", 'P', "", '9', "xQRm3DC1Dx2']hIc{)", '6', 'X', "", "HFQ^DLQ'", "cuWs2WYf4-3Q++v");
      patient0.setLock((-2040));
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(2318, 2318, (GregorianCalendar) null, patient0, vaccine0, 2318);
      patientVaccine0.getPatient();
      assertEquals(2318, patientVaccine0.getCode());
      assertEquals(2318, patientVaccine0.getProgr());
      assertEquals(2318, patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4326, "a47");
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0, locale0);
      DiseaseType diseaseType0 = new DiseaseType();
      Disease disease0 = new Disease("a47", "Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ", diseaseType0);
      Opd opd0 = new Opd(4326, '}', 256, disease0);
      Patient patient0 = new Patient(opd0);
      patient0.setActive(0);
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(4326, 4326, mockGregorianCalendar0, patient0, vaccine0, 256);
      patientVaccine0.getPatient();
      assertEquals(4326, patientVaccine0.getCode());
      assertEquals(256, patientVaccine0.getLock());
      assertEquals(4326, patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Opd opd0 = new Opd((-153), 'U', 2085, (Disease) null);
      Patient patient0 = new Patient(opd0);
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(31, 31, mockGregorianCalendar0, patient0, vaccine0, 2085);
      patient0.setActive((-55));
      patientVaccine0.getPatient();
      assertEquals(31, patientVaccine0.getProgr());
      assertEquals(2085, patientVaccine0.getLock());
      assertEquals(31, patientVaccine0.getCode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Patient patient0 = new Patient(0, "", "", "", mockDate0, 2318, "", '9', "HFQ^DLQ'", "HFQ^DLQ'", "xQRm3DC1Dx2']hIc{)", "xQRm3DC1Dx2']hIc{)", "", "xQRm3DC1Dx2']hIc{)", 'P', "", '9', "xQRm3DC1Dx2']hIc{)", '6', 'X', "", "HFQ^DLQ'", "cuWs2WYf4-3Q++v");
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(2318, 2318, (GregorianCalendar) null, patient0, vaccine0, 2318);
      patientVaccine0.getPatSex();
      assertEquals(2318, patientVaccine0.getLock());
      assertEquals(2318, patientVaccine0.getProgr());
      assertEquals(2318, patientVaccine0.getCode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Opd opd0 = new Opd((-153), 'U', 2085, (Disease) null);
      Patient patient0 = new Patient(opd0);
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(31, 31, mockGregorianCalendar0, patient0, vaccine0, 2085);
      patientVaccine0.getPatSex();
      assertEquals(31, patientVaccine0.getProgr());
      assertEquals(31, patientVaccine0.getCode());
      assertEquals(2085, patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3453), (-2410), (-1228), (-1228), (-2410), (-1228));
      Patient patient0 = new Patient((-2963), (String) null, "mA},+6HFEN'9H#97_", (String) null, (Date) null, (-2410), "mA},+6HFEN'9H#97_", 'b', (String) null, (String) null, "4.[`1#", "", "\"#DSR]L`xofe.MyPM", ")", 'R', ")", 'b', "0w!;", 'R', 'R', "", "", "");
      VaccineType vaccineType0 = new VaccineType();
      Vaccine vaccine0 = new Vaccine("mA},+6HFEN'9H#97_", "4.[`1#", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine((-2410), (-2113), mockGregorianCalendar0, patient0, vaccine0, 0);
      patientVaccine0.getPatName();
      assertEquals((-2113), patientVaccine0.getProgr());
      assertEquals(0, patientVaccine0.getLock());
      assertEquals((-2410), patientVaccine0.getCode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      patientVaccine0.setPatient(patient0);
      String string0 = patientVaccine0.getPatName();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-726), 0);
      MockDate mockDate0 = new MockDate((-151));
      Patient patient0 = new Patient((-151), "", "", "", mockDate0, (-39), "", 'l', "", "4$1mmtlvT_Yx),)Q37^", "org.isf.patvac.model.PatientVaccine", "4$1mmtlvT_Yx),)Q37^", "]LQ9\"EO>l8/G", "4$1mmtlvT_Yx),)Q37^", 'F', "4c'", ',', "", '%', ',', "4c'", "$Nu:PCu", "UB2[kl_VD[]!Lj~0<");
      VaccineType vaccineType0 = new VaccineType("minuteOfDay", "org.isf.patvac.model.PatientVaccine");
      Vaccine vaccine0 = new Vaccine("O35<(1", "]LQ9\"EO>l8/G", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine((-726), (-151), mockGregorianCalendar0, patient0, vaccine0, (-2108));
      patientVaccine0.getPatName();
      assertEquals((-151), patientVaccine0.getProgr());
      assertEquals((-726), patientVaccine0.getCode());
      assertEquals((-2108), patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(74, 0, (-2508), 74, (-1204));
      Disease disease0 = new Disease();
      Opd opd0 = new Opd((-2500), '^', 671, disease0);
      Patient patient0 = new Patient(opd0);
      VaccineType vaccineType0 = new VaccineType();
      Vaccine vaccine0 = new Vaccine("<org_root>.", "N", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine(74, (-2508), mockGregorianCalendar0, patient0, vaccine0, 1873);
      patientVaccine0.getPatAge();
      assertEquals(74, patientVaccine0.getCode());
      assertEquals(1873, patientVaccine0.getLock());
      assertEquals((-2508), patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      MockDate mockDate0 = new MockDate(832, 832, (-1103));
      Patient patient0 = new Patient("Failed to get image", "Failed to get image", mockDate0, (-1103), "Failed to get image", '&', (String) null, "org.isf.patvac.model.PatientVaccine", "=c=xH", "Failed to get image", "=c=xH", '&', "=c=xH", 'X', "org.isf.patvac.model.PatientVaccine", '&', '&', "9N:<Jbv:(u$T8Ob", "=c=xH", "F,*Fae)DZ c`GW");
      patientVaccine0.setPatient(patient0);
      int int0 = patientVaccine0.getPatAge();
      assertEquals((-784), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      int int0 = patientVaccine0.getLock();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      PatientVaccine patientVaccine0 = new PatientVaccine(3661, 1, mockGregorianCalendar0, patient0, (Vaccine) null, (-6010));
      int int0 = patientVaccine0.getLock();
      assertEquals((-6010), int0);
      assertEquals(1, patientVaccine0.getProgr());
      assertEquals(3661, patientVaccine0.getCode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      patientVaccine0.setCode(3303);
      int int0 = patientVaccine0.getCode();
      assertEquals(3303, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(289, 80, (-2600), 0, (-1111), 0);
      DiseaseType diseaseType0 = new DiseaseType();
      Disease disease0 = new Disease("", "", diseaseType0);
      Opd opd0 = new Opd((-90), '*', 1455, disease0);
      Patient patient0 = new Patient(opd0);
      VaccineType vaccineType0 = new VaccineType("gyF0I6(s?X['\"# 4>", ":j+W-tH_");
      Vaccine vaccine0 = new Vaccine("G7", "-]s|F*&C_`p]@UkPg", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine((-1717), (-406), mockGregorianCalendar0, patient0, vaccine0, (-665));
      int int0 = patientVaccine0.getCode();
      assertEquals((-665), patientVaccine0.getLock());
      assertEquals((-1717), int0);
      assertEquals((-406), patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine((-2084), 1464, mockGregorianCalendar0, patient0, vaccine0, 1464);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        patientVaccine0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patientVaccine0.getPatSex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.model.PatientVaccine", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patientVaccine0.getPatAge();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.model.PatientVaccine", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      Vaccine vaccine0 = new Vaccine();
      patientVaccine1.setVaccine(vaccine0);
      patientVaccine0.setVaccine(vaccine0);
      // Undeclared exception!
      try { 
        patientVaccine0.equals(patientVaccine1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.vaccine.model.Vaccine", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      patientVaccine0.setVaccineDate(mockGregorianCalendar0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      boolean boolean0 = patientVaccine1.equals(patientVaccine0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      patientVaccine0.setVaccineDate(mockGregorianCalendar0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      
      patientVaccine1.setVaccineDate(mockGregorianCalendar0);
      boolean boolean0 = patientVaccine1.equals(patientVaccine0);
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(993, (-258), 993, 993, (-258));
      patientVaccine1.setVaccineDate(mockGregorianCalendar0);
      boolean boolean0 = patientVaccine1.equals(patientVaccine0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      
      Vaccine vaccine0 = new Vaccine();
      patientVaccine1.setVaccine(vaccine0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      VaccineType vaccineType0 = new VaccineType("", "org.isf.patvac.model.PatientVaccine");
      Vaccine vaccine0 = new Vaccine("Y6H W{dPAj@Q5:", "", vaccineType0);
      patientVaccine1.setVaccine(vaccine0);
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      
      patientVaccine0.setVaccine(vaccine0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      
      Vaccine vaccine0 = new Vaccine();
      patientVaccine0.setVaccine(vaccine0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      Integer integer0 = new Integer(2067);
      patient0.setCode(integer0);
      Patient patient1 = new Patient(1819, "+Ij\"", "", "+Ij\"", (Date) null, (-1), "+Ij\"", '&', "+Ij\"", "", "+Ij\"", (String) null, "org.isf.patvac.model.PatientVaccine", "org.isf.patvac.model.PatientVaccine", '&', "ConverterManager.alterIntervalConverters", '&', "Faf(e1DpR", '&', '&', "No resource path provided", "{;", "([bo1=C5x:<Ctu");
      patientVaccine0.setPatient(patient1);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      patientVaccine1.setPatient(patient0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      Integer integer0 = new Integer(1819);
      patient0.setCode(integer0);
      patientVaccine0.setPatient(patient0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      Patient patient1 = new Patient();
      patientVaccine1.setPatient(patient1);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(boolean0);
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      Integer integer0 = new Integer(1819);
      patient0.setCode(integer0);
      patientVaccine0.setPatient(patient0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      Patient patient1 = new Patient();
      patientVaccine1.setPatient(patient1);
      boolean boolean0 = patientVaccine1.equals(patientVaccine0);
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      Integer integer0 = new Integer(1819);
      patient0.setCode(integer0);
      patientVaccine0.setPatient(patient0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      
      patientVaccine1.setPatient(patient0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      patientVaccine0.setPatient(patient0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      
      patientVaccine1.setPatient(patient0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      PatientVaccine patientVaccine1 = new PatientVaccine();
      assertTrue(patientVaccine1.equals((Object)patientVaccine0));
      
      Patient patient0 = new Patient();
      patientVaccine1.setPatient(patient0);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Patient patient0 = new Patient();
      patientVaccine0.setPatient(patient0);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(patientVaccine1.equals((Object)patientVaccine0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Vaccine vaccine0 = new Vaccine();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      PatientVaccine patientVaccine1 = new PatientVaccine(1819, 1327, mockGregorianCalendar0, patient0, vaccine0, 1327);
      boolean boolean0 = patientVaccine0.equals(patientVaccine1);
      assertFalse(boolean0);
      assertEquals(1327, patientVaccine1.getLock());
      assertEquals(1819, patientVaccine1.getCode());
      assertEquals(1327, patientVaccine1.getProgr());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      boolean boolean0 = patientVaccine0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      boolean boolean0 = patientVaccine0.equals(patientVaccine0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      boolean boolean0 = patientVaccine0.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine((-2084), 1464, mockGregorianCalendar0, patient0, vaccine0, 1464);
      patientVaccine0.hashCode();
      assertEquals((-2084), patientVaccine0.getCode());
      assertEquals(1464, patientVaccine0.getLock());
      assertEquals(1464, patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      patientVaccine0.hashCode();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(0, 5062500, mockGregorianCalendar0, patient0, vaccine0, 5062500);
      patientVaccine0.getPatAge();
      assertEquals(5062500, patientVaccine0.getProgr());
      assertEquals(0, patientVaccine0.getCode());
      assertEquals(5062500, patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(0, 5062500, mockGregorianCalendar0, patient0, vaccine0, 5062500);
      int int0 = patientVaccine0.getLock();
      assertEquals(5062500, int0);
      assertEquals(0, patientVaccine0.getCode());
      assertEquals(5062500, patientVaccine0.getProgr());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      Vaccine vaccine0 = patientVaccine0.getVaccine();
      assertNull(vaccine0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine((-2084), 1464, mockGregorianCalendar0, patient0, vaccine0, 1464);
      patientVaccine0.getPatSex();
      assertEquals(1464, patientVaccine0.getProgr());
      assertEquals((-2084), patientVaccine0.getCode());
      assertEquals(1464, patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      patientVaccine0.setLock((-3667));
      assertEquals((-3667), patientVaccine0.getLock());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      Vaccine vaccine0 = new Vaccine();
      PatientVaccine patientVaccine0 = new PatientVaccine(0, 5062500, mockGregorianCalendar0, patient0, vaccine0, 5062500);
      int int0 = patientVaccine0.getCode();
      assertEquals(5062500, patientVaccine0.getProgr());
      assertEquals(5062500, patientVaccine0.getLock());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      patientVaccine0.setProgr(3398);
      PatientVaccine patientVaccine1 = new PatientVaccine();
      boolean boolean0 = patientVaccine1.equals(patientVaccine0);
      assertEquals(3398, patientVaccine0.getProgr());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PatientVaccine patientVaccine0 = new PatientVaccine();
      // Undeclared exception!
      try { 
        patientVaccine0.getPatName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.isf.patvac.model.PatientVaccine", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Patient patient0 = new Patient();
      VaccineType vaccineType0 = new VaccineType();
      Vaccine vaccine0 = new Vaccine("", "", vaccineType0);
      PatientVaccine patientVaccine0 = new PatientVaccine((-402), (-3668), mockGregorianCalendar0, patient0, vaccine0, (-1499));
      int int0 = patientVaccine0.getProgr();
      assertEquals((-1499), patientVaccine0.getLock());
      assertEquals((-402), patientVaccine0.getCode());
      assertEquals((-3668), int0);
  }
}
