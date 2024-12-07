package DAY28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignments {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();

		// total Links
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//a")));
		List<WebElement> totalLinks = driver
				.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//a"));
		System.out.println(totalLinks.size());

		// clicking of All elements
		for (WebElement dlink : totalLinks) {
			dlink.click();

		}

		// get all tab ids
		/*
		 * Set<String> IDs = driver.getWindowHandles(); System.out.println(IDs.size());
		 * List<String> Ids1 =new ArrayList(IDs); //System.out.println(Ids1.get(0));
		 * 
		 * for (int i= 0;i<Ids1.size();i++) { System.out.println(Ids1.get(i)); }
		 */

		// close specific window
		Thread.sleep(3000);
		Set<String> IDs = driver.getWindowHandles();
		for (String page : IDs) {
			String title = driver.switchTo().window(page).getTitle();
			String closepage = "Automation - Wikipedia";

			if (title.equals(closepage)) {
				driver.close();
			}
			
		}
		//System.out.println(driver.getCurrentUrl());
	}
}
