package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourKart {

	
	WebDriver driver;
	

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement kart;
	
	@FindBy(xpath="//img[@alt='Go back']")
	WebElement shop;
	
	@FindBy (xpath= "//button[@id='remove-sauce-labs-fleece-jacket']")
		WebElement remove;
	
	
	public YourKart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void gotokart()

	{
		kart.click();
	}
	public void continueshopping() {
		shop.click();
		
	}
	 
	public void removeoneproduct()
	{
		remove.click();
		
	}
	
}