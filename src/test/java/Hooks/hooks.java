package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	// @Before 
	// m1(order =1) can also assign order
	// also pass scenario and get the scenario name 
	@Before(order =1)
	public static void beforeLaunch(Scenario sc) {
		System.out.println("Before launch");
		System.out.println("Scenario Name"+ sc.getName());

	}
	
	@After(order =1)
	public static void afterTest() {
		System.out.println("tear down or release resources");

	}
//// part of new cucmber	
//	@Before(order =1)
//	public static void takeScreenShot() {
//		System.out.println("take the screen shot");
//
//	}
//// part of new cucumber 
//	@AfterStep(order =1)
//	public static void takeScreenShot() {
//		System.out.println("take the screen shot");
//
//	}
}
