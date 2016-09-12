package application.main.stepDefImpl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String args[])
	{
		LoginPage login= new LoginPage();
		login.loginValidation("mvenkat@dhs.gov","inaflash");
	}

	@SuppressWarnings("deprecation")
	public void loginValidation(String username, String password)
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://52.90.148.37:8080/flash-ui");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		if(driver.findElement(By.xpath(".//span[@class='glyphicon glyphicon-exclamation-sign']")).isDisplayed()==true)
		{
			
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("DHS FLASH", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
		driver.quit();
	}
}
