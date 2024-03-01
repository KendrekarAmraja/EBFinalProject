package test_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AddToKart;
import pages.CheckOut;
import pages.Login;
import pages.YourKart;

public class Login_test {

	WebDriver driver;
	Login loginPage =null;
	AddToKart kart= null;
	YourKart viewkart= null;
	CheckOut checkout = null;
	
	String url="https://www.saucedemo.com/";
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String browser)
	
	{
		
		if(browser.equalsIgnoreCase("firefox"))
	{
			
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		
		
	}
	@Test
	public void testLogin()
	{
		loginPage = new Login(driver);	
		loginPage.setUsername("standard_user");
		loginPage.setPassword("secret_sauce");
		loginPage.clickLogin();
		
		kart = new AddToKart(driver);	
		kart.openitem();
		kart.itemclick();
		kart.productscreen();
		kart.addmoreitem();

		
		viewkart= new YourKart(driver);
		viewkart.gotokart();
		viewkart.continueshopping();
		viewkart.gotokart();
		viewkart.removeoneproduct();
	
		
		
		
		checkout = new CheckOut(driver);
		checkout.clickoncheckout();
		checkout.setfname("Amraja");
		checkout.setlname("Kendrekar");
		checkout.setcode(431401);
		checkout.continuepaymentprocess();
		checkout.finish();
		checkout.back();
	
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
