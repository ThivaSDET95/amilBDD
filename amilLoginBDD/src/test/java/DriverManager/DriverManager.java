package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import CommonUntils.Utils;
import ContantVariables.constants;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static WebDriver driver;

	public static WebDriver getDriver() {

		return driver;
	}
	
	public static void launchBrowser() {
		switch (constants.BROWSER) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "Ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}

	}

}
