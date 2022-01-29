package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


/*@Listeners(com.main.MyListeners.class)*/
public class FirstClassinMaven {
	
	@Test
	public void testMethod1() {
		
	System.out.println("The Method1");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();

				
	} 
	/*@Test
	public void testMethod2() {
		
		Assert.fail();
		
	}
	@Test(dependsOnMethods="testMethod2")
	public void testMethod3()
	{
		
	}
*/
}