package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class AddUserPage {

@FindBy(id="btnAdd")
private WebElement addUserButton;
	@FindBy(id="systemUser_userType")
	private WebElement userRole ;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement empName;
	
	@FindBy(id="systemUser_userName")
	private WebElement userName;
		
	@FindBy(id="systemUser_status")
	private WebElement userStatus;
		
	@FindBy(id="systemUser_password")
	private WebElement userpswd;
	
	@FindBy(id="btnSave")
	private WebElement saveButton;
		
 public AddUserPage() 
	{
		
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
	}
	
 public AdminPage adduser(String UserRole,String Ename,String uName,String Ustatus,String UPswd)
	{
		userRole.sendKeys(UserRole);
		empName.sendKeys(Ename);
		userName.sendKeys(uName);
		userStatus.sendKeys(Ustatus);
		userpswd.sendKeys(UPswd);
		saveButton.click();
		
		return new AdminPage();
}
}
