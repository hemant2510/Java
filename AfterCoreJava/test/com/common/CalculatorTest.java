package com.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {

	static Calculator c;
	
	@BeforeClass
	public static void beforeClass() {
		c=new Calculator();
		System.out.println("Inside BeforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("Inside Before");
	}
	
	@Test
	public void testDivide() {
		assertEquals(2,c.divide(10,5));
	}
	
	@Test
	public void testDivide2() {
		//assertEquals(2,c.divide(10,0));
		assertThrows(ArithmeticException.class, ()->c.divide(10,0));
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Inside AfterClass");
	}
	
	@After
	public void after() {
		System.out.println("Inside After");
	}

}
