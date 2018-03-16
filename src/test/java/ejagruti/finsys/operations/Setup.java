package ejagruti.finsys.operations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Setup 
{

	static WebDriver driver=null;

	public Setup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
		Setup.driver=driver;
	}
	
	public static String getcurrentdatetime()
	{
    	Date dt=new Date();
		DateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
		String dt1=sdf.format(dt);
		//System.out.println("Current date is..."+dt1);
		return dt1;
	}
	
/*	public static void main(String[] args) 
    {	
	Setup cdt=new Setup();
    String cdt1=cdt.getcurrentdatetime();
    System.out.println(".....Current Date time is...."+cdt1);
    }*/
}
