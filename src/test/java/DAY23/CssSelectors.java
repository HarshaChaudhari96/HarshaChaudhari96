package DAY23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelectors {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//using tag and attribute	
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("Harsha");
		driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		boolean status = driver.findElement(By.cssSelector("img[alt=\"Facebook\"]")).isDisplayed();
		System.out.println("Logo is displayed ");
		
		//using tag and id
		driver.findElement(By.linkText("Create new account")).click();
	
	
		// Fill out the registration form
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("HARSHA");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("CHAUDHARI");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("hc123@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("H123");

		// Select birth date
		Select day = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		day.selectByValue("16");

		Select month = new Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
		month.selectByIndex(3);

		Select year = new Select(driver.findElement(By.cssSelector("select[name='birthday_year']")));
		year.selectByValue("2000");

		// Select gender (Male)
		driver.findElement(By.cssSelector("input[value='1']")).click();

		// Click Sign Up
		//driver.findElement(By.cssSelector("button[name='websubmit']")).click();

		
	}
}
