package application.main.stepDefImpl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateEmployee {
	
	Screenshot screenshot= new Screenshot();
	
	static int count=1;
	public static void main(String args[])
	{
		LoginPage login= new LoginPage();
		CreateEmployee employee= new CreateEmployee();
		login.loginUI("praj@dhs.gov","inaflash");
		employee.createEmployee("ravi", "nizampatnam", "nravi@dhs.gov", "9033090330", "inaflash", "nravi@dhs.gov", "IT", "Regular");
		login.loginValidation("nravi@dhs.gov", "inaflash");
	}
	
	public void createEmployee(String firstName, String lastName, String email, String phoneNumber, String userName, String password, String department, String type)
	{
		WebDriver driver= SharedDataUtil.getDriver();
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[4]/a")).click();
		Assert.assertEquals("Create Employee", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
		driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys(firstName);
		driver.findElement(By.xpath(".//*[@id='lname']")).sendKeys(lastName);	
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath(".//*[@id='passsword']")).sendKeys(userName);
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(password);	
		new Select(driver.findElement(By.xpath(".//*[@id='department']"))).selectByVisibleText(department);
		new Select(driver.findElement(By.xpath(".//*[@id='usertype']"))).selectByVisibleText(type);
		screenshot.takeScreenshot("CreateEmploee", "Before Creating an Employee");
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		screenshot.takeScreenshot("CreateEmploee", "After Creating an Employee");
		driver.quit();
	}
}
