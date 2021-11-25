package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy (xpath = "//input[@placeholder='Email Address *']")
	private WebElement usernameTextBox;
	
	@FindBy (xpath = "//input[@placeholder='Password *']")
	private WebElement passwordTextBox;
	
	@FindBy (xpath = "//a[@id='password-reset']")
	private WebElement forgotPasswordLink;
	
	@FindBy (name = "dwfrm_login_login")
	private WebElement signInButton;
	
	@FindBy (name = "dwfrm_login_register")
	private WebElement createAccountButton;
	
	@FindBy (id = "dwfrm_requestpassword_email")
	private WebElement forgotPWDemailTextBox;
	
	@FindBy (name = "dwfrm_requestpassword_send")
	private WebElement forgotPWDSendButton;
	
	@FindBy (className = "recaptcha-checkbox-checkmark")
	private WebElement recapcthaCheckBox;
	
	@FindBy (id = "dialog-container")
	private WebElement resetPwdConfirmationPopup;
	
	@FindBy (xpath = "//button[@value='Close']")
	private WebElement closeButtonResetPwdConfirmationPopup;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		usernameTextBox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	
	public void clickForgotPasswordLink()
	{
		forgotPasswordLink.click();
	}
	
	public void enterRegisteredEmailId(String registeredEmailID) throws InterruptedException
	{
		Thread.sleep(500);
		forgotPWDemailTextBox.sendKeys(registeredEmailID);
	}
	
	public void clickRecaptchaCheckBox() throws InterruptedException
	{
		Thread.sleep(500);
		recapcthaCheckBox.click();
	}
	
	public boolean clcikSendButton()
	{
		forgotPWDSendButton.click();
		boolean popudisDisplayed = resetPwdConfirmationPopup.isDisplayed();
		return popudisDisplayed;
	}
	
	public boolean clickCloseButtonPwdResetConfirmationPopu() throws InterruptedException
	{
		Thread.sleep(1000);
		closeButtonResetPwdConfirmationPopup.click();
		boolean popudisDisplayed = resetPwdConfirmationPopup.isDisplayed();
		return popudisDisplayed;
	}
	
}