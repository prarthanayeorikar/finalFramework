package Pages.TestNg.crm;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Crm.Qa.HomePageCrm;
import Pages.Crm.Qa.LoginPageCrm;
import TestBase.FreeCrmTestBase;
import TestUtil.Test_Util;

public class LoginPageTest extends FreeCrmTestBase  {
	LoginPageCrm objLoginPageCrm ;
	HomePageCrm objHomePageCrm;
	Test_Util objTest_Util;
	
	public LoginPageTest() throws IOException {
		super();
	
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		
objLoginPageCrm=new LoginPageCrm();
objHomePageCrm=objLoginPageCrm.LoginApplication(Prop.getProperty("username"), Prop.getProperty("password"));		 	
}
	
	@Test(priority=1)
	public void isCrmLogoDisplay() {
		 boolean lobo=objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.CrmLogo);
		Assert.assertTrue(lobo);
		
	}
	@Test(priority=2)
	public void isSignUpLinkLinkDisplay() {
		
		objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.SignUpLink);
	}
	@Test(priority=3)
	
	public void isPricingLinkDisplay() {
		objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.PricingLink);
	}
	@Test(priority=4)
	public void isFeaturesLinkDisplay() {
		objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.FeaturesLink);
	}
	@Test(priority=5)
	public void isCustomersLinkDisplay() {
		objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.CustomersLink);
	}
	@Test(priority=6)
	public void isContactLinkDisplay() {
		objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.ContactLink);
	}
	@Test(priority=7)
	public void ishomeLinkDisplay() {
		objLoginPageCrm.isLinksDisplayed(objLoginPageCrm.homeLink);
		
	}
	
	

	

}
