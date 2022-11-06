package altoroTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utility.BaseClass;

import altaroPageObject.ContactUsPage;
import altaroPageObject.LandingPage;
import altaroPageObject.RecentTransactions;
import altaroPageObject.TransferFundPage;
import altaroPageObject.ViewSummary;

public class AltroLoginTest extends BaseClass{

	@Test
	public void login() throws InterruptedException {
		
		browserLaunch();
		url();
		LandingPage landingPage= new LandingPage(driver);
		LandingPage landingPage= new LandingPage(driver);
		landingPage.inc_user_name().sendKeys("demo_user");
		landingPage.inc_user_pswd().sendKeys("demo_password");
		landingPage.login_btn().click();
		
		landingPage.user_name().sendKeys("admin");
		landingPage.user_pswd().sendKeys("admin");
		landingPage.login_btn().click();
		String verify=landingPage.verify_homepage().getText();
		Assert.assertEquals(verify, "Welcome to Altoro Mutual Online.");
		
		ViewSummary viewSummary= new ViewSummary(driver);
		viewSummary.acc_sum().click();
		Select select=new Select(viewSummary.select_acc());
		select.selectByVisibleText("800001 Checking");
		viewSummary.go_btn().click();
		String balance=viewSummary.verify_balance().getText();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(balance, "$324157.44");

		TransferFundPage transferFundPage = new TransferFundPage(driver);
		transferFundPage.trans_fund().click();
		Select fromselect= new Select(transferFundPage.select_from_acc());
		fromselect.selectByVisibleText("800000 Corporate");
		Select toselect=new Select(transferFundPage.select_to_acc());
		toselect.selectByVisibleText("800001 Checking");
		transferFundPage.amt_to_transfer().sendKeys("9876");
		transferFundPage.btn_transfer().click();
		String message=transferFundPage.succ_mes().getText(); 
		soft.assertEquals(message, "9876.0 was successfully");
		
		RecentTransactions recentTransactions= new RecentTransactions(driver);
		Thread.sleep(2000);
		recentTransactions.recent_trans().click();
		String acc_id=recentTransactions.acc_id().getText();
		soft.assertEquals(acc_id, "800001");
		String sec_acc=recentTransactions.sec_acc_id().getText();
		soft.assertEquals(sec_acc, "800000");
		
		ContactUsPage contactUsPage = new ContactUsPage(driver);
		contactUsPage.cont_us().click();
		contactUsPage.online_form().click();
		contactUsPage.cmnt_box().sendKeys("Comment entered");
		contactUsPage.btn_submit().click();
		String display_mes=contactUsPage.display().getText();
		Assert.assertEquals(display_mes, "Thank You");
		contactUsPage.log_out().click();
		
		browserClose();
		
	}
	
}
