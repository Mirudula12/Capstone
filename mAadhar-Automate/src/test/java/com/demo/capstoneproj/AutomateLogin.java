package com.demo.capstoneproj;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class AutomateLogin {
	WebDriver driver;
	@BeforeClass
	public void config() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
  @Test
  public void f() throws InterruptedException {

		driver.get("http://localhost:4200/login");
		Thread.sleep(2000);
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("Chandru");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
  }
 
  
  @AfterClass
		public void afterClass() {
			System.out.println("After Class ");
		}
}

	