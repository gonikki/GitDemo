package seleniumfirst;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parentandchidlink {

	public parentandchidlink(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		// driver.findElement(By.cssSelector(".im-para.red")).getText();
		// System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

	}

}
