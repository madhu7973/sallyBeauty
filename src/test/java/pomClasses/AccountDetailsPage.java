package pomClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class AccountDetailsPage extends TestBase
{
	@FindBy (id = "dwfrm_profile_customer_firstname")
	private WebElement firstName;

	@FindBy (id = "dwfrm_profile_customer_lastname")
	private WebElement lastname;

	@FindBy (id = "dwfrm_profile_customer_email")
	private WebElement emailid;

	@FindBy (id = "dwfrm_profile_customer_emailconfirm")
	private WebElement confirmemailid;

	@FindBy (id = "dwfrm_profile_customprofile_phonecell")
	private WebElement phonenumber;

	@FindBy (id = "changeMyPswd")
	private WebElement changepasswordButton;

	@FindBy (xpath = "//input[@class='radiobutton']")
	private List <WebElement> radiobuttons;

	@FindBy (id = "applyEditProfile")
	private WebElement applyButton;

	public AccountDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String getFirstName()
	{
		String fname = firstName.getText();
		return fname;
	}

	public String getLastName()
	{
		String lname = lastname.getText();
		return lname;
	}

	public String getemailid()
	{
		String email = emailid.getText();
		return email;
	}

	public String geteconfirmemailid()
	{
		String confirmemail = confirmemailid.getText();
		return confirmemail;
	}

	public String getphonenumber()
	{
		String cellnumber = phonenumber.getText();
		return cellnumber;
	}

	public void cardTypeCheckbox(String card)
	{
		for (int i=0; i< radiobuttons.size(); i++)
		{
			String radioButtonName = radiobuttons.get(i).getText();
			if (radioButtonName.equalsIgnoreCase(card))
			{
				radiobuttons.get(i).click();
				break;
			}

		}
	}

}