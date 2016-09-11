package application.main.stepDefImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("latest deals");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//li//h2[contains(text(),'Samsung')]")).click();
        Thread.sleep(5000);
        driver.quit();
	}

	public void userNavigate() {
		
	}

	public void enteringDetails(String username, String password) {
		
	}

	public void enteringApplication() {
		
	}
}
