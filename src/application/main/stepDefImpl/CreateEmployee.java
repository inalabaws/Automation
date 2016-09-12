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
		employee.createEmployee("raaki", "nizampatnam", "nraaki@dhs.gov", "inaflash", "IT");
		login.loginValidation("nraaki@dhs.gov", "inaflash");
		login.loginUI("praj@dhs.gov","inaflash");
		employee.createEmployee("raaki", "nizampatnam", "nraaki@dhs.gov","inaflash", "IT");
	}
	
	public void createEmployee(String firstName, String lastName, String email, String password, String organization)
	{
		WebDriver driver= SharedDataUtil.getDriver();
		driver.findElement(By.xpath(".//a[@href='EmployeeServlet']")).click();
		//Assert.assertEquals("Create Employee", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys(firstName);
		driver.findElement(By.xpath(".//*[@id='lname']")).sendKeys(lastName);	
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='passsword']")).sendKeys(password);	
		new Select(driver.findElement(By.xpath(".//*[@id='department']"))).selectByVisibleText(organization);
		screenshot.takeScreenshot("CreateEmploee", "Before Creating an Employee"+count);
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		screenshot.takeScreenshot("CreateEmploee", "After Creating an Employee"+count);
		count++;
		driver.quit();
	}
}
