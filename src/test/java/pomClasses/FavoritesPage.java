package pomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sally.baseTest.TestBase;

public class FavoritesPage extends TestBase{

	@FindBy (className = "emptywishlisttext")
	private WebElement emptyFavMessage;

	@FindBy (xpath = "//a[text() = 'Start Shopping']")
	private WebElement startShoppingButton;

	@FindBy (className = "//td[@class = 'item-image']")
	private List <WebElement> imageSlot;

	@FindBy (className = "//div[@class = 'product-list-item']")
	private WebElement prodDescriptionList;

	@FindBy (className = "editItem")
	private List <WebElement> editLink;

	@FindBy (xpath = "//div[@class = 'item-option option-date-added']")
	private List <WebElement> favDate;

	@FindBy (xpath = "//button[text() = 'Remove']")
	private List <WebElement> removeLink;

	@FindBy (xpath = "//button[@title= 'Add to Basket']")
	private List <WebElement> addToBasketButton;

	@FindBy (className = "basket-confirmationsection")
	private WebElement addedToBasketCoformationPopup;

	//	@FindBy (className = "in-stock-msg")
	//	private List <WebElement> stockMessage;
	//	@FindBy (name = "Quantity")
	//	private List <WebElement> quantityBox2;
	//	@FindBy (xpath = "//input[contains (@id, 'dwfrm_wishlist_items_i')]")
	//	private List <WebElement> quantityBox;
	//	@FindBy (xpath = "//button[text() = 'Update']")
	//	private List <WebElement> updateLink;

	public int totalFavItems = imageSlot.size();

	public FavoritesPage()
	{
		PageFactory.initElements(driver, this);
	}

	//verify the empty favorites page message
	public boolean verifyEmptyFavMessageIsDisplayed()
	{
		boolean emptyMessage = emptyFavMessage.isDisplayed();
		return emptyMessage;
	}

	//click on continue shopping button 
	public String clickStartShoppingButton()
	{
		startShoppingButton.click();
		return driver.getTitle();
	}

	//clearing all favItems
	public boolean clearAllFavItems()
	{
		boolean emptyMessage = true;
		if (totalFavItems > 0)
		{
			for (int i=0; i < totalFavItems; i++)
			{
				removeLink.get(i).click();
			}
			if (emptyFavMessage.isDisplayed())
			{
				emptyMessage = emptyFavMessage.isDisplayed();
			}

		}
		return emptyMessage;

	}

	//remove only required favitems
	public void removeFavItem(int y)
	{
		for (int i=0; i < removeLink.size(); i++)
		{
			if (removeLink.get(i) == removeLink.get(y))
			{
				removeLink.get(i).click();
			}
		}

	}

	//click on edit link of required favitem
	public void editFavItem(int x)
	{
		for (int i=0; i<totalFavItems; i++)
			if(editLink.get(i) == editLink.get(x))
			{
				editLink.get(i).click();
			}

	}

	//clicking on add to bag button of required favitem
	public boolean clickAddToButton(int y) throws InterruptedException
	{
		boolean addedToBag = false;
		for (int i=0; i<addToBasketButton.size(); i++)
		{
			if (addToBasketButton.get(i) == addToBasketButton.get(y))
			{
				addToBasketButton.get(i).click();
				Thread.sleep(1500);
				addedToBag = driver.findElement(By.className("basket-confirmationsection")).isDisplayed();
			}
		}
		return addedToBag;
	}

	//verifying whether the fav item is added to basket
	public boolean addedToBasketConfirmation() throws InterruptedException
	{
		Thread.sleep(1000);
		boolean confirmationPopup = addedToBasketCoformationPopup.isDisplayed();
		return confirmationPopup;
	}
	
	//count of number of favItems
	public int countOfFavItems()
	{
		int numOfFavItems = imageSlot.size();
		return numOfFavItems;
	}
}