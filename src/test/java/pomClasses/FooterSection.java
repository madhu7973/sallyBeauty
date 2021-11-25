package pomClasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.sally.baseTest.TestBase;

public class FooterSection extends TestBase {
	
	@FindBy (xpath = "(//div[@class='submenu'])[1]//a")
	List <WebElement> submenu1FooterLinks;
	
	@FindBy (xpath = "(//div[@class='submenu'])[2]//a")
	List <WebElement> submenu2FooterLinks;
	
	@FindBy (xpath = "(//div[@class='submenu'])[3]//a")
	List <WebElement> submenu3FooterLinks;
	
	@FindBy (xpath = "(//div[@class='submenu'])[4]//a")
	List <WebElement> submenu4FooterLinks;
	
	@FindBy (xpath = "(//div[@class='submenu'])[5]//a")
	List <WebElement> submenu5FooterLinks;
	
	@FindBy (xpath = "(//div[@class='submenu'])61]//a")
	List <WebElement> submenu6FooterLinks;
	
	@FindBy (xpath = "//span[@class='customerlinks phone-ipadMini-hide']//a")
	List <WebElement> footerBottomLinks;
	
	@FindBy (xpath = "//div[@class='footer-icons clear-left']//a")
	List <WebElement> footerAppLinks;
	
	@FindBy (xpath = "//div[@class='socio-links-dsk']//a")
	List <WebElement> footerSocialLinks;
	
	@FindBy (id = "dwfrm_profile_customer_emailsubscribe")
	private WebElement emailSubscriptionBox;
	
	@FindBy (id = "emailsubmitFooter")
	private WebElement signUpForEmailButton;
	

}
