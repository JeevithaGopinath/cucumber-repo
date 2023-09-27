package StepDefintionPackage;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForOPenHRMLoginwithHeaders {
	WebDriver driver;
	@Given("user is navigate to the orangeHRM application page")
	public void user_is_navigate_to_the_orange_hrm_application_page() {
		driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

//	@When("user is entering the  below credentials")
//	public void user_is_entering_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
//		List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
//
//        
//        for (Map<String, String> credential : credentials) {
//            String username = credential.get("UserName");
//            String password = credential.get("password");
//	      WebElement username1=driver.findElement(By.xpath("//input[@name='username']"));
//	 	 
//	 	  WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
//	 	
//	 	  username1.sendKeys(username);
//	 	  password1.sendKeys(password);
//        }
//	      
//	}
	@When("user is clicking the login button on the signin page")
	public void user_is_clicking_the_login_button_on_the_signin_page() {
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	}

	@Then("user is on the home page of OrangeHRM applications")
	public void user_is_on_the_home_page_of_orange_hrm_applications() {
		String text=driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals(text,"Dashboard");  
	}


}
