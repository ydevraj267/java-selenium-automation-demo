package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver _driver;
	private By usernameTextBox = By.id("Email");
	private By passwordTextBox = By.id("Password");
	private By loginButton = By.cssSelector(".login-button");
	
	public LoginPage(WebDriver driver) {
		this._driver = driver;
	}
	
	public void enterUsername(String username) {
		_driver.findElement(usernameTextBox).clear();
		_driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		_driver.findElement(passwordTextBox).clear();
		_driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickLoginButton() {
		_driver.findElement(loginButton).click();
	}
}
