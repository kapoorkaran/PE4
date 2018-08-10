package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class Setup_1Test {

	private static Setup_1 set;
	
	@BeforeClass
	public static void setup() {
	set = new Setup_1();	
	}

	@AfterClass
	public static void teardown() {
	set=null;
	}

	@Test
	public void testAlpha(){
		boolean pass=set.alphaCheck("abcdef");
		assertEquals(true,pass);
	}
	
	@Test
	public void TestConsecutive() {
		boolean fail=set.alphaCheck("pqrst");
		assertEquals(true,fail);		
	}
	
	
	
	
	
}
