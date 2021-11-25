package pomClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.sally.baseTest.TestBase;

public class ProductLandingPage extends TestBase{

	@FindBy (xpath = "//span[@class='regular-arrow' or @class='flipped-arrow']")
	private List <WebElement> filterTitles;

	//-----------------------------------SuCategory Filter Options------------------------

	@FindBy (xpath = "//li[@class='expandable active' or @class ='refinement-link  active']//a")
	private List <WebElement> subCatLinksInFilters;

	@FindBy (xpath ="(//div[@id='beauty-level2']//li[@class='cat-header clear'])[1]//a")
	private List <WebElement> subCatLinksInMegaNav;

	@FindBy (id = "showmorebutton")
	private WebElement subcategoriesSeeMoreLink;

	@FindBy (id = "showlessbutton")
	private WebElement subcategoriesSeeLessLink;

	//-----------------------------------Sale Filter Options------------------------------

	@FindBy (xpath = "//div[@class='refinement SALE' or @class ='refinement Sale']//ul//li//a//div[@class='icheckbox_minimal-red']")
	private List <WebElement> saleFilterCheckBoxes;

	//-----------------------------------Brand Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Brand']/ul/li/a")
	private List <WebElement> brandFilterLinks;

	//use FetschFiterTextMethod

	@FindBy (xpath = "//div[@class='refinement Brand']//ul//li//a//div")
	private List <WebElement> filterCheckBoxes;


	@FindBy (xpath ="//div[@class='refinement Brand']//div[@id='showmorebutton']")
	private WebElement brandFilterSeeMoreLink;

	@FindBy (xpath= " //div[@class='refinement Brand']//div[@id='showlessbutton']")
	private WebElement brandFilterSeeLessLink;

	@FindBy (xpath = " //div[@class='refinement Brand']//div[@class='clear-refinement']")
	private WebElement brandFilterClearFiltersLink;


	//-----------------------------------Product Line Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Product Line']/ul/li/a")
	private List <WebElement> productLineFilterLinks;

	@FindBy (xpath = "//div[@class='refinement Product Line']//div[@class='clear-refinement']")
	private WebElement productLineClearFiltersLink;

	@FindBy (xpath = "//div[@class='refinement Product Line']//div[@id='showmorebutton']")
	private WebElement productLineFilterSeeMoreLink;

	@FindBy (xpath = "//div[@class='refinement Product Line']//div[@id='showlessbutton']")
	private WebElement productLineFilterSeeLessLink;

	//-----------------------------------Type Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Type']/ul/li/a")
	private List <WebElement> typeFilterLinks;

	@FindBy (xpath = "//div[@class='refinement Type']//div[@id='showmorebutton']")
	private WebElement typeFilterseeMoreLink;

	@FindBy (xpath = "//div[@class='refinement Type']//div[@id='showlessbutton']")
	private WebElement typeFilterSeeLessLink;

	@FindBy (xpath = "//div[@class='refinement Type']//div[@class='clear-refinement']")
	private WebElement typeFilterClearLink;

	//-----------------------------------Color Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Color']/ul/li/a")
	private List <WebElement> colorFilterLinks;

	@FindBy (xpath = "//div[@class='refinement Color']//div[@id='showmorebutton']")
	private WebElement colorFilterseeMoreLink;

	@FindBy (xpath = "//div[@class='refinement Color']//div[@id='showlessbutton']")
	private WebElement colorFilterSeeLessLink;

	@FindBy (xpath = "//div[@class='refinement Color']//div[@class='clear-refinement']")
	private WebElement colorFilterClearLink;

	//-----------------------------------Benefits Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Benefits']/ul/li/a")
	private List <WebElement> benefitsFilterLinks;

	@FindBy (xpath = "//div[@class='refinement Benefits']//div[@id='showmorebutton']")
	private WebElement benefitsFilterseeMoreLink;

	@FindBy (xpath = "//div[@class='refinement Benefits']//div[@id='showlessbutton']")
	private WebElement benefitsFilterSeeLessLink;

	@FindBy (xpath = "//div[@class='refinement Benefits']//div[@class='clear-refinement']")
	private WebElement benefitsFilterClearLink;

	//-----------------------------------Promotion Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Promotion']/ul/li/a")
	private List <WebElement> promotionFilterLinks;

	@FindBy (xpath = "//div[@class='refinement Promotion']//div[@id='showmorebutton']")
	private WebElement promotionFilterseeMoreLink;

	@FindBy (xpath = "//div[@class='refinement Promotion']//div[@id='showlessbutton']")
	private WebElement promotionFilterSeeLessLink;

	@FindBy (xpath = "//div[@class='refinement Promotion']//div[@class='clear-refinement']")
	private WebElement promotionFilterClearLink;

