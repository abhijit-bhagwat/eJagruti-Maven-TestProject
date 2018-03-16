package ejagruti.finsys.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	static WebDriver driver=null;
	
	@Given("^User is on the application login page$")
	public boolean apploginpage() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Login driver="+AppLaunch.driver);
		WebElement top=AppLaunch.driver.findElement(By.xpath(".//*[@id='mainwindow']/center/form/div[2]/div[1]/div[1]"));
		return top.isDisplayed();
	}
	
//	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
//	WebElement username;
	@When("^user enters \"(.*)\" as username$")
	public void enterusername(String uname) throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Login driver="+AppLaunch.driver);
		WebElement username=AppLaunch.driver.findElement(By.xpath("//input[@placeholder='Username']"));
		System.out.println("Username string...."+uname);
		username.sendKeys(uname);
	}
	
//	@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
//	WebElement password;
	@And("^user enters \"(.*)\" as password$")
	public void enterpassword(String pw) throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Login driver="+AppLaunch.driver);
		WebElement password=AppLaunch.driver.findElement(By.xpath("//input[@placeholder='Password']"));
		System.out.println("Password string...."+pw);
		password.sendKeys(pw);
	}
	
//	@FindBy(how=How.XPATH,using="//span[.='Login']")
//	WebElement login;
	@And("^user clicks on login button$")
	public void clickloginbutton() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Login driver="+AppLaunch.driver);
		WebElement login=AppLaunch.driver.findElement(By.xpath("//span[.='Login']"));
		login.click();
	}

//	@FindBy(how=How.XPATH,using="//div[@id='error']")
//	WebElement loginerror;
	@Then("^error message \"(.*)\" displays at the bottom$")
	public void invalidloginmsg(String ab) throws InterruptedException
	{
		Thread.sleep(5000);
		ab="Please Enter Valid Username or Password!!!";
		System.out.println("Login driver="+AppLaunch.driver);
//		WebElement loginerror=AppLaunch.driver.findElement(By.xpath("//div[@id='error']"));
		WebElement loginerror=AppLaunch.driver.findElement(By.linkText("Please Enter Valid Username or Password!!!"));
//		WebElement loginerror=AppLaunch.driver.findElement(By.id("error"));
		System.out.println(".....login error"+loginerror.getText());
		loginerror.getText().equalsIgnoreCase(ab);
	}
	
	@Then("^user redirected to homepage where message starting with \"(.*)\" is displayed on the top$")
	public boolean validatehomepage() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement chk=AppLaunch.driver.findElement(By.xpath("//span[.='Welcome dummy[FM]']"));
		return chk.isDisplayed();
	}



	
	
}
