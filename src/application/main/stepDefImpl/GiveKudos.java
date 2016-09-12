package application.main.stepDefImpl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GiveKudos {

Screenshot screenshot= new Screenshot();
	static int count=1;
	public static void main(String args[])
	{
		LoginPage login= new LoginPage();
		GiveKudos kudos= new GiveKudos();
		login.loginUI("praj@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee("talla", "Teamwork", "Good work");
		login.loginUI("praj@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee("talla", "Teamwork", "Good work");
	}
	
public void giveKudosToEmpl0yee(String name, String awardType, String comments)
	{
		WebDriver driver= SharedDataUtil.getDriver();
		driver.findElement(By.xpath(".//*[@id='toEid']")).click();
		driver.findElement(By.xpath(".//*[@id='toEid']")).sendKeys(name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			if(driver.findElement(By.xpath(".//ul[@id='ui-id-1']/li[1]/div")).isDisplayed()==true)
			driver.findElement(By.xpath(".//ul[@id='ui-id-1']/li[1]/div")).click();
			else
			{
			Assert.fail("No employees are available to give kudos");
			}
			new Select(driver.findElement(By.xpath(".//*[@id='usertype']"))).selectByVisibleText(awardType);
			driver.findElement(By.xpath(".//*[@id='employeeForm']/fieldset/div[4]/textarea")).sendKeys(comments);
		}catch(Exception e)
		{
			
		}
		//Assert.assertEquals("Gives Kudos", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
		screenshot.takeScreenshot("GiveKudos", "Before giving the kudos"+count);
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		screenshot.takeScreenshot("GiveKudos", "After giving the kudos"+count);
		count++;
		driver.quit();
	}
}
