package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("username")).sendKeys("dddddd");
		// driver.findElement(By.name("pw")).sendKeys("12345");
		// driver.findElement(By.xpath("//*[@id='Login']")).click();
		// driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("hhhhhh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
