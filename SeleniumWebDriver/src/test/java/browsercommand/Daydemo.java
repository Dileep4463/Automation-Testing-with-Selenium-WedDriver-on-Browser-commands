package browsercommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Daydemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cb=new ChromeDriver();
		cb.get("https://www.facebook.com/");
		Thread.sleep(3000);
		cb.findElement(By.linkText("Create new account")).click();
		WebElement day=cb.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("14");
		Thread.sleep(3000);
		s.selectByVisibleText("10");
		Thread.sleep(3000);
		
		///day unonion option
		List<WebElement> allele=s.getOptions();
		System.out.println(allele.size());
		
		//for (int e=0; e<allele.size(); e++) 
		//{
		//	System.out.println(allele.get(e).getText());
		//	allele.get(e).click();
		//	Thread.sleep(1000);
		//}
		for (WebElement e : allele) {
			System.out.println(e.getText());
			String txt=e.getText();
			if(txt.matches("10")) {
				e.click();
				break;
			}
		}
	}

}
