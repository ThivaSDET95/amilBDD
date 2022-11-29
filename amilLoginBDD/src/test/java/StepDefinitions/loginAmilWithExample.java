package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ContantVariables.constants;
import DriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginAmilWithExample {
WebDriver driver;
	@Given("User is on amil login page")
	public void user_is_on_amil_login_page() {
		DriverManager.getDriver().get(constants.URL);
		
	}

	@When("user enters below login credentials Username {string} Password {string}")
	public void user_enters_below_login_credentials_username_password(String uName, String pWord) throws Exception {
		try {
			DriverManager.getDriver().findElement(By.id("txtusername")).sendKeys(uName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			DriverManager.getDriver().findElement(By.id("txtpassword")).sendKeys(pWord);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("user clicks login button")
	public void user_clicks_login_button() {
		DriverManager.getDriver().findElement(By.id("btnSignIn")).click();

	}
	@Then("close the broswer")
	public void close_the_broswer()  {
		System.out.println("will tearDown");
		//		DriverManager.getDriver().quit();
		

	}



}
