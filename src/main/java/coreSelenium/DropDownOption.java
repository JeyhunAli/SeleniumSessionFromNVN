package coreSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOption {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		WebElement allButton = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(allButton);
		
		List<WebElement> listofAll = select.getOptions();
		
		System.out.print("list of all button " + listofAll.size());

		for (int i = 0; i<listofAll.size(); i++) {
			String text = listofAll.get(i).getText();
			System.out.println(text);
		}
		
		
		/**
		 * option method helps to get list of drop down 
		 */
		
		
		driver.quit();
	}

}
