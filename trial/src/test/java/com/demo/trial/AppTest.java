package com.demo.trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest
{
	@Test
	public void run()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Hello Selenium!");
		driver.close();
		
	}
	
}