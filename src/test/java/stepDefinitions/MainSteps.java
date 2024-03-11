package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on Netbanking Landing page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("User is on Netbanking Landing page");
	}

	@Given("User is on Practice Landing page")
	public void user_is_on_practice_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Practice Landing page");
	}

	@When("User signup into the application")
	public void user_signup_into_the_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	//@When("User login into the application with {string} and password {string}")
	//public void user_login_into_the_application_with_and_password(String username, String password) {
	//    // Write code here that turns the phrase above into concrete actions
	//	 System.out.println(username +" and password is "+ password);
	//}
	@When("^User login into the application with (.+) and password (.+)$")
	public void user_login_into_the_application_with_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(username +" and password is "+ password);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");

	}

	@Then("cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
		
	}

	@Given ("setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("###################");
		System.out.println(" setup the entries in dtabase");
	}

	@When ("launch the browser from config variables")
	public void LaunchTheBrowser() {
		System.out.println("launch the browser from config variables");

	}

	@When ("hit the home page url of banking site")
	public void HitTheBankingSite() {
		System.out.println("hit the home page url of banking site");

	}
}
