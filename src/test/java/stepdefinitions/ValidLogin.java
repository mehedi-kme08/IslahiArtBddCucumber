package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook;
import pom.LoginPage;

public class ValidLogin {
	WebDriver driver;
	LoginPage login;
	
	public ValidLogin() {
		this.driver = Hook.driver;
		this.login = new LoginPage(driver);
	}

	@Given("the user is on the login page {string}")
	public void the_user_is_on_the_login_page(String loginpageurl) {
		driver.get(loginpageurl);
	}

	@When("the user clicks the login tab")
	public void the_user_clicks_the_login_tab() {
//		login.clickloginTab();
	}

	@When("the user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String user) {
		login.enterEmail(user);

	}

	@When("the user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String pass) {
		login.enterPassword(pass);

	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		login.clickloginnButton();

	}

	@Then("the user will land on the home page {string}")
	public void the_user_will_land_on_the_home_page(String welcomepageurl) {
		driver.get(welcomepageurl);

	}
	



}

