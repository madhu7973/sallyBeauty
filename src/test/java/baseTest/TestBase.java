package com.qa.sally.baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.sally.util.sally_TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Madhu\\SallyBeauty\\SallyBeauty\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Initialization()
	{
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Madhu\\SeleniumDependencies\\DriverExecutables\\chromedriver-2.42.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Madhu\\SeleniumDependencies\\DriverExecutables\\geckodriver-23.0.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(sally_TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(sally_TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	//method to mouse hover on root category and click on the required sub category links
	//provide the xpath of root category link as element1 and xpath of sub category link as element2
	public void mouseHoverOnMegaNav(WebElement element1, WebElement element2) throws InterruptedException
	{
		Actions action = new Actions (driver);
		action.moveToElement(element1).build().perform();
		Thread.sleep(500);
		action.moveToElement(element2).click().build().perform();
		Thread.sleep(1000);
//		String pageTitle = driver.getTitle();
//		return pageTitle;
	}
}
