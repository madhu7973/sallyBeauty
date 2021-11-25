package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class AccountLandingPage extends TestBase 
{
	@FindBy(xpath="//span[text() = 'Addresses']")
	private WebElement addressLink;
	
	@FindBy(xpath="//span[text() = 'Payment Settings']")
	private WebElement paymentSettingsLink;

	@FindBy(xpath="//span[text() = 'Order History']")
	private WebElement orderHistoryLink;

	@FindBy(xpath="//span[text() = 'Account Info']")
	private WebElement myProfileLink;

	public AccountLandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getAccountLandingPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickAddressPageLink()
	{
		addressLink.click();
	}
	
	public void paymentSettingsLink()
	{
		paymentSettingsLink.click();
	}
	public void clickMuOrdersLink()
	{
		orderHistoryLink.click();
	}
	public void clickMyProfileLink()
	{
		myProfileLink.click();
	}

}