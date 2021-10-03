package org.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Test {

	@Test(dataProvider = "test_data")
	private void credentails(String name, int Password) {
		System.out.println("user Name : " + name);
		System.out.println("Password : " + Password);
		System.out.println("-----------------------------\n");
	}

	@DataProvider
	private Object[][] test_data() {
		return new Object[][] {

				{ "jagadeesh", 123 }, { "ganesh", 1234 }, { "paraksh", 54321 } };
	}
}
