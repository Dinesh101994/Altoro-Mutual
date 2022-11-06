package altaroPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundPage {
	
	WebDriver driver;

	public TransferFundPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}	
	
		@FindBy(linkText="Transfer Funds")
		 public static WebElement trans_fund;
	
		@FindBy(xpath="//select[@id=\"fromAccount\"]")
		public static WebElement select_from_acc;
		
		@FindBy(xpath="//select[@id=\"toAccount\"]")
		public static WebElement select_to_acc;
		
		@FindBy(xpath="//input[@id=\"transferAmount\"]")
		public static WebElement amt_to_transfer;
		
		@FindBy(xpath="(//input[@type=\"submit\"])[2]")
		public static WebElement btn_transfer;
		
		@FindBy(xpath="//*[@id=\"_ctl0__ctl0_Content_Main_postResp\"]/span/text()")
		public static WebElement succ_mes;
		
		public WebElement trans_fund() {
			return trans_fund;
		}
		public  WebElement select_from_acc() {
			return select_from_acc;
		}
		public WebElement select_to_acc() {
			return select_to_acc;
		}
		public  WebElement amt_to_transfer() {
			return amt_to_transfer;
		}
		public  WebElement btn_transfer() {
			return btn_transfer;
		}
		public static WebElement succ_mes() {
			return succ_mes;
		}
		
		

}
