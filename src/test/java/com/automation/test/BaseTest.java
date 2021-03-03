package com.automation.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.automation.page.AddUserPage;
import com.automation.page.ForgetPasswordPage;
import com.automation.page.HomePage;
import com.automation.page.LoginPage;
import com.automation.page.UserListingPage;
import com.automation.utils.PropertyReader;

public abstract class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	ForgetPasswordPage forgetPassPage;
	UserListingPage userListingPage;
	AddUserPage addUserPage;

	@BeforeSuite
	public void setUp() {
		PropertyReader.initProperty();
		System.setProperty("webdriver.chrome.driver", "src//test//resources//webdrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		initPageObject();
	}

	public void initPageObject() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		forgetPassPage = new ForgetPasswordPage(driver);
		userListingPage = new UserListingPage(driver);
		addUserPage = new AddUserPage(driver);
	}

	@AfterSuite
	public void cleanUp() {
		driver.quit();
	}

}
