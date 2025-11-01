package browsercommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
	static WebDriver cb;
			public void female() {
				cb.findElement(By.xpath("//label[normalize-space()='Female']")).click();
			}
			public void male() {
				cb.findElement(By.xpath("//label[normalize-space()='Male']")).click();
			}
			public void Custom() {
				cb.findElement(By.xpath("//label[normalize-space()='Custom']")).click();
			}
	public void allRadio() throws InterruptedException
	{
		List<WebElement> allele=cb.findElements(By.xpath("//input[@name='sex']"));
		int cnt=allele.size();
		System.out.println(cnt);
		
		for (int e=0; e<cnt; e++) 
		{
			Thread.sleep(3000);
			allele.get(e).click();
		}
		//for (WebElement e: allele)
		//{
			//System.out.println(e.getText());
			//String txt=e.getText();
			//if(txt.matches("Male"))
			//{
				//e.click();
				//break;
//			}
		//}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		cb=new ChromeDriver();
		cb.get("https://www.facebook.com/");
		Thread.sleep(3000);
		cb.findElement(By.linkText("Create new account")).click();
		Radiobuttons r=new Radiobuttons();
		r.allRadio();
		
	}

}
