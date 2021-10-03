package org.features;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(priority = 1)
	private void browser() {
		System.out.println("Browser Launch");
	}

	@Test(priority = 2)
	private void username() {
		System.out.println("User Name");
	}

	@Test(priority = 3)
	private void password() {
		System.out.println("Password");
	}

	@Test(priority = 4)
	private void login() {
		System.out.println("Login");
	}

}
