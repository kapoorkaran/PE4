package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Dog_5Test {
private static Dog_5 reg;
	
	@BeforeClass
	public static void setup() {
	reg = new Dog_5();	
	}

	@AfterClass
	public static void teardown() {
	reg=null;
	}

	@Test
	public void test() {
		assertEquals(new String("a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god"),reg.regEdit("a  brown  kciuq  xof  spmuj  revo  eht  lazy  god"));
		}

	@Test
	public void test2() {
		assertNotEquals(new String("a  quick  nworb  xo revo  eht  yzal  god"),reg.regEdit("a  brown  kciuq  xof  spmuj  revo  eht  lazy  god"));
		}
}
