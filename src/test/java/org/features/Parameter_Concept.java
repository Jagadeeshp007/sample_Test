package org.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Concept {

	@Test
	@Parameters({"name","password"}) // XML file to pass the parameter
	private void credentails(String name, @Optional("Default") String password) {
		
		// in case passing parameter is mismatch at a time used @optional value
		
		System.out.println("User Name : " + name);
		System.out.println("Password : " + password);
	}
}
