package ejagruti.finsys.operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;

public class CreateCompany 
{
	WebDriver driver=null;
	
//	public CreateCompany(WebDriver driver)
//	{
//	PageFactory.initElements(driver, this);	
//	this.driver=driver;
//	}
	
	@FindBy(how=How.XPATH,using="//*[.='Financial Analysis']")
	WebElement financialanalysis;
	public void ClickFinancialAnalysis() throws InterruptedException
	{
			Thread.sleep(4000);
			financialanalysis.click();
	}

}
