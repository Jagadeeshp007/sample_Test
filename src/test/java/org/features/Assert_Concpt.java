package org.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assert_Concpt {

	@Test
	private void data_validataion() {
		String expected_name = "jagadeesh";
		String actual_name = "jaga";

		Assert.assertEquals(expected_name, actual_name); // validation is mismatch so failed.

		System.out.println("Data validation successfully"); // it not run

	}
	
	@Test
	private void data_verfication() {
		String expected_name = "jagadeesh";
		String actual_name = "jaga";
		
		SoftAssert s = new SoftAssert();  // validation is mismatch but execute the below line
		s.assertEquals(actual_name, expected_name);
		
		System.out.println("Data verification successfully"); // is is run success
	}

}
