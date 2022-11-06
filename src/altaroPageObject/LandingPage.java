package altaroPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class LandingPage {
		WebDriver driver;
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}	
	
		@FindBy(id="uid")
		public static WebElement inc_user_name;
	
		@FindBy(id="passw")
		public static WebElement inc_user_pswd;

		@FindBy(id="uid")
		public static WebElement user_name;
		
		@FindBy(id="passw")
		public static WebElement user_pswd;
		
		@FindBy(name="btnSubmit")
		public static WebElement login_btn;
		
		@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/div/p")
		public static WebElement verify_homepage;
		
		public WebElement inc_user_name() {
			return inc_user_name;
		}
		public WebElement inc_user_pswd() {
			return inc_user_pswd;
		}
	
		public WebElement user_name() {
			return user_name;
		}
		public WebElement user_pswd() {
			return user_pswd;
		}
		public WebElement login_btn() {
			return login_btn;
		}
		public WebElement verify_homepage() {
		return verify_homepage;
		}
}
