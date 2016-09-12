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
		kudos.giveKudosToEmpl0yee(", arjunnujra");
		login.loginUI("praj@dhs.gov","inaflash");
		kudos.giveKudosToEmpl0yee(", arjunnujra");
	}
	
public void giveKudosToEmpl0yee(String name)
	{
		WebDriver driver= SharedDataUtil.getDriver();
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[7]/a")).click();
		Assert.assertEquals("Gives Kudos", driver.findElement(By.xpath(".//*[@id='content-container']/h1")).getText().trim());
		new Select(driver.findElement(By.xpath(".//*[@id='toEid']"))).selectByVisibleText(name);
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
