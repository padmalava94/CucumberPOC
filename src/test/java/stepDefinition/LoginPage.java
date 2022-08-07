package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginPage {
	
	WebDriver driver;
	
	@Given("Customer opens the browser and launch the application")
	public void customer_opens_the_browser_and_launch_the_application() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\My_Worksspace\\CucumberPOC\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
	    
		
	}

	@When("Customer is on homepage")
	public void customer_is_on_homepage() {
	    
		
	}

	@Then("Customer clicks on Accounts button")
	public void customer_clicks_on_accounts_button() {
	    
		
	}

	@Then("Clicks on customer login option")
	public void clicks_on_customer_login_option() {
	    
		
	}

	@Then("Customer enters username as {string} and password as {string}")
	public void customer_enters_username_as_and_password_as(String string, String string2) {
	  
	}

	@Then("Clicks on Login button")
	public void clicks_on_login_button() {
	   
	}

}
