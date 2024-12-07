package DAY31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// login on OrangeHRM
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// select PIM MENU
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();

		//click on dropdown button
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]"))
				.click();

		//count the size
		List<WebElement> ele = driver.findElements(By.xpath("//*[@role=\"option\"]//span"));
		System.out.println(ele.size());
		
		for(int i=0; i<ele.size();i++) {
			String Oname = ele.get(i).getText();
			System.out.println(Oname);
			
			if(Oname.equals("Automaton Tester")) {
				ele.get(i).click();
				System.out.println("option Selected");
			}
		}
		
		
	}
}
