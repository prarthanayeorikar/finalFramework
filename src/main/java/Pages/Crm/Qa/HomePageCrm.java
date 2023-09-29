package Pages.Crm.Qa;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.FreeCrmTestBase;

public class HomePageCrm extends FreeCrmTestBase {
	
	@FindBy(xpath="//a [contains(text(),'Home')]")
	public WebElement Home;
	@FindBy(xpath="//a [contains(text(),'Calendar')]")
	public WebElement Calendar;
	@FindBy(xpath="//a [contains(text(),'Companies')]")
	public WebElement Companies;
	@FindBy(xpath="//a [contains(text(),'Contacts')]")
	public WebElement Contacts;
	@FindBy(xpath="//a [contains(text(),'Deals')]")
	public WebElement Deals;
	@FindBy(xpath="//a [contains(text(),'Tasks')]")
	public WebElement Tasks;
	@FindBy(xpath="//a [contains(text(),'Cases')]")
	public WebElement Cases;
	@FindBy(xpath="//a [contains(text(),'Call')]")
	public WebElement Call;
	@FindBy(xpath="//a [contains(text(),'Text/SMS')]")
	public WebElement TextSMS;
	@FindBy(xpath="//a [contains(text(),'Print')]")
	public WebElement Print;
	@FindBy(xpath="//a [contains(text(),'Campaigns')]")
	public WebElement Campaigns;
	@FindBy(xpath="//a [contains(text(),'Docs')]")
	public WebElement Docs;
	@FindBy(xpath="//a [contains(text(),'Forms')]")
	public WebElement Forms;
	@FindBy(xpath="//a [contains(text(),'Reports')]")
	public WebElement Reports;
		
	public HomePageCrm() throws IOException {
		PageFactory.initElements(driver, this );
	}
 public void homePageLinkClick(WebElement element) {
	 element.click();
}
    public ContactsPageCrm clickonContactsLink() throws IOException {
	   Contacts.click();
		return new ContactsPageCrm();
}
    public CalendarPageCrm clickOnCalendarLink() throws IOException {
    	Calendar.click();
    	return new CalendarPageCrm();
    }
    
    public CompaniesPageCrm clickOnCompaniesLink() throws IOException {
    	Companies.click();
    	return new CompaniesPageCrm();
    }
    public DealsPageCrm clickOnDealLink() throws IOException {
    	Deals.click();
    	return new DealsPageCrm();
    }
    public TasksPageCrm  clickOnTasksLink() throws IOException {
    	Tasks.click();
    	return new TasksPageCrm();
    }
    public CasesPageCrm clickOnCasesLink() throws IOException {
    	Cases.click();
    	return new CasesPageCrm();
    }
    public CallPageCrm clickOnCallLink() throws IOException {
    	Call.click();
    	return new CallPageCrm();
    }
    public TextSMSCrmPage clickOnTextSMS() throws IOException {
    	TextSMS.click();
    	return new TextSMSCrmPage();
    }
    public PrintPageCrm clickOnPrint() throws IOException {
    	Print.click();
    	return new PrintPageCrm ();
    }
    public CampaignsPageCrm clickOnCampaigns() throws IOException {
    	Campaigns.click();
    	return new CampaignsPageCrm();
    }
    
    
}
