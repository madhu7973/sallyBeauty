package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class AddressConfirmationPage extends TestBase
{
	
	@FindBy (xpath = "(//button[@class = 'red-button'])[2]")
	private WebElement countinueWithAddressButton;
	
	@FindBy (xpath = "//span[text() = 'Edit This Address']")
	private WebElement editThisAddressButton;
	
	public AddressConfirmationPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String clickcountinueWithAddressButton()
	{
		countinueWithAddressButton.click();
		return driver.getTitle();
	}
	
	public String editThisAddressButton()
	{
		editThisAddressButton.click();
		return driver.getTitle();
	}
	
}