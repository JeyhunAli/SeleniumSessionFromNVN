package coreSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		// page objects:
		By emailid = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");

		Util util = new Util(driver);   // creaating util class object passing constructor driver

		String title = util.waitForTitlePresent("HubSpot", 10);
		System.out.println(title);

		util.waitForElementPresent(emailid, 15);
		util.doSendKeys(emailid, "Ali-ceyhun@list.ru");

		util.doSendKeys(password, "test@123");

		util.waitForElementPresent(loginButton, 5);
		util.doClick(loginButton);

	}

}

