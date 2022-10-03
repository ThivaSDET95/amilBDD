package StepDefinitions;

import org.openqa.selenium.WebDriver;

import CommonUntils.Utils;
import DriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonFunctions {
	
	@Before
	public static void LaunchBrowser() {

		Utils.getInstance().loadProperties();
		
		
		if (DriverManager.getDriver()==null) {
			DriverManager.launchBrowser();
		}

	}

//	@After
//	public void tearDown() throws Exception {
//	
//		DriverManager.getDriver().close();
//	}
}
