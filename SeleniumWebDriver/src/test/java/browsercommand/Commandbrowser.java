package browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commandbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String s=cd.getTitle();
		Thread.sleep(3000);
		System.out.println(s);
		Thread.sleep(3000);
		//WebElement we=cd.findElement(By.xpath("//input[@name='id']")).sendKeys("sadhar");
		WebElement n=cd.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(3000);
		n.sendKeys("bonaladileep5159@gmail.com");
		Thread.sleep(3000);
		WebElement p=cd.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(3000);
		p.sendKeys("D4lppi@09&p");
		p.clear();
		p.sendKeys("Dileep4449909p");
		Thread.sleep(3000);
		cd.findElement(By.name("login")).click();
		cd.findElement(By.linkText("Forgotten password?")).click();
		//Thread.sleep(3000);
		//System.out.println(we);
		Thread.sleep(3000);
		cd.quit();
	}

}
