package ejagruti.finsys.operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class AppLaunch
{

	public AppLaunch()
	{
		
	}
	
	public static WebDriver driver=null;
//	public AppLaunch(WebDriver driver)
//	{
//	PageFactory.initElements(driver, this);	
//	AppLaunch.driver=driver;
//	}
	
	
	@When("^user opens Chrome browser$")
	public void OpenBrowser()
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println("setting up browser property......");
//		System.setProperty("webdriver.geko.driver", "C:\\Users\\FX971KK\\workspace\\ejagruti\\AllDrivers\\geckodriver.exe");
//		System.setProperty("webdriver.geko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/FX971KK/workspace/Finsys/AllDrivers/chromedriver.exe");
		driver = new ChromeDriver();		
		System.out.println("App launch driver=" + driver);
	}
	
	@And("^user enters the URL \"(.*)\"$")
	public void EnterURL(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(2000);
	}

	
}
