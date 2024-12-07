package DAY21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstWebElementTest {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://web.whatsapp.com/");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String actname = driver.getTitle();
		System.out.println(actname);
		if(actname.equals("Your Store")) {
			System.out.println("Test PASS");}
			else {
				System.out.println("TEST Failed");
			}
		}
	}
