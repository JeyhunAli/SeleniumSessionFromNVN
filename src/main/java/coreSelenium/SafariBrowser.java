package coreSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariBrowser {

	
	static WebDriver driver;	
	
	
	
	public static void main(String[] args) {

	WebDriverManager.getInstance(SafariDriver.class).setup();
	
	driver = new SafariDriver();
	driver.get("https://www.google.com/");
		
		
	}

	
	
	
	
	
	
	
}
