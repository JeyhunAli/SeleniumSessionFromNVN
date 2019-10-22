
/**
 * 
 * diffreneces between normal send keys and action class send keys 
 * normally we use normal sendkesys in any adding credentials but lets say sometimes some text boxes not working at time 
 * i use action class send keys 
 * here differences is normal send keys it works just adding all the particular credentials 
 * but action class send keys theres internal move to element method it moves the element then passing the credentials 
 * 
 * 
 */


package coreSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		Actions action = new Actions(driver);
		action.sendKeys(emailId, "test@gmail.com").build().perform();
		action.sendKeys(password, "test@123").build().perform();
		action.click(loginButton).build().perform();

		
		
		
	}

}