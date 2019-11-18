package coreSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectPart_2 {

	static WebDriver driver;


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.com/");




		/**
		 * select without select class 1st creating xpath 
		 * here while creating xpath of the dropdown i used option but its not mandatory whateveer the tag is there need to use 
		 * that tag name in order to achive selection without select class 
		 * then getting exact size of that 
		 */
		List<WebElement> listOfDropAllButton = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(listOfDropAllButton.size());


		/**
		 * Storing inside for loop getting size iterating getting text then printing 
		 */
		for (int i=0; i<listOfDropAllButton.size(); i++) {
			String list = listOfDropAllButton.get(i).getText();
			System.out.println(list);




			/**
			 * after printing if i want to choose any option from drop down list then using if else condition with break concept 
			 * entire this code i can make like generic then every time when i need i can call this method to select some option
			 * without select class 
			 */
			if (list.equals("Handmade")) {
				listOfDropAllButton.get(i).click();
				break;
			}	
		}


	}

}
