package DAY31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// select by visible text
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		// country.click();
		Select ele = new Select(country);
		ele.selectByVisibleText("China");

		// select by value
		Thread.sleep(3000);
		ele.selectByValue("japan");

		// select by index
		Thread.sleep(3000);
		ele.selectByIndex(3); // germany

		// Different types of dropdown
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select aml = new Select(animal);
		aml.selectByValue("cheetah"); // cheetah

		// getOptions for getting all options 
		List<WebElement> allEle = ele.getOptions();
		System.out.println("size" + allEle.size());

		for (int i = 0; i < allEle.size(); i++) {
			System.out.println(allEle.get(i).getText());
		}

	}
}
