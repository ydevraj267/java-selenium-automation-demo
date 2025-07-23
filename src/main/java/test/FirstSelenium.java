package test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		System.out.println(driver.getTitle());

		driver.findElement(By.id(null));

		driver.quit();
	}
}
