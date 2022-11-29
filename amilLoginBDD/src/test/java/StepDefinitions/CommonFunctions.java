package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import CommonUntils.Utils;
import DriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonFunctions {
	
	@Before()
	public static void LaunchBrowserMet() {

		Utils.getInstance().loadProperties();
		
//		DriverManager.setDriver(new ChromeDriver());
//		if (DriverManager.getDriver()==null) {
			DriverManager.launchBrowser();
//		}

	}

	@After
	public void tearDown() throws Exception {
		
		DriverManager.getDriver().quit();
		Thread.sleep(3000);
	}
}
