//package StepDefinitions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.Before;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class comtestFunction {
//
//	private static WebDriver driver;
//	
//	public static WebDriver getDriver() {
//		return driver;
//	}
//
//
//	@Before
//	public void browserLaunch() {
//		if (driver==null) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			
//		}
//		
//		
//	}
//	public void teardown() {
//		driver.quit();
//	}
//}
