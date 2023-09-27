package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLocators {
	
WebDriver ldriver;
	
	@FindBy(name="q")
	WebElement textbox;
	public PageLocators(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	public  void searching(String name)
	{
		textbox.sendKeys(name);
		
	}
	public  void enter()
	{
		textbox.sendKeys(Keys.ENTER);
		
	}

}
