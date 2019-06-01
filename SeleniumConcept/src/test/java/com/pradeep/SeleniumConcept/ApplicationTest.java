package com.pradeep.SeleniumConcept;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class ApplicationTest {
 
  WebDriver driver;
	
	@Test
	public void getInitialValue(){
		System.setProperty("webdriver.chrome.driver","E:\\Pradeep_Pracite_Purpose\\chrome\\chromedriver.exe");
	   String baseUrl="https://www.google.com/";
	   driver=new ChromeDriver();
	      driver.get("baseUrl");
	      
	     // driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.close();
	}

}
