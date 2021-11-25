package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class ChangePasswordModal extends TestBase
{
	@FindBy (id = "dwfrm_editpassword_oldpassword")
	private WebElement oldPwdBox;
	
	@FindBy (id = "dwfrm_editpassword_newpassword")
	private WebElement newPwdBox;
	
	@FindBy (id = "dwfrm_editpassword_passwordconfirm")
	private WebElement confirmPwdBox;
	
	@FindBy (id = "editPasswordUpdate")
	private WebElement changePWDButton;

	public ChangePasswordModal()
	{
		PageFactory.initElements(driver,  this);
	}
	
	public void enterOldPwd(String oldPwd)
	{
		oldPwdBox.sendKeys(oldPwd);
	}
	
	public void enterNewPWD(String newPWD)
	{
		newPwdBox.sendKeys(newPWD);
	}
	
	public void enterConfirmPWD(String confirmPWD)
	{
		confirmPwdBox.sendKeys(confirmPWD);
	}
	
	public String clickChangePWDButton()
	{
		changePWDButton.click();
		return driver.getTitle();
	}
}