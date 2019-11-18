package coreSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";

		DropDownUtil.selectDropDownValueWithoutSelect(driver, day, "13");
		DropDownUtil.selectDropDownValueWithoutSelect(driver, month, "Jun");
		DropDownUtil.selectDropDownValueWithoutSelect(driver, year, "1987");

/**
 * here in this class im trying to select values from webPages without using select class 
 * for that two things need to remember 
 * 1st for loop to get all the size 
 * 2nd after getting size need to choose one of the value without select class so how to do that 
 * in this case java comes to the picture for that i m gonna use if else candition 
 * to see all the codes how i chooese without select class check the dropdownutill class 
 * 
 * 1st we have to find xpath of the drop down driver.findelement then click that particular element
 * 2nd finding xpath of the first option of dropdwon menu after finding xpath stroring in list of web elmenet then getting 
 * size text printing all the value on the console 
 * but lets say my target to select multiple value from drop down how to that 
 * for that im making my method as generic passing parameters web driver then string with three dot String  ...  value like this 
 * then starting my for loop concept under driver.find element then if else statement selecting one then break 
 * return type of three dot in java is Array 
 * after adding three dot as paramater for that another inner for loop then if else and break 
 * if i want to select all the values from drop down simple pass after method name driver and "All" inside called method 
 * and covering it with try catch block if any exception comes it will handle it 
 * 
 * 
 * while doing the select drop down if in html dom i can see the tag of the select then select class is compulsory 
 * other vise no 
 * 
 * in select class there another method is   isMultiple this method is returning boolean value true or false 
 * its used to whenever i have more selection just to verification 
 * 
 * 
 * there three method under select class select by visible text 
 * select by index , select by value 
 * select by index is not recommended if the position of the index changed then need to maintain it again 
 * 
 * there isMultiple method inside select class return type is boolean true or false direct sop and get to know all the values selected or no 
 * 
 * 
 * 
 */
	}





}
