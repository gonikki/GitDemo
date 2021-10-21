package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pra6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gcreddy.com/project/admin/login.php");
		String Url1 = driver.getCurrentUrl();
		driver.findElement(By.linkText("Online Catalog")).click();
		String Url2 = driver.getCurrentUrl();
		if (Url2.equals("http://gcreddy.com/project/")) {
			System.out.println("redirecting functionality from admin to user interface before login - Passed");

		} else {
			System.out.println("redirecting functionality from admin to user interface before login - Failed");
		}
		driver.navigate().back();
		String Url3 = driver.getCurrentUrl();
		driver.findElement(By.name("username")).sendKeys("gcreddy");
		driver.findElement(By.name("password")).sendKeys("Temp@2020");
		driver.findElement(By.id("tdb1")).click();
		String Url4 = driver.getCurrentUrl();
		if (Url1 == Url3) {
			System.out.println("redirecting functionality from admin to user interface After login - Passed");

		} else {
			System.out.println("redirecting functionality from admin to user interface After login - Failed");
		}
		System.out.println(Url1);
		System.out.println(Url2);
		System.out.println(Url3);
		System.out.println(Url4);

	}

}
