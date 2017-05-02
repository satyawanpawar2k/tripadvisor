package com.tripadvisor.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindRestaurant {

	 public WebDriver driver;
	utilsMethods UM = new utilsMethods();
	@BeforeClass
	public void preCondition()
	{
		driver = UM.initBrowser(driver, "chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in");
	}

	@Test
	public void FindRestaurant() throws InterruptedException
	{
		
		driver.findElement(By.id("rdoRestaurants")).click();
		
		WebElement ele=driver.findElement(By.xpath("//input[contains(@value,'City or restaurant name')]"));
		ele.sendKeys("pune,india");
		WebElement element=driver.findElement(By.id("SUBMIT_RESTAURANTS"));
		element.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("Search results: india asia - TripAdvisor"));
		driver.findElement(By.id("SEARCH_BUTTON")).click();
		driver.findElement(By.xpath("//span[contains(text(),'See all results')]")).click();
		System.out.println("hi");
	}
	@AfterClass
	public void postCondition()
	{
	driver.close();
	}
}
