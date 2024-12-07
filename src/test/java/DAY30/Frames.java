package DAY30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//switching frame using index
	driver.switchTo().frame(0);
	driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("harsha");
	driver.switchTo().defaultContent();
	
	//switching frame using web element
	WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys(" Chaudhari");
	driver.switchTo().defaultContent();
	
	//switching frame 3
	WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys(" Chaudhari");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@data-answer-value=\"Web Testing\"]")).click();
	
	driver.switchTo().defaultContent();
	
	//Assignment Question
	driver.switchTo().frame(4);
	driver.findElement(By.cssSelector("input[name='mytext5']")).sendKeys("Frame 5");
	driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
	
	WebElement logo = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
	
	if(logo.isDisplayed()) {
		System.out.println("Logo is visible");
	}
	
	
}
}
