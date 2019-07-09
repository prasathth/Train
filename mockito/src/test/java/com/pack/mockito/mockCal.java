package com.pack.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class mockCal {
	Calculator c = null;
	CalculatorService a = Mockito.mock(CalculatorService.class);
	@Test
	public void test() {
		assertEquals(10,c.performCalc(a));
	}
	
	@Before
public void createobject()
{
	c=new Calculator();
}
}
