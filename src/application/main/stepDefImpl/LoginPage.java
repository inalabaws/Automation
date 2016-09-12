package application.main.stepDefImpl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	Screenshot screenshot= new Screenshot();
	static int count=1;
	public static void main(String args[])
	{
		LoginPage login= new LoginPage();
		login.loginValidation("mvenkat@dhs.gov","inaflash");
		login.loginValidation("","inaflash");
		login.loginValidation("mvenkat@dhs.gov","");
		login.loginValidation("123","inaflash");
		login.loginValidation("****", "((((((");
	}
	
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
		
		try{
		if(driver.findElement(By.xpath(".//span[@class='glyphicon glyphicon-exclamation-sign']")).isDisplayed()==true)
		{
			screenshot.takeScreenshot("LoginPage","failed scenario"+count);
			count++;
			driver.quit();
		}
		}catch(Exception e)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ele) {
				// TODO Auto-generated catch block
				ele.printStackTrace();
			}
			screenshot.takeScreenshot("LoginPage", "Passed Scenario");
			//Assert.assertEquals("DHS FLASH", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
			driver.quit();
		}
	}
	
	public void loginUI(String username, String password)
		{
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			SharedDataUtil.setDriver(driver);
			driver.get("http://52.90.148.37:8080/flash-ui");
			driver.manage().window().maximize();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(".//input[@placeholder='Username']")).sendKeys(username);
			driver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@name='submit']")).click();
			
			screenshot.takeScreenshot("LoginPage", "Passed Scenario");
			//Assert.assertEquals("DHS FLASH", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
