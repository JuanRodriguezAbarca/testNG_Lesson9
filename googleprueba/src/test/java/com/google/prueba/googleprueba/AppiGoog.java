package com.google.prueba.googleprueba;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AppiGoog {

	static WebDriver driver;
			
	@BeforeTest
	public void initializeDriver(){
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://google.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void shutDown(){
		driver.quit();
	}
	
	@Test
	public void testingTheGooglePage(){
		List <WebElement> labels = new ArrayList<WebElement>(); 
		
		driver.findElement(By.id("lst-ib")).sendKeys("Thomson Reuters");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		labels = driver.findElements(By.xpath("//div[@id='search']//table//td//a"));
		
		System.out.println("Size labels: "+labels.size());
		
//		labels.remove(0);
		
		for(WebElement label : labels){
			System.out.println(label.getText());
		}
	}

}
