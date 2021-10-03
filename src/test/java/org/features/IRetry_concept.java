package org.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetry_concept {

	// it is retryAnalyzer concept

//	@Test(retryAnalyzer = Retry_class.class)
//	private void username() {
//		String actual_name = "jagadeesh";
//		String excpted_name = "jaga";
//
//		Assert.assertEquals(actual_name, excpted_name);
//
//		System.out.println("username is correct");
//
//	}

	// it is work on IRetry_transformer

	@Test
	private void username() {
		String actual_name = "jagadeesh";
		String exepted_name = "jaga";

		Assert.assertEquals(actual_name, exepted_name);

		System.out.println("Username is correct");
	}

	@Test
	private void password() {
		String actual_pass = "jaga123";
		String exepted_pass = "jaga1234";

		Assert.assertEquals(actual_pass, exepted_pass);

		System.out.println("passwrod is correct");
	}
}
