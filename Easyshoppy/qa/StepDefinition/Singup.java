package Com.Easyshoppy.qa.StepDefinition;

import org.junit.Assert;

import Com.Easyshoppy.qa.Pages.HomePage;
import Com.Easyshoppy.qa.Pages.SingUpPage;
import Com.Easyshoppy.qa.TestBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Singup extends TestBase{
	
	SingUpPage SingUpPage;
	HomePage HomePage;

	 @Given("^verify use in registration page$")
	    public void verify_use_in_registration_page() throws Throwable {
		 init();
		 HomePage = new HomePage();
		 SingUpPage = new SingUpPage();
		 HomePage.ClicksingupBtn();
		 boolean sing=SingUpPage.verifyregi();
		 Assert.assertTrue(sing);
	    }
	
	    @Then("^user clik on sumbit button$")
	    public void user_clik_on_sumbit_button() throws Throwable {
	    	SingUpPage.submit();
	    }

	    @Then("^user successfully submit registration page$")
	    public void user_successfully_submit_registration_page() throws Throwable {
	        driver.close();
	    }

	    
	    @Then("^fill User Details the form$")
	    public void fill_User_Details_the_form()  {
	  	  SingUpPage.userdetails();
	      
	    }

	    @Then("^fill Shipping Address the form$")
	    public void fill_Shipping_Address_the_form() {
	    	SingUpPage.shipingAddres();
	  
	    }

	    @Then("^fill Billing Address the form$")
	    public void fill_Billing_Address_the_form() throws Throwable {
	      	SingUpPage.BillingAddres();
	    }

	    
	    
	    
	    
	    
	    
	    
}
