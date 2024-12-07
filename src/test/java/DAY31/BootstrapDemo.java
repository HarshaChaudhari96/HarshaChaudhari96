package DAY31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// bootstrap demoo
		driver.findElement(By.xpath("//button[@class = 'multiselect dropdown-toggle btn btn-default']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class = 'checkbox']//input"));

		//selecting all elements 
		for (WebElement chbox : ele) {
			chbox.click();
			String names = chbox.getAttribute("value");
			System.out.println(names);
			
			//deselect individual elements
			if(names.equals("Bootstrap") || names.equals("angular")) {
				chbox.click();
			}
		}

	}
}
