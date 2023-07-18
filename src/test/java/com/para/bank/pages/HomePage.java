package com.para.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	//Initializing the WebElement by using FindBy annotation
	@FindBy(xpath = "//a[text()='Register']") WebElement registerLnk;
	
	

	//Reusable method
	
	public void selectRegisterLnk() {
		registerLnk.click();
		
		Reporter.log("Register button clicked successfully");
	}
}
