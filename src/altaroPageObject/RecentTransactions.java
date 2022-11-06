package altaroPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecentTransactions {
	
	WebDriver driver;

	public RecentTransactions(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}	
	
	@FindBy(linkText="View Recent Transactions")
	 public static WebElement recent_trans;
	
	@FindBy(xpath="//table/tbody/tr[2]/td[3]")
	public static WebElement acc_id;
	
	@FindBy(xpath="//table/tbody/tr[3]/td[3]")
	public static WebElement sec_acc_id;

	 public WebElement recent_trans() {
		 return recent_trans;
	 }
	 public WebElement acc_id() {
		 return acc_id;
	 }
	 public WebElement sec_acc_id() {
		 return sec_acc_id;
	 }
}
