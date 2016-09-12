package application.main.stepDefImpl;

import org.openqa.selenium.WebDriver;

public class SharedDataUtil {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		SharedDataUtil.driver = driver;
	}

	
}
