package com;

import static org.junit.Assert.assertEquals;

import org.CalcTest;
import org.junit.Test;

public class J002_CalcTest {

	@Test
	public void addTest()
	{
		CalcTest c = new CalcTest();
		int actual = c.add(10, 20);
		int expected = 30;
		
		assertEquals(expected, actual);
		
		// after this give task to student to-do multiplication. 
		
		
	}
}
