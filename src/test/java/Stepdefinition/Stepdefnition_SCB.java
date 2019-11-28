package Stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Pages.login;
import Pages.loginpom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
 
public class Stepdefnition_SCB   {
	
	public static  WebDriver drive;
	
	
	
	@Given("^user enter the given url$")
	public void user_enter_the_given_url() throws Throwable {
		
		login log =new login();
		log.Home();
		log.createpayee();
		}
		

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
	    
	}

	@Then("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
	    
	}


	
	


}

