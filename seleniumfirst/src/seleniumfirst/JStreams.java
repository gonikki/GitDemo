package seleniumfirst;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JStreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//td[1]")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tr//td[1]"));
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		// Assert.assertTrue(originalList.equals(sortedList));
		List<Object> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr//tb[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;

	}

}
