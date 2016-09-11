package application.main.stepDefImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String args[]) throws InterruptedException
	{
		List<String> features= new ArrayList<String>();
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("latest deals");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		List<WebElement> ele= driver.findElements(By.xpath(".//li//h2[contains(text(),'Samsung')]"));
		java.util.Iterator<WebElement> a= ele.iterator();
		while(a.hasNext())
		{
			WebElement ele1=a.next();
			System.out.println("Product Name: "+ele1.getText());
			ele1.click();
		}
		Thread.sleep(5000);
		System.out.println("price: "+driver.findElement(By.xpath(".//*[@id='priceblock_ourprice']")).getText());
		List<WebElement> ele2= driver.findElements(By.xpath(".//*[@id='feature-bullets']/ul/li/span"));
		java.util.Iterator<WebElement> b= ele2.iterator();
		while(b.hasNext())
		{
			WebElement ele3=b.next();
			features.add(ele3.getText());
		}
		System.out.println("------------------Features----------------------");
		for(String c: features)
		{
		System.out.println("* "+c);
		}
		driver.quit();
	}

}
