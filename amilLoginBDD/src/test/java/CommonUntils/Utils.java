package CommonUntils;

import java.io.IOException;
import java.util.Properties;

import ContantVariables.constants;

public class Utils {

	private static Utils UtilsInstance;
	private Utils() {
		
	}
	public static Utils getInstance() {
		if (UtilsInstance==null) {
			UtilsInstance=new Utils();
			
		}
	return UtilsInstance;
	}
	
	Properties properties=null;
	public  void loadProperties() {
		properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
			//test
		}
		constants.BROWSER	        = properties.getProperty("Browser");
		constants.URL               = properties.getProperty("Url");
		constants.DRIVER_LOCATION	= properties.getProperty("DriverLocation");
		constants.USERNAME          = properties.getProperty("Username");
		constants.PASSWORD          = properties.getProperty("Password");

	}

}
