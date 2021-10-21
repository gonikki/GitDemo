package seleniumfirst;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gcreddy.com/project/login.php");
		driver.findElement(By.name("email_address")).sendKeys("meghala1234S@gmail.com");
		driver.findElement(By.name("password")).sendKeys("xyz4321");
		driver.findElement(By.id("tdb1")).click();
		try {
			boolean Exlink = driver.findElement(By.linkText("Log Off")).isDisplayed();
			if (Exlink == true) {
				System.out.println("Customer Login is Successful – Passed");

			}
		} catch (NoSuchElementException e1) {
			System.out.println("Customer Login is Successful – Failed");

		}
	}

}
