package DAY24;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testxPath {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.findElement(By.xpath("//i[@class=\"fa-solid fa-phone\"]")).click();
			System.out.println("succeess");
			
			WebElement name =  driver.findElement(By.xpath("//input[@name='name']"));
			name.sendKeys("HARSHA");
			name.clear();
			name.sendKeys("HELLO WORLD");
			driver.findElement(By.linkText("Desktops")).click();
			
			driver.findElement(By.xpath("//*[text()='Show All Desktops']"));
			
			
			
		}
}
