package com.pack.mockito;

public class Calculator {
public int performCalc(CalculatorService a)
{
	System.out.println("Adding here");
	return a.add(3, 7);
}
}
