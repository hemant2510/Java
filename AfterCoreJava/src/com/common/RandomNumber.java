package com.common;

import java.util.Random;

public class RandomNumber {
	Random r=new Random();
	
	public int generator() {
		return r.nextInt(100);
	}

}
