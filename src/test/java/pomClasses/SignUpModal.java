package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class SignUpModal extends TestBase
{
	@FindBy (xpath = "//input[@id = 'firstname']")
	private WebElement firstname;

	@FindBy (xpath = "//input[@id = 'lastname']")
	private WebElement lastname;

	@FindBy (xpath = "//input[@id = 'email']")
	private WebElement emailid;

	@FindBy (xpath  = "//input[@id = 'accessKey']")
	private WebElement password;

	@FindBy (xpath = "//input[@id = 'mobile']")
	private WebElement mobile;

	@FindBy (xpath = "//span[text()= 'male']")
	private WebElement checkbox;

	@FindBy (xpath = "//button[@id= 'btn-signup']")
	private WebElement signupButton;

	public SignUpModal()
	{
		PageFactory.initElements(driver, this);
	}

	public void setFirstName(String fname)
	{
		firstname.sendKeys(fname);
	}

	public void setLastName(String lname)
	{
		lastname.sendKeys(lname);
	}

	public void setEmail(String email)
	{
		emailid.sendKeys(email);
	}

	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void setMobile(String mobileNumber)
	{
		mobile.sendKeys(mobileNumber);
	}

	public void clickCheckBox()
	{
		checkbox.click();
	}

	public void clickSignUpButton()
	{
		signupButton.click();
	}
}