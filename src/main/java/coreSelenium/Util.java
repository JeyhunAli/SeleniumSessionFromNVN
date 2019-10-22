package coreSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;
/**
 * creating constructor to add the driver and to avoid hard coding over and over just call class and its gonna come all together 
 * @param driver
 */
	public Util(WebDriver driver) {  
	
	
		this.driver = driver;
	}

	/**
	 * in selenium most important method is to get web element because we are testing automating everythng on basis of the 
	 * web elements because of that im creating one generic method like getwebelemet method on my utility class 
	 * then everytime when i need to get and test any elment i m just calling that method and passing the web element 
	 * this time im just using page object with By class 
	 * 
	 * This method is used to create the webElement on the basis of By locator.
	 * 
	 * how to handle exception handling in selenium let me explain 
	 * here below method telling me hey jeyhun im handlinig any kind web element and any kind exception
	 * lets say my locator is perfectly fine then it will return my element if some exception comes it will print below message 
	 * but if some error or some web elemenet not there it will return null 
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some exception occurred while creating the webelement....");
			System.out.println(e.getMessage());
		}
		return element;
	}
//generic method for explicitly wait element 
	public void waitForElementPresent(By locator, int timeOut) {  
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
 ////generic method for explicitly wait for title 
	public String waitForTitlePresent(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	/**
	 * This method is used to click on element
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("some exception occurred while clicking on the webelement....");
			System.out.println(e.getMessage());

		}
	}

	/**
	 * This method is used to pass the values in a webelement
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("some exception occurred while passing value to the webelement....");
			System.out.println(e.getMessage());

		}
	}

}