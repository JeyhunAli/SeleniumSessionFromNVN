
/**
 * action class for right click as well 
 * right click is not for the browser option ist for the webelement 
 * for the right click in selenium in action class there contextClick method is available 
 * this method is also exaample of method overloading 
 */


package coreSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMeElement = driver.findElement(By.className("context-menu-one"));

		Actions action = new Actions(driver);
		
		action.contextClick(rightClickMeElement).build().perform();
		
		String text = driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
	    String text1 = driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-delete')]/span")).getText();
		System.out.println(text);
		System.out.println(text1);
		
		
		
		
		
		
		
		
	}

}
