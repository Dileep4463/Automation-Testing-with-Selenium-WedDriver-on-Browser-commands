package browsercommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newone {
	void testcase() throws InterruptedException{
		ChromeDriver cb=new ChromeDriver();
		cb.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		Thread.sleep(3000);
		cb.getTitle();
		Thread.sleep(3000);
		cb.findElement(By.xpath("//input[@name='id']")).sendKeys("sadar");
		Thread.sleep(3000);
		cb.findElement(By.xpath("//input[@name='pass']")).sendKeys("sadar");
		Thread.sleep(2000);
		Alert popup=cb.switchTo().alert();
		String ActualResult=cb.getTitle();
		System.out.println(ActualResult);
		popup.accept();
	}
}
