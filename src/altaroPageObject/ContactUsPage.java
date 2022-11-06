package altaroPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;

	public ContactUsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}	
	@FindBy(linkText="Contact Us")
	 public static WebElement cont_us;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]/div[1]/p[2]/a")
	public static WebElement online_form;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[5]/td[2]/textarea")
	public static WebElement cmnt_box;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	public static WebElement btn_submit;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	public static WebElement display;
	
	@FindBy(xpath="//*[@id=\"LoginLink\"]")
	public static WebElement log_out;
	
	public WebElement cont_us() {
		 return cont_us;
	 }
	public WebElement online_form() {
		 return online_form;
	 }
	public WebElement cmnt_box() {
		 return cmnt_box;
	 }
	public WebElement btn_submit() {
		 return btn_submit;
	 }
	public WebElement display() {
		 return display;
	 }
	public WebElement log_out() {
		 return log_out;
	 }
}

