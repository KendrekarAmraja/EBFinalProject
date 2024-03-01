package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	WebDriver driver;
	

	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy (xpath= "//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy (xpath= "//input[@id='postal-code']")
	WebElement code;
	
	@FindBy (xpath="//input[@id='continue']")
	WebElement con;
	
	@FindBy (xpath="//button[@id='finish']")
	WebElement finishpayment;
	
	@FindBy (xpath="//button[@id='back-to-products']")
	WebElement backtohomepage;
	
	public CheckOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickoncheckout()
	
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	checkout.click();
			
	}
	
	public void setfname(String fname)

	{
		firstname.sendKeys(fname);

	}
	public void setlname(String lname)

	{
		lastname.sendKeys(lname);
	}

	public void setcode(int pcode)

	{
		code.sendKeys(""+pcode);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	public void continuepaymentprocess()
	{
		con.click();
		
	}
	public void finish()
	{
		finishpayment.click();
	}
	
	
	public void back()
	
	{
		backtohomepage.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
}