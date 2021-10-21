package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookauto {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dnikki.522@gmail.com");
		// driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("8019614362");
		// driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12355");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
