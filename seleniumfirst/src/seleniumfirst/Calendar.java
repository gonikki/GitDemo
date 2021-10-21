package seleniumfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("December")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();

		}
		List<WebElement> dates = driver.findElements(By.cssSelector("[class='day']"));
		int count = driver.findElements(By.cssSelector("[class='day']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("[class='day']")).get(i).getText();
			if (text.equalsIgnoreCase("22")) {
				driver.findElements(By.cssSelector("[class='day']")).get(i).click();
				break;
			}
		}

	}
}
