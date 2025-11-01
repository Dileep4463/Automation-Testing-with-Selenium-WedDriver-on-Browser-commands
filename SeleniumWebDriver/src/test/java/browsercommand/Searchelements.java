package browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver cb=new ChromeDriver();
	cb.get("https://www.google.co.in/");
	WebElement f=cb.findElement(By.xpath("//textarea[@id='APjFqb']"));
	f.sendKeys("java",Keys.ENTER);
	cb.quit();
	}

}
