package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe4.LongestSub;

public class LongestSubTest {
	private static LongestSub ls;

	@Before
	public void setUp() throws Exception {
		ls = new LongestSub();
	}

	@After
	public void tearDown() throws Exception {
		ls=null;
	}

	@Test
	public void test1() {
		String res = ls.longests("aabbbbccbbaabbbbaaccaa"); 
		assertEquals("bbaabbbbaa",res);
	}
	
	@Test
	public void test2() {
		String res = ls.longests("aabbcaaccaaaaccbbaa"); 
		assertEquals("aaccaaaacc",res);
	}
	
	@Test
	public void test3() {
		String res = ls.longests("aabbbccbbccccbbccaabb"); 
		assertEquals("ccbbccccbbcc",res);
	}
	
	

}
