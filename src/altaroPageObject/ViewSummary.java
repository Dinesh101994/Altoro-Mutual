package altaroPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSummary {
	WebDriver driver;

	public ViewSummary(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}	
	
		@FindBy(linkText="View Account Summary")
		 public static WebElement acc_sum;
		
		@FindBy(id="listAccounts")
		public static WebElement select_acc;
		
		@FindBy(id="btnGetAccount")
		public static WebElement go_btn;
		
		@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/div/table/tbody/tr[1]/td/table/tbody/tr[4]/td[2]")
		public static WebElement verify_balance;
		
		public WebElement acc_sum() {
			return acc_sum;
		}
		public  WebElement select_acc() {
			return select_acc;
		}
		public WebElement go_btn() {
			return go_btn;
		}
		public  WebElement verify_balance() {
			return verify_balance;
		}
}
