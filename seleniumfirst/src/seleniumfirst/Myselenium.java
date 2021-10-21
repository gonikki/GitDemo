package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		// driver.get("https://google.com");
		// driver.navigate().back();
		// driver.findElement(By.id("search")).sendKeys("BTS");

		// driver.close();
		// driver.findElement(By.id("email")).sendKeys("dnikki.522@gamil.com");
		// driver.findElement(By.id("pass")).sendKeys("12345");
		// driver.findElement(By.xpath("//*[@id='u_0_d_tq']")).click();
		// driver.findElement(By.linkText("Forgotten password?")).click();

		driver.findElement(By.cssSelector("#email")).sendKeys("hhhhhh");
	}

}
