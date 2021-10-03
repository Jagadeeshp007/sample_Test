package org.features;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)// mention the exception
	private void demo() {
		
		int a = 10;
		System.out.println(a/0); // it throw the exception
	}

}
