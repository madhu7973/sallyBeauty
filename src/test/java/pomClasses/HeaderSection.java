package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class HeaderSection extends TestBase
{
	@FindBy (xpath = "(//a[contains(@href, '/my-account/')])[2]")
	private WebElement loginInLink;

//	@FindBy (xpath = "//a[@data-target='#signup']")
//	private WebElement signUpLink;

//	@FindBy (xpath = "//a[contains (@href, 'quicklist')]")
//	private WebElement favoritesIcon;

	@FindBy (xpath = "//div[@class='mini-cart-total']")
	private WebElement cartIcon;
	
	@FindBy (xpath = "//img[@class='sally-logo']")
	private WebElement sallyLogo;

	@FindBy (id = "q")
	private WebElement serchbox;

	@FindBy (xpath = "//input[@class='rightside']")
	private WebElement searchButton;


	//mega navigation category links
	@FindBy (xpath = "(//a[contains(@href, 'hair-color')])[1]")
	private WebElement hairCatLink;

	@FindBy (xpath = "(//a[contains(@href, 'acrylic-nails')])[1]")
	private WebElement nailsCatLink;

	@FindBy (xpath = "(//a[contains(@href, '/salon-equipment/')])[1]")
	private WebElement SuppCatLink;

	@FindBy (xpath = "(//a[contains(@href, '/makeup/')])[1]")
	private WebElement beautyCatLink;

	@FindBy (id = "clearance")
	private WebElement clearanceCatLink;

	@FindBy (xpath = "//a[@title= 'Deals & Coupons']")
	private WebElement dealsandcouponsCatLink;

	@FindBy (xpath = "(//a[contains(@href, '/ion/')])[1]")
	private WebElement brandsCategoryLink;

	public HeaderSection()
	{
		PageFactory.initElements(driver, this);
	}
	
	//close the sign up modal
	public void closeSignUpModal() throws InterruptedException
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='email_cancel-btn']")).click();
		
	}

	public String getHomePageTitle()
	{
		String title = driver.getTitle();
		return title;
	}

	public void clickSignInLink()
	{
		loginInLink.click();
	}

//	public void clickSignUpLink()
//	{
//		signUpLink.click();
//	}

//	public void clickFavoritesIcon()
//	{
//		favoritesIcon.click();
//	}

	public void clickMinicartIcon()
	{
		cartIcon.click();

	}

	public void enterSearchTerm(String searchword)
	{
		serchbox.sendKeys(searchword);
	}

	public void clickSerchButton()
	{
		searchButton.click();
	}

	//clicking on mega navigation links
	public String clickhairCategoryLink()
	{
		hairCatLink.click();
		return driver.getTitle();
	}

	public String clickNailCatogeryLink()
	{
		nailsCatLink.click();
		return driver.getTitle();
	}

	public String clickSuppCatLink()
	{
		SuppCatLink.click();
		return driver.getTitle();
	}


	public String clickbeautyCatLink()
	{
		beautyCatLink.click();
		return driver.getTitle();
	}

	public String clickclearanceCatLink()
	{
		clearanceCatLink.click();
		return driver.getTitle();
	}

	public String clickdealsandcouponsCatLink()
	{
		dealsandcouponsCatLink.click();
		return driver.getTitle();
	}

	public String clickbrandsCategoryLink()
	{
		brandsCategoryLink.click();
		return driver.getTitle();
	}
}