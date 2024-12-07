package DAY25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssAxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// use of Preceding siblings axes
		driver.findElement(By.xpath("//input[@id='email']/preceding-sibling::input")).sendKeys("Hello");

		// use of child with index
		driver.findElement(By.xpath("//div[@class='form-group']/child::input[2]")).sendKeys("WORLD");
		
		
	}

}
