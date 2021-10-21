import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pra2 {
	@Test

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		boolean le = driver.findElement(By.linkText("Gmail")).isDisplayed();
		if (le == true) {
			System.out.println("Gmail link is there");

		} else {
			System.out.println("there is no gmail link");
		}
	}

}
