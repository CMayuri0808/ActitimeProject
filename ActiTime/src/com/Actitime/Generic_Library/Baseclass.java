package com.Actitime.Generic_Library;

import java.io.IOException;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.Actitime.pom.Homepage;
import com.Actitime.pom.Loginpage;

public class Baseclass {//generic class
	File_lib f=new File_lib();
public static WebDriver driver;

	
@BeforeSuite 
public void databaseconnection() //generic method
{
	Reporter.log("Database connected",true);
}

@AfterSuite
public void Databasedisconnection() {
	Reporter.log("Database disconnected",true);
}

@BeforeClass
public void launchbrowser() throws IOException {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("https://demo.actitime.com/");
	String url = f.readdatafromPropertyfile("url");
	driver.get(url);
	Reporter.log("browser launched successfully",true);
}

@AfterClass
public void closebrowser() {
driver.close();
Reporter.log("Browser closed succesfully",true);
}

@BeforeMethod
public void loginActitime() throws IOException {
	String un = f.readdatafromPropertyfile("username");
	String pwd = f.readdatafromPropertyfile("password");
	Loginpage lp=new Loginpage(driver);
	lp.login(un, pwd);
	//driver.findElement(By.id("username")).sendKeys(un);
	//driver.findElement(By.name("pwd")).sendKeys(pwd);
	//driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("login successfully",true);
	}

@AfterMethod
public void logoutActitime() throws InterruptedException {
	//Thread.sleep(2000);
	Homepage hp=new Homepage(driver);
	hp.getLgoutlnk().click();
	//driver.findElement(By.xpath("//a[.='Logout']")).click();
	Reporter.log("logout from Actitime",true);
}
//@Test
//public void createcust(){
//	Reporter.log("byee",true);
}











