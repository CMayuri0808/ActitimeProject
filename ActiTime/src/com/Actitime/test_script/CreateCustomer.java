package com.Actitime.test_script;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.Generic_Library.Baseclass;
import com.Actitime.Generic_Library.File_lib;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.Taskpage;

public class CreateCustomer extends Baseclass
{
	File_lib flib=new File_lib();
	@Test
	public void createcutomer() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		Homepage hp=new Homepage(driver);
		hp.getTasklnk().click();
		
		Taskpage tp=new Taskpage(driver);
		String custname = flib.readdatafromExcelfile("Sheet1", 4, 1);
		String description = flib.readdatafromExcelfile("Sheet1", 1, 2);
		Thread.sleep(10);
		tp.completetask(custname, description);
		String Expected=custname;
		System.out.println(Expected);
		//String actualdata = driver.findElement(By.xpath("//div[@title='qsp']")).getText();
		String actualdata = driver.findElement(By.xpath("//div[@title='"+custname+"']")).getText();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(Expected, actualdata);
		Reporter.log("Assertion pass",true);
	   s.assertAll();
		
		
		
	}

}

