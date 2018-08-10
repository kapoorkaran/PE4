package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReplaceTest {
	private static Replace r;

	@Before
	public void setUp() throws Exception {
		r = new Replace();
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void test1() {
		String res = "daily dry";
		assertEquals("faity fry",r.replace(res));
	}

	@Test
	public void test2() {
		String res = "hello dear";
		assertEquals("hetto fear",r.replace(res));
	}
	
	@Test
	public void test3() {
		String res = "done lang";
		assertEquals("fone tang",r.replace(res));
	}
}
