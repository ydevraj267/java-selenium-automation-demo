package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver); 
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLoginButton();
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleIs("Dashboard / nopCommerce administration"));
		
		System.out.println("Title of the page: " +  driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
	}

}
