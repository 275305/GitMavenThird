package com.pradeep.SeleniumConcept;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 
	WebDriver driver;
	
	@Test
	public void getInitialValue(){
		System.setProperty("webdriver.chrome.driver","E:\\Pradeep_Pracite_Purpose\\SeleniumConcept\\lib\\chromedriver.exe");
	   String baseUrl="https://www.google.com/";
	   driver=new ChromeDriver();
	      driver.get("baseUrl");
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.close();
	}
}
