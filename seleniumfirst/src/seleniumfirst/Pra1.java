package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.id("pt-createaccount")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		if (url1.contains("wikipedia.org")) {
			System.out.println("1st Verification:" + "It is intermnal link -PASSED");
		} else {
			System.out.println("1st Verification:" + "It is not an intermnal link -FAILED");

		}
		driver.navigate().back();
		driver.get("http://www.seleniumhq.org");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		if (url2.contains("selenium.dev")) {
			System.out.println("2nd Verification:" + "It is External link -PASSED");
		} else {
			System.out.println("2nd Verification:" + "It is not an External link -FAILED");

		}
		System.out.println(url1);
		System.out.println(url2);
		driver.close();

	}

}
