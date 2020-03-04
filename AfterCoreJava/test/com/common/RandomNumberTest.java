package com.common;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RandomNumberTest {
	
	private RandomNumber random;

	public RandomNumberTest() {
		
	}
	
	@Parameters
	public static Collection randomNo() {
		return Arrays.asList(new Object[][] {
			{},{},{}
		});
	}
	
	@Before
	public void initialize() {
		random=new RandomNumber();
	}
	@Test
	public void testGenerator() {
		assertTrue(random.generator()<100);
	}

}
