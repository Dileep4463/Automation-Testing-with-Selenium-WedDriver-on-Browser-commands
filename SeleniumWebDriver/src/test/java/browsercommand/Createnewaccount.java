package browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createnewaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	ChromeDriver cb=new ChromeDriver();
	cb.get("https://www.facebook.com/");
	Thread.sleep(3000);
	cb.findElement(By.linkText("Create new account")).click();
	Thread.sleep(3000);
	cb.findElement(By.name("firstname")).sendKeys("sam");
	Thread.sleep(3000);
	cb.findElement(By.name("lastname")).sendKeys("dhar");
	Thread.sleep(3000);
	//cb.findElement(By.xpath("//select[@id='day']")).sendKeys("10");
	WebElement day=cb.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(day);
	s.selectByValue("10");
	Thread.sleep(3000);
	s.selectByIndex(15);
	Thread.sleep(3000);
	s.selectByVisibleText("2");
	Thread.sleep(3000);
	cb.findElement(By.xpath("//select[@id='month']")).sendKeys("June");
	Thread.sleep(3000);
	cb.findElement(By.xpath("//select[@id='year']")).sendKeys("2004");
	Thread.sleep(3000);
	cb.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	Thread.sleep(3000);
	cb.findElement(By.name("reg_email__")).sendKeys("cobav14937@dlbazi.com");
	Thread.sleep(3000);
	cb.findElement(By.name("reg_passwd__")).sendKeys("155541#2@2115");
	Thread.sleep(3000);
	cb.findElement(By.linkText("Learn more")).click();
	Thread.sleep(3000);
	cb.findElement(By.partialLinkText("Terms")).click();
	Thread.sleep(3000);
	cb.findElement(By.linkText("Privacy Policy")).click();
	Thread.sleep(3000);
	cb.findElement(By.partialLinkText("Cookies Policy")).click();
	Thread.sleep(3000);
	cb.findElement(By.name("websubmit")).click();
	Thread.sleep(1000000);
	cb.quit();
	
	}

}
