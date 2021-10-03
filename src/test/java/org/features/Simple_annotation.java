package org.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotation {

	@BeforeSuite
	private void setproperty() {
		System.out.println("set propery");
	}

	@BeforeTest
	private void browser() {
		System.out.println("browser launch");
	}

	@BeforeClass
	private void urlLanunch() {
		System.out.println("Url ..................");
	}

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

	@Test
	private void laptop() {
		System.out.println("Laptop");
	}
	
	@Test
	private void earphone() {
		System.out.println("Earphone");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout\n-------------------------------");
	}

	@AfterClass
	private void homepage() {
		System.out.println("Home Page");
	}

	@AfterTest
	private void close() {
		System.out.println("driver close");
	}

	@AfterSuite
	private void deletecookie() {
		System.out.println("delete all ");
	}

}
