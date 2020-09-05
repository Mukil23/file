package cucumber.com.sample_cucumber;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selinium.base;

public class logIn extends base {
	@Given("^enter the browser and page$")
	public void enter_the_browser_and_page() throws Throwable {
		
		launchApp("https://www.facebook.com/");
		
	}


	@When("^user enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String arg1, String arg2) throws Throwable {
         LoginPage x=new LoginPage();
         entryText(x.getEmail(),arg1);
         entryText(x.getPass(), arg2);
	}

	@Then("^user click login button$")
	public void user_click_login_button() throws Throwable {
		LoginPage x=new LoginPage();
		clickButton(x.getClickButton());
	}

	@Then("^user verify the login$")
	public void user_verify_the_login() throws Throwable {
		System.out.println("verify");
	}
	


}
