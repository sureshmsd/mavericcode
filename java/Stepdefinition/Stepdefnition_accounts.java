package Stepdefinition;

import Pages.accounts;
import Pages.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
 
public class Stepdefnition_accounts {
	@Steps
	login loghome =new login();
	accounts acc=new accounts();
	

@Given("^user navigates to login page$")
public void user_navigates_to_login_page() throws Throwable {
		loghome.Home(); 
}
@When("^user navigates to home page \"([^\"]*)\",\"([^\"]*)\"$")
public void user_navigates_to_home_page(String login, String pass) throws Throwable {
	 loghome.loginHome(login, pass);
}
@Then("^user navigates to Accounts page and retrive the Account status\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void user_navigates_to_Accounts_page_and_retrive_the_Account_status(String srch, String balance, String Status) throws Throwable {
	 acc.accounts();
	 acc.accountsOverview_checking(srch, balance, Status); 
}
}

