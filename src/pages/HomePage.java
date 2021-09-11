package pages;
//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import common.WebDriverFactory;

public class HomePage {

	@FindBy(id="welcome")
	private WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement admintab;
	
		public HomePage() {
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		}
	
		public HomePage verifyWelcomeText(String ExpectedWelcomeText)
		{
		Assert.assertEquals(welcomeText.getText().contains("Welcome"),ExpectedWelcomeText,"welcome is ");
		return this;
		}
		
		public AdminPage navigateToAdminpage() {
		admintab.click();
		return new AdminPage();
	}
}
