package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OccurrencesTest {
	private static Occurrences o;

	@Before
	public void setUp() throws Exception {
		o = new Occurrences();
		
	}

	@After
	public void tearDown() throws Exception {
		o = null;
	}

	@Test
	public void test1() {
		String res = "Java is java again java again";
		String c = "a"; 
		assertEquals(10,o.count(res,c));
	}
	
	@Test
	public void test2() {
		String res = "Hello low low";
		String c = "l"; 
		assertEquals(4,o.count(res,c));
	}
	
	@Test
	public void test3() {
		String res = "Blahhh Blahhhh";
		String c = "a"; 
		assertNotEquals(7,o.count(res,c));
	}

}
