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

public class StepsforGoogleSearch1 {
	WebDriver driver;
	ChromeOptions chromeOptions;
	WebElement searchTerm;
	@Given("User is on the Google page")
	public void user_is_on_the_google_page() {
		chromeOptions = new ChromeOptions(); 
	    chromeOptions.addArguments("--disable-notifications");
		
	    driver=new ChromeDriver(chromeOptions);
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user is entering the search text {string}")
	public void user_is_entering_the_search_text(String text) {
	    // Write code here that turns the phrase above into concrete actions
		searchTerm=driver.findElement(By.name("q"));
		searchTerm.sendKeys(text);
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enters  the search button")
	public void user_enters_the_search_button() {
		searchTerm.sendKeys(Keys.ENTER);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user can see the results of the search term")
	public void user_can_see_the_results_of_the_search_term() {
		boolean status=driver.findElement(By.partialLinkText("Java")).isDisplayed();
		Assert.assertTrue(status);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
