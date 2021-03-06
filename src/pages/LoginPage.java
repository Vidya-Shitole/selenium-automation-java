package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement paswd;
	
	@FindBy(id="btnLogin")
	private WebElement btnlogin;
	
	@FindBy(id="SpanMessage")
	private WebElement errorMessage;
	
	public LoginPage()
	{
		
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
	}
	
	public HomePage Login(String uname,String pswd)
	{
		username.sendKeys(uname);
		paswd.sendKeys(pswd);
		btnlogin.click();
		
		HomePage hp = new HomePage();
		System.out.println("Printing hp from Login page" +hp);
		return hp;
	}
	
	public void verifyErrorMessage(String strExpectedErrorMessage)
	{
		Assert.assertEquals(errorMessage.getText().contains("Welcome"), true, "Welcome text is not as per format");
		Assert.assertEquals(errorMessage.getText(), strExpectedErrorMessage);
	}

}
