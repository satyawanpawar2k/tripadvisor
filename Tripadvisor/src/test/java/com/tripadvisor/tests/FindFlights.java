/**
 * 
 */
package com.tripadvisor.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author satyawan.pawar
 *
 */
public class FindFlights {

	WebDriver driver;
	utilsMethods UM = new utilsMethods();
	@Test
	public void findFlights(){
		UM.initBrowser(driver, "chrome");
	}
}
