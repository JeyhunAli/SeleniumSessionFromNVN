

/**
 * 
 * explicitly wait is also dynamic but its more powerfull than implicitly wait 
 * when we declare WebDriverWait wait1 = new WebDriverWait(driver, 20); im passing driver and the time to the praenthesis
 * after that another method wait.expectedConditions.presence of elmement and im passing the element reference variable name in there 
 * and another important thing when implicitly wait failed it throws no such element exception 
 * but explicitly wait throws timeOut exception on the console 
 * explicitly wait is not a global wait its for specific element
 * for example there some situation web page is loading little late but test scripts running fast 
 * at time if i want to get the title of the page with implicitly wait 
 * first of all its not for title its for web element second its not gonna give me right title 
 * for that always its more useful to use explicitly wait and  i use ExpectedConditions.titleContains method to get the title at 
 * that time its gonna give me exact title and when i will start to use my hard assertion its not gonna throw some exception 
 * another advantages of explitcly wait i can handle web elements and as well as non webelements like title url 
 * 
 * 
 * <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * check the Util.java class for util generic method in about explicitly wait u create one generic method and every time 
 * when its needed just calling that particular method 
 * 
 * applied generic method in loginPage.java check it out 
 * how to call generic explicitly wait 
 * 
 */

package coreSelenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HusSpotLoginPageExplicitWait {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.titleContains("HubSpot"));
		
		System.out.println(driver.getTitle());		
		
		By emailid = By.id("username");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
		//Exception in thread "main" org.openqa.selenium.TimeoutException: 
		//Expected condition failed: waiting for presence of element located by: By.id: username 
		//(tried for 3 second(s) with 500 milliseconds interval)

		WebElement email = driver.findElement(emailid);
		email.sendKeys("test@gmail.com");
		
//		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		password.sendKeys("test123");
		loginButton.click();
		
		
		
		
	}

}