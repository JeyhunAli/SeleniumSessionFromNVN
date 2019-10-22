/**
 * Autentication popUp in selenium and how to handle it 
 * to handle it eaither u pass the right credentials to the url right after http for example
 * driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
 * 
 * or i can create the string usernmae or password then i can congat the string to the url for example 
 *    driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
 */
//

package coreSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";

		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
	}

}
