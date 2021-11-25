package pomClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class CreateAccountPage extends TestBase{
	
	@FindBy (id = "dwfrm_profile_customer_firstname")
	private WebElement firstNmaeTextBox;
	
	@FindBy (id = "dwfrm_profile_customer_lastname")
	private WebElement lastNameTextBox;
	
	@FindBy (id = "dwfrm_profile_address_address1")
	private WebElement address1TextBox;
	
	@FindBy (id = "dwfrm_profile_address_address2")
	private WebElement address2TextBox;
	
	@FindBy (id = "dwfrm_profile_address_country")
	private WebElement countryDropDown;
	
	@FindBy (id = "dwfrm_profile_address_states_state")
	private WebElement stateDropDown;
	
	@FindBy (id = "dwfrm_profile_address_city")
	private WebElement cityTextBox;
	
	@FindBy (id = "dwfrm_profile_address_zip")
	private WebElement zipCodeTextBox;
	
	@FindBy (id = "dwfrm_profile_address_phone")
	private WebElement phoneNumberTextBox;
	
	@FindBy (id = "dwfrm_profile_customer_email")
	private WebElement emailIDTextBox;
	
	@FindBy (id = "dwfrm_profile_customer_emailconfirm")
	private WebElement confirmemailIDTextBox;
	
	@FindBy (id = "dwfrm_profile_login_password")
	private WebElement passwordTextBox;
	
	@FindBy (id = "dwfrm_profile_login_passwordconfirm")
	private WebElement confirmPasswordTextBox;
	
	@FindBy (xpath = "//input[@class = 'radiobutton radio-classes']")
	private List<WebElement> cardTypesCheckBoxes;
	
	@FindBy (id = "accountregister")
	private WebElement applyButton;
	
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
}