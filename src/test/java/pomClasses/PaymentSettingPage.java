package pomClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.sally.baseTest.TestBase;

public class PaymentSettingPage extends TestBase
{
	@FindBy(xpath = "//a[@title='ADD A CREDIT CARD']")
	private WebElement addCardButton;
	
	@FindBy (id = "bill_to_forename")
	private WebElement fnameBox;
	
	@FindBy (id = "bill_to_surname")
	private WebElement lnameBox;
	
	@FindBy (id = "bill_to_address_line1")
	private WebElement addressLine1;
	
	@FindBy (id = "bill_to_address_line2")
	private WebElement addressLine2;
	
	@FindBy (id = "bill_to_address_city")
	private WebElement cityBox;
	
	@FindBy (id = "bill_to_address_country")
	private WebElement countryDropdown;
	
	@FindBy (id = "bill_to_address_postal_code")
	private WebElement zipCodeBox;
	
	@FindBy (id = "bill_to_email")
	private WebElement emailBox;
	
	@FindBy (xpath = "//input[@type='radio']")
	private List <WebElement> cardTypesRadioButton;
	
	@FindBy (id = "card_number")
	private WebElement cardNumberBox;
	
	@FindBy (id = "card_expiry_month")
	private WebElement expDateMonthDropdown;
	
	@FindBy (id = "card_expiry_year")
	private WebElement expDateYearDropdown;
	
	@FindBy (id = "card_cvn")
	private WebElement cvvBox;
	
	@FindBy (xpath = "//input[@type='submit' and @name = 'commit']")
	private WebElement nextButton;
	
	public PaymentSettingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddCreditCardButton() throws InterruptedException
	{
		addCardButton.click();
		Thread.sleep(1000);
	}
	
	public void enterFirstname(String fname)
	{
		fnameBox.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		lnameBox.sendKeys(lname);
	}
	
	public void enterAddress1(String address1)
	{
		addressLine1.sendKeys(address1);
	}
	
	public void enterAddress2(String address2)
	{
		addressLine2.sendKeys(address2);
	}
	
	public void entercityName(String cityName)
	{
		cityBox.sendKeys(cityName);
	}
	
	public void selectCountry(String countryName)
	{
		Select select = new Select(countryDropdown);
		select.selectByVisibleText(countryName);
	}
	
	public void enterZipCode(String zcode)
	{
		zipCodeBox.sendKeys(zcode);
	}
	
	public void enterMailID(String email)
	{
		emailBox.sendKeys(email);
	}
	
	public void selectCrdType(String cardType)
	{
		
	}
	
	
	

}