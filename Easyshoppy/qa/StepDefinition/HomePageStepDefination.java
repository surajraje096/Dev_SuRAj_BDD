package Com.Easyshoppy.qa.StepDefinition;

import Com.Easyshoppy.qa.TestBase.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import Com.Easyshoppy.qa.Pages.HomePage;
public class HomePageStepDefination extends TestBase{
	
	
	HomePage HomePage;

	
	
	 @Given("^user into lounch chrome browser$")
	    public void user_into_lounch_chrome_browser() throws Throwable {
		 init();
	    }

	 @Then("^verify current url$")
	    public void verify_current_url() throws Throwable {
		 HomePage =new HomePage();
		 String urlhome=HomePage.currenturl();
		 System.out.println(urlhome);
		 
	    }

	    @Then("^verify home page title$")
	    public void verify_home_page_title() throws Throwable {
	    	String Ti=HomePage.Tital();
	    	System.out.println(Ti);
	    }

	    @Then("^verify home page logo$")
	    public void verify_home_page_logo() throws Throwable {
	    	boolean log=HomePage.logo();
	         Assert.assertTrue(log);
	    }

	    @Then("^how many product present in home page$")
	    public void how_many_product_present_in_home_page() throws Throwable {
	    HomePage.product();
	    }

	    @Then("^verify product link on home page$")
	    public void verify_product_link_on_home_page() throws Throwable {
	    	boolean pro=HomePage.productlink();
	Assert.assertTrue(pro);
	    }

	    @Then("^verify  sign in button$")
	    public void verify_sign_in_button() throws Throwable {
	    	boolean lo=HomePage.LoginBtn();
	    	Assert.assertTrue(lo);
	    }

	    @Then("^verify login button$")
	    public void verify_login_button() throws Throwable {
	    	boolean sin=HomePage.singupBtn();
	    	Assert.assertTrue(sin);
	    }
}
