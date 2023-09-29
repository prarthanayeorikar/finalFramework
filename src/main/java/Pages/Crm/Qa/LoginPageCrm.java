package Pages.Crm.Qa;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.FreeCrmTestBase;

public class LoginPageCrm extends FreeCrmTestBase {
	

@FindBy(xpath ="/html/body/div[2]/div/div[1]/a/img")
public WebElement CrmLogo;
@FindBy(xpath="//a[contains( text(),'Sign Up')]")
public WebElement SignUpLink;
@FindBy(xpath="//a[contains( text(),'Pricing')]")
public
WebElement PricingLink;
@FindBy(xpath="//a[contains( text(),'Features')]")
public WebElement FeaturesLink;
@FindBy(xpath="//a[contains( text(),'Customers')]")
public WebElement CustomersLink;
@FindBy(xpath="//a[contains( text(),'Contact')]")
public WebElement ContactLink;
@FindBy(xpath="//a[contains( text(),'Home')]")
public WebElement homeLink;
@FindBy(name="username")
public WebElement username;
@FindBy(name="password")
public WebElement password;
@FindBy(xpath= "//input [@type='submit']")
public WebElement Login;



public LoginPageCrm() throws IOException {
	
	PageFactory.initElements(driver, this );
}

//reusable method 
public boolean isLinksDisplayed(WebElement element  ) {
return 	element.isDisplayed();
	
}

	
 public HomePageCrm LoginApplication (String un,String pass) throws IOException {
	 username.sendKeys(un);
	 password.sendKeys(pass);
	 Login.click();
	 return new HomePageCrm();
	 
 }



}
