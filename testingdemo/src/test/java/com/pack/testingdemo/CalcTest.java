package com.pack.testingdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	Calc c ;
	@Test
	public void testadd() {
	     assertEquals(2,c.add(1, 1));
	}
	@Test
	public void testsub()
	{
		assertEquals(-4,c.sub(7,11));
	}
	@Test
	public void testcompa()
	{
		assertEquals(true,c.compa(3, 3));
		assertTrue(c.compa(590, 590));
	}
	
	@Before
	public void createobject()
	{
		c = new Calc();
	}
	@After
	public void removeobject()
	{
		c = null;
	}
}
