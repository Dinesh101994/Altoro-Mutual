package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./src/com/browserDrivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void url() {
		driver.get("http://testfire.net/login.jsp");
	}
	@AfterMethod
	public void browserClose() {
		driver.quit();
	}
}
