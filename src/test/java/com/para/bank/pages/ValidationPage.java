package com.para.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ValidationPage {
	
	WebDriver driver;

	public ValidationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Initializing the WebElement by using FindBy annotation
	@FindBy(xpath = "//h1[contains(text(),'Welcome')]//following::p[1]") WebElement succesfullMsg;
	@FindBy(xpath = "//a[text()='Log Out']") WebElement logout;
	
	public void validateSucessfullMsg(String actualMessage) {
		
		String message = succesfullMsg.getText();

		Reporter.log(message);

		if (actualMessage.equals(actualMessage)) {
			Reporter.log("Actual and expected validation message are same");
			
		} else {
			Reporter.log("Actual and expected validation message are not same");
			Reporter.log("The actual message is " + actualMessage);
			Reporter.log("The expected title is " + actualMessage);
		}
		
		
	}
	
	public void clickLogoutLnk() {
		logout.click();
		Reporter.log("Clicked logout link successfully");
	}
}
