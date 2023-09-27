package StepDefintionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class StepsForOrangeHRM {
	WebDriver driver;
	ChromeOptions chromeOptions;
	@Given("user is navigate to the orangeHRM")
	public void user_is_navigate_to_the_orange_hrm() {
		chromeOptions = new ChromeOptions(); 
	    //chromeOptions.addArguments("--disable-notifications");
		
	    driver=new ChromeDriver(chromeOptions);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("user is entering the credentials {string} and {string}")
	public void user_is_entering_the_credentials_and(String username, String password) {
	 WebElement username1=driver.findElement(By.xpath("//input[@name='username']"));
	 System.out.println("user name is  "+username1);
	  WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
	
	  username1.sendKeys(username);
	  password1.sendKeys(password);
	}

	@When("user is clicking the login button")
	public void user_is_clicking_the_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is on the home page of OrangeHRM")
	public void user_is_on_the_home_page_of_orange_hrm()
	{
		String text=driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals(text,"Dashboard");
	    
	}

	
	
}
