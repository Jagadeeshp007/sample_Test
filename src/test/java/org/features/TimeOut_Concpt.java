package org.features;

import org.testng.annotations.Test;

public class TimeOut_Concpt {

	@Test(timeOut = 5000) // this time to use execute 
	private void login() throws InterruptedException {
		
		System.out.println("username");
		
		System.out.println("password");
		
		Thread.sleep(1000); // This is internal time
		
		System.out.println("login");
		
		Thread.sleep(3000); 
		
		System.out.println("Navigate To home page");
	}
}
