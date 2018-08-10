package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Harry_6Test {
	public static Harry_6 hr;
	@BeforeClass
	public static void setUpBeforeClass() {
		hr= new Harry_6();
	}

	@AfterClass
	public static void tearDownAfterClass() {
		hr = null;
	}

	

	@Test
	public void test() {
	assertEquals(true,hr.checkHarry("This is Harry.", "Harry"));
	}
	@Test
	public void test1() {
		assertNotEquals(true,hr.checkHarry("This is Henry.", "Harry"));
	}
}
