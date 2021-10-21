package seleniumfirst;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println((driver.findElements(By.tagName("a")).size()));
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting driver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement clodriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(clodriver.findElements(By.tagName("a")).size());
		for (int i = 1; i < clodriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			clodriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
