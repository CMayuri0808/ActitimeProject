package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement newcustname;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	//@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	//private WebElement dropdwnbtn;
	
	//@FindBy(xpath="(//div[.='Our company'])[10]")
	//private WebElement ourcomp;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcust;
	
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustname() {
		return newcustname;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	//public WebElement getDropdwnbtn() {
		//return dropdwnbtn;
	//}

	//public WebElement getOurcomp() {
	//	return ourcomp;
	//}

	public WebElement getCreatecust() {
		return createcust;
	}
	
	//Business logic or Generic method
	//create nonstatic method
	public void completetask(String name,String desc) {
		addnewbtn.click();
		newcustname.click();
		custname.sendKeys(name);
		custdesc.sendKeys(desc);
		//dropdwnbtn.click();
		//ourcomp.click();
	    
		createcust.click();
		
	
	

}}
