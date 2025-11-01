package browsercommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewoneTest {

  @Test(description="newone",enabled=true,priority=1,groups="login")
	  void testcase() throws InterruptedException{
			ChromeDriver cb=new ChromeDriver();
			cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
			Thread.sleep(1000);
			cb.getTitle();
			Thread.sleep(1000);
			cb.findElement(By.xpath("//input[@name='id']")).sendKeys("sam");
			Thread.sleep(1000);
			cb.findElement(By.xpath("//input[@name='pass']")).sendKeys("sadar");
			Thread.sleep(2000);
			cb.findElement(By.xpath("//input[@value='Login']")).click();
			Thread.sleep(1000);
			Alert popup=cb.switchTo().alert();
			String ActualResult=popup.getText();
			System.out.println(ActualResult);
			String ExceptedResult="Invalid UserID";
			Assert.assertEquals(ActualResult, ExceptedResult);
			popup.accept();
			cb.quit();
}
}
