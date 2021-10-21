package seleniumfirst;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Par3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gcreddy.com/project/admin/login.php");
		String Url = driver.getCurrentUrl();
		driver.findElement(By.name("username")).sendKeys("gcreddy");
		driver.findElement(By.name("password")).sendKeys("Temp@2020");
		driver.findElement(By.cssSelector("span.ui-button-text")).click();

		System.out.println(Url);
		// Assert.assertTrue(Url.contentEquals("https://gcreddy.com/project/admin/login.php"));
		Assert.assertEquals(Url, "http://gcreddy.com/project/admin/login.php");
		try {
			boolean EL = driver.findElement(By.linkText("Logoff")).isDisplayed();
			if (EL == true) {
				System.out.println("Admin page loged in sucessfully");

			}
		} catch (NoSuchElementException e1) {
			System.out.println("Admin page loged in not sucessfully");

		}
		driver.close();
	}
}
