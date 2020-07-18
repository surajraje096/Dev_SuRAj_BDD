package Com.Easyshoppy.qa.StepDefinition;

import Com.Easyshoppy.qa.Pages.HomePage;
import Com.Easyshoppy.qa.Pages.LoginPage;
import Com.Easyshoppy.qa.TestBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class sing extends TestBase {

	LoginPage LoginPage;
	HomePage HomePage;

	@Given("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		init();
		LoginPage = new LoginPage();
		HomePage = new HomePage();
		HomePage.clickLoginBtn();
	}

	@Then("^verify user in login page$")
	public void verify_user_in_login_page() throws Throwable {
		boolean loc = LoginPage.verifiloginPage();
		Assert.assertTrue(loc);
	}

	@Then("^user type userid andan password$")
	public void user_type_userid_andan_password() throws Throwable {
		LoginPage.useridAndPass();
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		LoginPage.clicksbmitbtn();
	}

	@Then("^user verify Welcome profile page$")
	public void user_verify_welcome_profile_page() throws Throwable {
		LoginPage.veryfiedmsg();
	}

}
