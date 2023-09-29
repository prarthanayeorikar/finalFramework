package Pages.TestNg.crm;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Crm.Qa.CalendarPageCrm;
import Pages.Crm.Qa.CallPageCrm;
import Pages.Crm.Qa.CampaignsPageCrm;
import Pages.Crm.Qa.CasesPageCrm;
import Pages.Crm.Qa.CompaniesPageCrm;
import Pages.Crm.Qa.ContactsPageCrm;
import Pages.Crm.Qa.DealsPageCrm;
import Pages.Crm.Qa.DocsPageCrm;
import Pages.Crm.Qa.FormsPageCrm;
import Pages.Crm.Qa.HomePageCrm;
import Pages.Crm.Qa.LoginPageCrm;
import Pages.Crm.Qa.PrintPageCrm;
import Pages.Crm.Qa.ReportsPageCrm;
import Pages.Crm.Qa.TasksPageCrm;
import Pages.Crm.Qa.TextSMSCrmPage;
import TestBase.FreeCrmTestBase;
import TestUtil.Test_Util;

public class HomePageTest extends FreeCrmTestBase {
	
	FreeCrmTestBase objFreeCrmTestBase;
	Test_Util objTest_Util;
	LoginPageCrm objLoginPageCrm ;
	HomePageCrm objHomePageCrm;
	CalendarPageCrm objCalendarPageCrm;
	CallPageCrm objCallPageCrm;
	CampaignsPageCrm objCampaignsPageCrm;
	CasesPageCrm objCasesPageCrm;
	CompaniesPageCrm objCompaniesPageCrm;
	ContactsPageCrm objContactsPageCrm;
	DealsPageCrm objDealsPageCrm;
	DocsPageCrm objDocsPageCrm;
	FormsPageCrm objFormsPageCrm;
	PrintPageCrm objPrintPageCrm;
	ReportsPageCrm objReportsPageCrm;
	TasksPageCrm objTasksPageCrm;
	TextSMSCrmPage objTextSMSCrmPage;
	
	
	

	public HomePageTest() throws IOException {
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		objTest_Util=new Test_Util();
		objLoginPageCrm=new LoginPageCrm();
	  objHomePageCrm=objLoginPageCrm.LoginApplication(Prop.getProperty("username"), Prop.getProperty("password"));
	}
	@Test
	public void clickOnContactLink() throws IOException {
		objTest_Util.frame("mainpanel");
		objContactsPageCrm=objHomePageCrm.clickonContactsLink();
		
	}
	public void clickOnCalendarLink() throws IOException {
		objTest_Util.frame("mainpanel");
		objCalendarPageCrm	=objHomePageCrm.clickOnCalendarLink();
	}
	public void clickOnCompaniesLink() throws Exception {
		objTest_Util.frame("mainpanel");
		objCompaniesPageCrm=objHomePageCrm.clickOnCompaniesLink();
	}
	public void clickOnDealLink() throws IOException {
		objTest_Util.frame("mainpanel");
		objDealsPageCrm=objHomePageCrm.clickOnDealLink();
	}
	public void clickOnTasksLink() throws IOException {
		objTest_Util.frame("mainpanel");
		objTasksPageCrm=objHomePageCrm.clickOnTasksLink();
	}
	public void clickOnCasesLink() throws IOException {
		objTest_Util.frame("mainpanel");
		objCasesPageCrm=objHomePageCrm.clickOnCasesLink();
	}
	public void clickOnCallLink() throws IOException {
		objTest_Util.frame("mainpanel");
		objCallPageCrm=objHomePageCrm.clickOnCallLink();
	}
	public void clickOnTextSMS() throws IOException {
		objTest_Util.frame("mainpanel");
		objTextSMSCrmPage=objHomePageCrm.clickOnTextSMS();
	}
	public void clickOnPrint() throws IOException {
		objTest_Util.frame("mainpanel");
		objPrintPageCrm=objHomePageCrm.clickOnPrint();
	}
	
	

}
