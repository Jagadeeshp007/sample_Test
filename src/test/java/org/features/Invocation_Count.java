package org.features;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = 1)
	private void browser() {
		System.out.println("Browser Launch");
	}

	@Test(invocationCount = 3, priority = 2)
	private void refresh() {
		System.out.println("refresh");
	}

	@Test(priority = 3)
	private void nextpage() {
		System.out.println("Next Page");
	}
}
