package coreSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectChoises {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		
		
		selectChoiceValues(driver, "choice 6");
	    selectChoiceValues(driver, "choice 6 2 1");
	    selectChoiceValues(driver, "choise 2 3");
	    /**
	     * below line is representing array 
	     * in the method value given ... 3 dot its representing array at the same time to choose multiple selections 
	     */
	  selectChoiceValues(driver, "choice 6 2 1", "choice 6 2 3", "choice 6 2 2");
	   
	}
	
	
	public static void selectChoiceValues(WebDriver driver, String...value) {
		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		
		for (int i = 0; i < choiceList.size(); i++) {
			System.out.println(choiceList.get(i).getText());
			String text = choiceList.get(i).getText();
	        if (text.equals(value)) {
			choiceList.get(i).click();
			break;
		}
		}	

		
		
		
		}	
		

}
