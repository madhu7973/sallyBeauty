package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.sally.baseTest.TestBase;

public class SignInModal extends TestBase
{
	@FindBy (xpath = "//div[@class = 'modal-content row signup-modal']")
	private WebElement signInModal;
	
	@FindBy (xpath = "//input[@id='login-email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='login-pwd']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@id ='btn-login']")
	private WebElement loginbutton;
	
	@FindBy (xpath = "//button[@class='close']")
	private WebElement closebutton;
	
	@FindBy (xpath = "//span[text()= 'sign in with google']")
	private WebElement googleSighIn;
	
	public boolean isSignModalDisplayed()
	{
		Boolean modal = signInModal.isDisplayed();
		return modal;
	}
	
	public void sighIn(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
	}
	
	public void closeSignInModal()
	{
		closebutton.click();
	}
	
	public String googleLogin() throws InterruptedException
	{
		googleSighIn.clear();
		Thread.sleep(2000);
		String title = driver.getTitle();
		return title;
	}

}