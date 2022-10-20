package com.demo.capstoneproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateRegistration {
	WebDriver driver;
	@BeforeClass
	public void config() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
  @Test
  public void f() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://localhost:4200/signup");
	
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputEmail4")).sendKeys("Chandru");	
		driver.findElement(By.id("inputEmail4")).sendKeys("chandru12@gmail.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("12345");
		Thread.sleep(6000);
		driver.findElement(By.id("inputPassword4")).sendKeys("12345");
		Thread.sleep(4000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
  }

  @AfterClass
		public void afterClass() {
			System.out.println("After Class ");
		}
 
}
