package com.common;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ComplexNumberTest {

	private ComplexNumber complex1,complex2,complex3;
	
	public ComplexNumberTest(int real1, int imaginary1, int real2, int imaginary2) {
		complex1=new ComplexNumber(real1, imaginary1);
		complex2=new ComplexNumber(real2, imaginary2);
		complex3=new ComplexNumber(real1+real2, imaginary1+imaginary2);
	}

	@Parameters
	public static Collection<Object[]> create() {
		return Arrays.asList(new Object[][] {
			{2,3,3,2},{4,5,5,4}
		});
	}
	
	@Test
	public void testAdd() {
		assertEquals(complex3,complex1.add(complex2));
	}

}
