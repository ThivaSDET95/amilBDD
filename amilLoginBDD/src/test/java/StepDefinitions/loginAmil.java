package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ContantVariables.constants;
import DriverManager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginAmil {

	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		DriverManager.getDriver().get(constants.URL);
//		comtestFunction.getDriver().get("https://test-portal.amilfreight.com/signin");
	}
	@When("user enters below login credentials")
	public void user_enters_below_login_credentials(DataTable data) throws InterruptedException {
		List<List<String>> tData= data.asLists(String.class);
		for (List<String> iData : tData) {
		String uName=	iData.get(0);
		String pWord=	iData.get(1);
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
	try {
		DriverManager.getDriver().findElement(By.id("btnSignIn")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
Thread.sleep(3000);
	DriverManager.getDriver().navigate().refresh();

}
			
//		}
//		List<Map<String, String>> loginCredentials=	data.asMaps(String.class,String.class);
//		for (Map<String, String> map : loginCredentials) {
//			try {
//				DriverManager.getDriver().findElement(By.id("txtusername")).sendKeys(map.get("Username"));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			try {
//				DriverManager.getDriver().findElement(By.id("txtpassword")).sendKeys(map.get("Password"));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			try {
//				DriverManager.getDriver().findElement(By.id("btnSignIn")).click();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//Thread.sleep(3000);
//			DriverManager.getDriver().navigate().refresh();
//
//		}
	}
	@And("user clicks sumbit button")
	public void user_clicks_sumbit_button() {
		System.out.println("clicks it");
		
	}
	@Then("close broswer")
	public void close_broswer() {
		System.out.println("browser will close");
	}
	
	


}
