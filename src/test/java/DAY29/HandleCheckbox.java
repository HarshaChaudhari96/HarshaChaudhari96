package DAY29;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// select checkbox
		List<WebElement> e1 = driver
				.findElements(By.xpath("//*[@class=\"form-check form-check-inline\"]//*[@type=\"checkbox\"]"));
		System.out.println(e1.size());

		for (WebElement check : e1) {
			check.click();
			//Thread.sleep(1000);

			// if (label.equals("Sunday")) {
			if (check.isSelected()) {
				check.click();

			}
		}
		
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Alert myAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(myAlert.getText());
		myAlert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert  cnfmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		cnfmAlert.dismiss();
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert  promptAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		promptAlert.sendKeys("");
		promptAlert.sendKeys("Harsha Chaudhari");
		promptAlert.accept();
		
	}
}
