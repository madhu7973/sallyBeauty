package pomClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.sally.baseTest.TestBase;

public class AddressPage extends TestBase
{

	@FindBy (xpath = "//a[@title = 'add a new address']")
	private WebElement addNewAddressButton;
	
	@FindBy (xpath = "//a[@title='Edit Address']")
	private WebElement editAddressLink;
	
	@FindBy (xpath = "//a[@title='Delete Address']")
	private WebElement deleteAddressLink;
	
	@FindBy (xpath = "//a[contains (@href, 'SetDefault')]")
	private WebElement makeDefault;
	
	@FindBy (xpath = "(//li[@class = 'first'])[2]")
	private WebElement defaultAddress;
	
	@FindBy (xpath = "//div[@class = 'mini-address-title']")
	private List <WebElement> addressList;

	public AddressPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String clickaddNewAddressButton()
	{
		addNewAddressButton.click();
		return driver.getTitle();
	}
	
	public String clickEditAddressLink()
	{
		editAddressLink.click();
		return driver.getTitle();	
	}
	
	public void clickDeleteAddressLink()
	{
		deleteAddressLink.click();
		driver.switchTo().alert().accept();
	}
	
	public void verfyAddressDeletionorAddition()
	{
		addressList.size();
	}
	
	public void clickMakeDefaultLink()
	{
		makeDefault.click();
	}
	
	public String verifyDefaultAddressSelected()
	{
		String address = defaultAddress.getText();
		return address;
	}	
}