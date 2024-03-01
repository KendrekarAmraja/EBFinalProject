package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToKart {

		WebDriver driver;
	

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
	WebElement finditem;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement item;
	
	@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement addlight;
	
	
	@FindBy (xpath= "//button[@id='back-to-products']")
	WebElement backtoproduct;
	
	public AddToKart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void openitem()

	{
		finditem.click();
	}
	public void itemclick() {
		item.click();
		
	}
	
	public void addmoreitem() {
		addlight.click();
	}
	

	public void productscreen()
	{
		
	
	backtoproduct.click();
			
		
	}

}

