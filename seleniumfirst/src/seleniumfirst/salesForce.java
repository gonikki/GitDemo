package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class salesForce {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("#username")).sendKeys("hi i  am nikhil");
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("2563579");
		driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();

	}

}
