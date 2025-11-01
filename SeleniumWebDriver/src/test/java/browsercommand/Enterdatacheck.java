package browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Enterdatacheck {
  @Test
  void Datacheck () {
	  ChromeDriver cb=new ChromeDriver();
		cb.get("https://www.google.co.in/");
		//WebElement f=cb.findElement(By.xpath("//textarea[@id='APjFqb']"));
		//f.sendKeys("java",Keys.ENTER);
		String ActualResult=cb.getTitle();
		System.out.println(ActualResult);
		String ExpertedResult="Google";
		Assert.assertEquals(ActualResult, ExpertedResult);
		cb.quit();
  }
}
