package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.sally.baseTest.TestBase;

public class AddNewAddressPage extends TestBase
{
	@FindBy (id = "dwfrm_profile_address_addressid")
	private WebElement addressName;

	@FindBy (id = "dwfrm_profile_address_firstname")
	private WebElement firstname;

	@FindBy (id = "dwfrm_profile_address_lastname")
	private WebElement lastName;

	@FindBy (id = "dwfrm_profile_address_address1")
	private WebElement fulladdress;

	@FindBy (xpath = "//select[@name='dwfrm_profile_address_states_state']")
	private WebElement countryDropdown;

	@FindBy (xpath = "//select[@name='dwfrm_profile_address_states_state']")
	private WebElement stateDropdown;

	@FindBy (id = "dwfrm_profile_address_city")
	private WebElement cityName;

	@FindBy  (id = "dwfrm_profile_address_zip")
	private WebElement zipcode;

	@FindBy (id = "dwfrm_profile_address_phone")
	private WebElement phoneNumber;

	@FindBy (id = "applyBtn")
	private WebElement applyButton;
	
	public AddNewAddressPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterAddressName(String addressname)
	{
		addressName.sendKeys(addressname);
	}

	public void enterFirstname(String fname)
	{
		firstname.sendKeys(fname);
	}

	public void eneterLastName(String lname)
	{
		lastName.sendKeys(lname);
	}

	public void enterAddress(String address)
	{
		fulladdress.sendKeys(address);
	}

	public void selectCountry (String text)
	{
		Select select = new Select (countryDropdown);
		select.selectByVisibleText(text);
	}

	public void selectState (String text)
	{
		Select select = new Select (stateDropdown);
		select.selectByVisibleText(text);
	}

	public void enterCity (String city)
	{
		cityName.sendKeys(city);
	}

	public void enterZipcode(String zip)
	{
		zipcode.sendKeys(zip);
	}

	public void enterphoneNumber(String phone)
	{
		phoneNumber.sendKeys(phone);
	}

	public void clickapplyButton()
	{
		applyButton.click();
	}

}