package org.stepde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stedef {
	public WebDriver driver;
	@Given("user have to in loginpage")
	public void user_have_to_in_loginpage() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
	  
	}

	@When("user have enter into invalid username and invalid password")
	public void user_have_enter_into_invalid_username_and_invalid_password() {
	  WebElement user= driver.findElement(By.id("email"));
	  user.sendKeys("qer");
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("123");
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() {
		System.out.println("jdkj");
	   	}

	@Then("user have to be invalid credentiol")
	public void user_have_to_be_invalid_credentiol() {
	  	}


}
