package com.para.bank.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.para.bank.pages.HomePage;
import com.para.bank.pages.RegisterPage;
import com.para.bank.pages.ValidationPage;

public class ParaBankRegisterDemo {

	public WebDriver driver;

	@Test (priority =1)
	public void launchApplication() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://parabank.parasoft.com/parabank/register.htm";
		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log("Application is Launched");

	}

	@Test(priority =2)
	public void navigateToRegisterDemoScreen() {

		HomePage navigateToRegisterDemoScreen = PageFactory.initElements(driver, HomePage.class);
		navigateToRegisterDemoScreen.selectRegisterLnk();


	}


	@Test(priority =3)
	public void registerUser() {
		RegisterPage registerUser = PageFactory.initElements(driver, RegisterPage.class);
		
		registerUser.validateRegisterTitle();
		registerUser.enterFirstName("mohammad");
		registerUser.enterLastName("Salman");
		registerUser.enterStreetAddress("14 Avenue");
		registerUser.enterCity("Noida");
		registerUser.enterState("Uttar Pradesh");
		registerUser.enterZipCode("232101");
		registerUser.enterPhoneNumber("7766543210");
		registerUser.enterSSN("123456");
		registerUser.enterUsername("gdfgdfgdfg");
		registerUser.enterPassword("acgfdret");
		registerUser.enterConfrmPassword("acgfdret");
		registerUser.clickRegisterBtn();

	}

	@Test(priority =4)
	public void validateSuccessfulMessage() {

		ValidationPage validateSuccessfulMessage = PageFactory.initElements(driver, ValidationPage.class);
		validateSuccessfulMessage.validateSucessfullMsg("Your account was created successfully. You are now logged in.");
		

	}

	@Test(priority =5)
	public void logoutUser() {
		ValidationPage logoutUser = PageFactory.initElements(driver, ValidationPage.class);
		logoutUser.clickLogoutLnk();

	}

	@Test(priority =6)
	public void closedApplication() {
		driver.quit();
		Reporter.log("Application is closed");

	}


}
