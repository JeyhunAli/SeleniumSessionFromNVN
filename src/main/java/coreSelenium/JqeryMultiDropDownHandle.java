

/**
 * lets say in your web page u have 100 check box and you have to check all of them what will you do at that time 
 *  so let me explain 
 *  first of all i create one generic method im passing my web driver and string value with ... 3 dot its 
 *  returning array so then im storiing all the value in that array 
 *  then starting my outter for loop to get size and all the text then starting my inner loop to get 3 dot array value 
 *  then im starting my if else condition to get all the values in this time i can choose multiple 
 *  check boxes as well but if i want to choose all the check boxes then  
 *  when im calling selectchoisevalue method im passing my web driver then instead of passing all the check boxex name i just pass 
 *  all   keyword----->> then it will select all the check boxes
 *  then finding my web elmenet storing it in 
 *  list web element because return type of the driiver.find element is web element  
 * 
 */


package coreSelenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqeryMultiDropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
/**
 * this also another exapmle of the method overloading 
 * in this example 
 */
		// selectChoiceValues(driver, "choice 6");
		// selectChoiceValues(driver, "choice 6 2 1", "choice 6 2 3", "choice 6
		// 2 2");
		selectChoiceValues(driver, "All");  //this method is selecting all the value from check box 
		
	}

	/**
	 * 
	 * @param driver
	 * @param value
	 * 
	 * generic 
	 */
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		if (!value[0].equalsIgnoreCase("ALL")) {  //this condition is true not will make it false
			for (int i = 0; i < choiceList.size(); i++) {
				System.out.println(choiceList.get(i).getText());
				String text = choiceList.get(i).getText();

				for (int k = 0; k < value.length; k++) {  //this is inner loop representing 3 dot value array 
					
					if (text.equals(value[k])) {            
						choiceList.get(i).click();
						break;
					}
				}
			}
		}

		// select all the values:
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {   
				/**
				 * this try catch block is helping me to avoid on the console to get 
				 * not interactable element exception  because while creating xpath of this dynamic elmeemt it was there 44 match
				 * but it checked only half of them rest is not visible 
				 */
				

			}
		}

	}

}
