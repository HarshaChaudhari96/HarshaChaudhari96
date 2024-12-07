package DAY28;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndWindowHandle {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// navigate methods
		WebElement el = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		el.click();
		// driver.navigate().refresh();
		// driver.navigate().back();

		Set<String> win = driver.getWindowHandles();
		for (String page:win) {
			String title = driver.switchTo().window(page).getTitle();
			if(title.equals("Your Store")) {
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
		}

	}
}
