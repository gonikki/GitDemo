package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/"); // URL in the browser
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);

		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);

	}

}