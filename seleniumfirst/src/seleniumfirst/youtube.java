package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://youtube.com");
		driver.findElement(By.xpath("//div[@id='container']/div/input")).sendKeys("jennifer lopez");
		driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon:nth-child(1)")).click();

	}

}
