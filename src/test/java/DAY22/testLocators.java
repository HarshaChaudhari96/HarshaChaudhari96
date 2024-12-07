package DAY22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;

public class testLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");

		// using ID
		boolean logostatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logostatus);

		// using class name
		List<WebElement> listelement = driver.findElements(By.className("list-unstyled"));
		System.out.println(listelement.size());

		// using LinkText
		// driver.findElement(By.linkText("Desktops")).click();
		// WebElement element = driver.findElement(By.linkText("Returns"));
		// ((Locatable) element).getCoordinates().inViewPort();

		// try {
		// element.click();
		// } catch (Exception e) {
		// new Actions(getWebDriver()).sendKeys(Keys.PAGE_DOWN).perform();
		// element.click();
		// }

		// using Partial Linktext
		//driver.findElement(By.partialLinkText("Soft")).click();

		//using tag name
		System.out.println(driver.findElements(By.tagName("a")).size());
		// driver.close();

		
	}

	private static WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
//}
