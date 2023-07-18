package com.para.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	//Initializing the WebElement by using FindBy annotation
	@FindBy(xpath = "//h1[text()='Signing up is easy!']") WebElement registerTitle;
	@FindBy(xpath = "//*[@id='customer.firstName']") WebElement firstName;
	@FindBy(xpath = "//*[@id='customer.lastName']") WebElement lastName;
	@FindBy(xpath = "//*[@name='customer.address.street']") WebElement addressLine;
	@FindBy(xpath = "//*[@id='customer.address.city']") WebElement cityName;
	@FindBy(xpath = "//*[@id='customer.address.state']") WebElement stateName;
	@FindBy(xpath = "//*[@id='customer.address.zipCode']") WebElement zipCode;
	@FindBy(xpath = "//*[@name='customer.phoneNumber']") WebElement phoneNumber;
	@FindBy(xpath = "//*[@id='customer.ssn']") WebElement ssnNumber;
	@FindBy(xpath = "//*[@name='customer.username']") WebElement enterUser;
	@FindBy(xpath = "//*[@id='customer.password']") WebElement enterPassword;
	@FindBy(xpath = "//*[@id='repeatedPassword']") WebElement confrmPassword;
	@FindBy(xpath = "//*[starts-with(@value,'Register')]") WebElement registerBtn;

	//Reusable methods

	public void validateRegisterTitle() {
		String actualTitle = registerTitle.getText();
		String expecTitle = "Signing up is easy!";
		if (actualTitle.equals(expecTitle)) {
			Reporter.log("Actual and expected title are same");
			Reporter.log("The title of the page is " + actualTitle);
		} else {
			Reporter.log("Actual and expected title are same");
			Reporter.log("The actual title is " + actualTitle);
			Reporter.log("The expected title is " + expecTitle);
		}
	}
	public void enterFirstName(String fname) {
		if (firstName.isDisplayed()) {

			Reporter.log("First name is displayed");

			// Enter first name
			firstName.sendKeys(fname);
			Reporter.log("First name value is " + fname);
		} else {

			Reporter.log("First name is displayed");
		}
	}

	public void enterLastName(String lname) {
		// Last name is displayed

		if (lastName.isDisplayed()) {

			Reporter.log("Last name is displayed");

			// Enter the last name
			lastName.sendKeys(lname);
			Reporter.log("Last name value is " + lname);
		} else {

			Reporter.log("Last name is not displayed");
		}
	}

	public void enterStreetAddress(String saddress) {
		// Address is displayed
		if (addressLine.isDisplayed()) {
			Reporter.log("Address line is displayed");

			// enter the address
			addressLine.sendKeys(saddress);
			Reporter.log("Address line value is " + saddress);
		} else {
			Reporter.log("Address line is not displayed");
		}
	}

	public void enterCity(String cityValue) {

		// City is displayed
		if (cityName.isDisplayed()) {
			Reporter.log("City name is displayed");

			// Enter the city name
			cityName.sendKeys(cityValue);
			Reporter.log("City name is " + cityValue);
		} else {
			Reporter.log("City name is not displayed");
		}
	}

	public void enterState(String stateValue) {

		// State is displayed
		if (stateName.isDisplayed()) {
			Reporter.log("State name is displayed");

			// enter state name
			stateName.sendKeys(stateValue);
			Reporter.log("City name is " + stateValue);

		} else {
			Reporter.log("City name is not displayed");
		}
	}

	public void enterZipCode(String zipValue) {

		if (zipCode.isDisplayed()) {
			Reporter.log("Zip Code  is displayed");

			// enter zip code
			zipCode.sendKeys(zipValue);
			Reporter.log("Zip Code  is " + zipValue);
		} else {
			Reporter.log("Zip Code  is not displayed");
		}
	}

	public void enterPhoneNumber(String phoneValue) {

		if (phoneNumber.isDisplayed()) {
			Reporter.log("Phone number is displayed");

			// enter phone number
			phoneNumber.sendKeys(phoneValue);
			Reporter.log("Phone number is " + phoneValue);
		} else {
			Reporter.log("Phone number is not displayed");
		}
	}

	public void enterSSN(String ssnValue) {

		// SSN number is displayed
		if (ssnNumber.isDisplayed()) {
			Reporter.log("SSN number is displayed");

			// enter phone number
			ssnNumber.sendKeys(ssnValue);
			Reporter.log("SSN number is " + ssnValue);
		} else {
			Reporter.log("SSN number is not displayed");
		}
	}

	public void enterUsername(String userValue) {

		// Username is displayed

		if (enterUser.isDisplayed()) {
			Reporter.log("Username is displayed");

			// enter phone number
			enterUser.sendKeys(userValue);
			Reporter.log("Username is " + userValue);
		} else {
			Reporter.log("Username is not displayed");
		}
	}

	public void enterPassword(String passValue) {
		// Username is displayed

		if (enterPassword.isDisplayed()) {
			Reporter.log("Password is displayed");

			// enter phone number
			enterPassword.sendKeys(passValue);
			Reporter.log("Password is " + passValue);
		} else {
			Reporter.log("Password is not displayed");
		}
	}

	public void enterConfrmPassword(String cfnPassValue) {

		// Username is displayed

		if (confrmPassword.isDisplayed()) {
			Reporter.log("Confirm Password is displayed");

			// enter phone number
			confrmPassword.sendKeys(cfnPassValue);
			Reporter.log("Confirm Password is " + cfnPassValue);
		} else {
			Reporter.log("Confirm Password is not displayed");
		}
	}

	public void clickRegisterBtn() {
		// check whether submit button is enabled
		if (registerBtn.isEnabled()) {
			Reporter.log("Register Button is enabled");
			registerBtn.click();
		} else {
			Reporter.log("Register Button is not enabled");
		}
	}

}
