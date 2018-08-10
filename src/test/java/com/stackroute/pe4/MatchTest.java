package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatchTest {
private static Match mt;
	@Before
	public void setUp() {
		mt= new Match();
	}

	@After
	public void tearDown() {
		mt=null;
	}

	@Test
	public void test() {
		String st="Shivangi";
		String st1="hi";
		String st2="1-3";
	assertEquals(st2,mt.meth(st,st1));	
	}
	public void test1() {
		String st="Shivangi";
		String st1="hi";
		String st2="4-8";
	assertNotEquals(st2,mt.meth(st,st1));	
	}
}
