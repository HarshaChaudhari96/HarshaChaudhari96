package DAY26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get methods
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		//conditional methods
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		ele.sendKeys("hello");
		boolean status = ele.isEnabled();
		System.out.println(status);
		
		//Browser methods
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//driver.close();
		driver.quit();
	}
}
