package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyBankLoginFunctionality {
	
	   WebDriver driver ;
	
	@Given("^I am on Login page$")
	public void i_am_on_Login_page()  {
		
		// Opening the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chirag\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// open the url
	    driver.get("https://uat1.nhsp.uk");
	    
	    // Maximise window 
	    driver.manage().window().maximize();
	}

	@Given("^entering valid  <username> and invalid <password>$")
	public void entering_valid_username_and_invalid_password(DataTable arg1){
	   
		//entering valid username and invalid password
		driver.findElement(By.xpath("/html//input[@id='login']")).sendKeys("RyallM2908");
		driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys("Password11");
		
		//click on login button
		driver.findElement(By.xpath("/html/body//form[@action='/login/']//button[@value='Login']")).click();
		
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		
		
	    	}

	@Then("^Login should not be successful$")
	public void login_should_not_be_successful() throws Throwable {
	   
	}


	
	
	
	

}
