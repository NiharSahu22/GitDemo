package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.POHomePage;
import pageObjects.POLoginPage;
import resources.Base;

@RunWith(Cucumber.class)
public class LoginDefinition extends Base {
	POLoginPage pl;

	@Given("^User is initialize the chrome driver$")
	public void user_is_initialize_the_chrome_driver() throws Throwable {
		driver = initializeDriver();

	}

	@And("user open the url {string}")
	public void user_open_the_url(String string) {
		driver.get(string);
	}

	@When("^User enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) throws Throwable {
		pl = new POLoginPage(driver);
		pl.getUserName().sendKeys(username);
		pl.getpassword().sendKeys(password);

	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
		pl.getLoginButton().click();

	}

	@Then("^user is navigate to home page$")
	public void user_is_navigate_to_home_page() throws Throwable {
		POHomePage ph = new POHomePage(driver);

		if (ph.getheading().getText().equalsIgnoreCase("Example Domain")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

	}

	@And("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.quit();
	}

}
