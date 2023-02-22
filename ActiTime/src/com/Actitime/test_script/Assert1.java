//asertion---21/2/23

//hard assert-all the static methods present in assert class
//assert.assertequals
//assertequals=both are same then the result is passed or failed
//assertnotequals==both are different



package com.Actitime.test_script;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Assert1 {
	public void demoAssertion() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String expectedtitle = "Google";
		String Actualtitle = driver.getTitle();
		//if (expectedtitle.equals(Actualtitle)) {
		//	System.out.println("title is matching");
		//} else {
		//	System.out.println("title is not matching");
		//}
		         Assert.assertEquals(expectedtitle, Actualtitle);
		driver.close();
	}

}
                                                                   