	//-----------------------------------Price Filter Options-----------------------------

	@FindBy (xpath = "//div[@class='refinement Price']/ul/li/a")
	private List <WebElement> priceFilterLinks;

	@FindBy (xpath = "//div[@class='refinement Price']//div[@id='showmorebutton']")
	private WebElement priceFilterseeMoreLink;

	@FindBy (xpath = "//div[@class='refinement Price']//div[@id='showlessbutton']")
	private WebElement priceFilterSeeLessLink;

	@FindBy (xpath = "//div[@class='refinement Price']//div[@class='clear-refinement']")
	private WebElement pricetionFilterClearLink;

	//-----------------------------------SeeMoreLink AfterFirstSix FilterOptions--------------------------

	@FindBy (xpath = "//div[@id='showmorebutton']//..//li[@class='' or @class = '  ']")
	private List <WebElement> seeMoreLinkAfterSixFilterOptions;


	public ProductLandingPage()
	{
		PageFactory.initElements(driver, this);
	}

	//---------------------------------------------------------SuCategory Filter Options-----------------------------------------------

	//Clicking on the sub category links of category filter
	public String clickOnSubCatLink(String catLink) throws InterruptedException
	{
		int catLinksCount = subCatLinksInFilters.size();
		String pageTitle = "";
		for(int i=0; i<catLinksCount; i++)
		{
			if(subCatLinksInFilters.get(i).getText().equalsIgnoreCase(catLink))
			{
				subCatLinksInFilters.get(i).click();
				Thread.sleep(3000);
				pageTitle = driver.getTitle();
				break;
			}

		}
		return pageTitle;
	}

	//Verifying onlySix filter options are displayed at pageLoad
	public boolean sixFiltersAtPageLoad()
	{
		boolean defaultOptions = false;
		int defaultFilterNumber = seeMoreLinkAfterSixFilterOptions.size();
		int totalSeemoreLinks = defaultFilterNumber/6;
		List <WebElement> numberOfShowMoreLinks = driver.findElements(By.xpath("//div[@id ='showmorebutton']"));
		if (totalSeemoreLinks == numberOfShowMoreLinks.size())
		{
			defaultOptions = true;
		}

		return defaultOptions;

	}

	//---------------------------------------------BrandFilterOptions------------------------------------

	//Verifying whether the checkbox is ticked after selecting it
	//public String clickFilterOptions(String cat1Filter, String cat2Filter)
	public String BrandfilterOptionsClick(String filName) throws InterruptedException
	{
		String selectedFilterName= "";
		List <WebElement> filterOptions = driver.findElements(By.xpath("//div[@class='refinement Brand']/ul/li/a"));

		for(int i=0; i<filterOptions.size(); i++)
		{
			if (filterOptions.get(i).getText().equals(filName))
			{
				filterOptions.get(i).click();
				Thread.sleep(3000);
				WebElement selectedFilter = driver.findElement(By.xpath("//li[@class='selected']"));
				String selectedClassName = selectedFilter.getAttribute("class");

				if (selectedClassName.equals("selected"))

					if (driver.findElement(By.xpath("//li[@class='selected']//div")).getAttribute("class").equals("icheckbox_minimal-red checked"))
						selectedFilterName = selectedFilter.getText();
				System.out.println("check box selected of filter "+selectedFilterName );

				break;
			}

		}
		return selectedFilterName;

	}

	//Verifying whether the number displayed next to filter name matches
	//with the number of products displayed
	public int[] BrandfiltersClearedProducts(String filtername) throws InterruptedException
	{
		int filterProductsNumber = 0;
		int productNumber = 0;
		List <WebElement> filterOptions = driver.findElements(By.xpath("//div[@class='refinement Brand']/ul/li/a"));

		for(int i=0; i<filterOptions.size(); i++)
		{
			if (filterOptions.get(i).getText().contains(filtername))
			{
				filterOptions.get(i).click();
				Thread.sleep(3500);
				WebElement selectedFilter = driver.findElement(By.xpath("//li[@class='selected']"));
				String filterNumber = selectedFilter.getText().replaceAll("[^0-9]", "");
				//System.out.println(filterNumber);				
				filterProductsNumber = Integer.parseInt(filterNumber);
				//System.out.println(filterProductsNumber);
				break;
			}
		}

		//select show all products form drop down and then collect all the brand-name.

		WebElement element = driver.findElement(By.id("grid-paging-footer"));
		Select select = new Select (element);
		select.selectByVisibleText("View ALL Products");
		Thread.sleep(50000);

		List <WebElement> products = driver.findElements(By.xpath("//div[@class='brand-name']"));
		productNumber = products.size();

		int[] a = {filterProductsNumber, productNumber};
		return a;
	}


	//Verify whether the respective products are being displayed after selecting a filter


}
