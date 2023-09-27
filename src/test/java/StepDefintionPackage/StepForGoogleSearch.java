package StepDefintionPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageLocators;
import pageObjects.PageLocators.*;

public class StepForGoogleSearch {
	WebDriver driver;
	public PageLocators page;
	
    
    ChromeOptions chromeOptions; 

	WebElement searchterm;
	@Given("^User is on the Google.com page$")
	public void user_is_on_the_google_com_page() {
		chromeOptions = new ChromeOptions(); 
	    chromeOptions.addArguments("--disable-notifications");
		
	    driver=new ChromeDriver(chromeOptions);
	    page=new PageLocators(driver);
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user is entering the search term {string}")
	public void user_is_entering_the_search_term(String name ) {
//		searchterm=driver.findElement(By.name("q"));
//		searchterm.sendKeys(text);
//		
		page.searching(name);
		
		
	    
	    //throw new io.cucumber.java.PendingException();
	}

	@When("^user is pressing the enter key$")
	public void user_is_pressing_the_enter_key() {
	    // Write code here that turns the phrase above into concrete actions
		//searchterm.sendKeys(Keys.ENTER);
	    //throw new io.cucumber.java.PendingException();
		page.enter();
	    
	}

	@Then("user is able to see the results of the search terms")
	public void user_is_able_to_see_the_results_of_the_search_terms() {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean status=driver.findElement(By.partialLinkText("Selenium")).isDisplayed();
		Assert.assertTrue(status);//		if(status)
//		{
//			System.out.println("I am able to see the results");
//		}
//	   // throw new io.cucumber.java.PendingException();
	}



}
