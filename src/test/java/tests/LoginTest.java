package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.ExtentReportManager;
import utils.Log;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() throws InterruptedException {
		Log.info("Starting Test: Login Test");
		test = ExtentReportManager.createTest("Login Test");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Entering Credentials");
		test.info("Adding credentials");
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLoginButton();
		test.info("Clicked Login button");

		Log.info("Waiting for page to load");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleIs("Dashboard / nopCommerce administration"));

		test.info("Verifying Page Title");
		System.out.println("Title of the page: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration12");
		test.pass("Login Successful");
	}
}
