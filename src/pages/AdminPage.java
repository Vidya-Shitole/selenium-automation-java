package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class AdminPage {

	@FindBy(id="btnAdd")
	 WebElement addUserButton;
		
 public AdminPage() 
	{
		
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
	}
	
	public AddUserPage NavigatetoAddUserPage()
	{
		System.out.println("I am on Admin Page");
		addUserButton.click();
		return new AddUserPage();
	}
	
}
