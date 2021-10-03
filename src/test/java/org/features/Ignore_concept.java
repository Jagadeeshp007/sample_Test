package org.features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

//	@Ignore
	@Test
	private void laptop() {
		System.out.println("Laptop");
	}

	@Test(enabled = false)
	private void mobile() {
		System.out.println("MObile");
	}

	@Test
	private void powerBank() {
		System.out.println("power Bank");
	}

	@Test
	private void earphone() {

		System.out.println("earphone");
	}

	@AfterMethod
	private void logout() {
		System.out.println("Logout\n******************************");
	}

}
