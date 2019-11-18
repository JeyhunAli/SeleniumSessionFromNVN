

/**
 * while working on web page where there is some web table for that need to create xpath with tr and td 
 * in dom document object model  html tag tr means number of rows td means number of coulmns
 * in selenium we dont have any direct method to handle webtable we have to use xpath concept
 * td most of the time is constant tr is dynamic 
 * 
 * 
 * 
 * in web table handling based on rows and columns breaking xpath into two part and creating before and after xpath 
 * and getting the value from the xpath 
 * 
 */



package coreSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size() - 1;//here minus one means exclude unwanted row
		//here i store in int beacuse return type .size is int 
		System.out.println(rowCount);

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[7]/td[1]

		String beforeXpath = "//*[@id='customers']/tbody/tr[";  //here breaking xpath into two part
		String afterXpath = "]/td[1]";

		for (int rowNum = 2; rowNum <= rowCount + 1; rowNum++) {   //starting from 2 beacuse in web page strart from 2
			String actualXpath = beforeXpath + rowNum + afterXpath;
			//System.out.println(actualXpath);  here i will get all the xpath how? 
			//actualxpath is ref name ----> beforexpath +rowcount+afterxpath al; together its gonna give me all the table xpath
			String value = driver.findElement(By.xpath(actualXpath)).getText();//here getting actual xpath
			System.out.println(value);
			
		}

	}

}