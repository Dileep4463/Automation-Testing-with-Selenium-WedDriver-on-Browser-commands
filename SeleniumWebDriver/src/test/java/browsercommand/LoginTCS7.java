package browsercommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTCS7 {
  @Test
  void testcase7() throws InterruptedException {
		    ChromeDriver cb=new ChromeDriver();
			//Enter URL in the chrome browser
			cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
			Thread.sleep(3000);
			//identifying user id field
			WebElement ud=cb.findElement(By.xpath("//input[@name='id']"));
			//entering the valid user id
			ud.sendKeys("sadar");
			Thread.sleep(3000);
			//identifying the password field
			WebElement pw=cb.findElement(By.xpath("//input[@name='pass']"));
			//Entering the valid password
			pw.sendKeys("sadar");
			Thread.sleep(3000);
			//identifying the login button
			WebElement lg=cb.findElement(By.xpath("//input[@value='Login']"));
			//click the login button
			lg.click();
			Alert popup=(Alert) cb.switchTo().activeElement();
			String ActualResult=popup.getText();
			System.out.println(ActualResult);
			/*Thread.sleep(3000);
			String ExpertedResult="MainHMR";
			Assert.assertEquals( ActualResult, ExpertedResult);
			Thread.sleep(3000);
			cb.quit();*/
			}
  }
