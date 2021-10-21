package seleniumfirst;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GREENKART {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String[] itemsNeeded = { "Brocolli", "Potato", "Apple", "Mango", "Almonds" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);

	}

	private static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// List<WebElement> products =
		// driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}

			}

		}
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		// driver.findElement(By.xpath("//input[@class='promocode'")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		// driver.findElement(By.cssSelector("button.Place Order")).click();
		driver.findElement(By.cssSelector(".products > div:nth-child(4) > button:nth-child(14)")).click();
		driver.findElement(By.cssSelector(".wrapperTwo > div:nth-child(3) > select:nth-child(1)")).click();
		// driver.findElement(
		// By.cssSelector(".wrapperTwo > div:nth-child(3) > select:nth-child(1) >
		// option:nth-child(89)")).click();

		driver.findElement(By.xpath("//option[contains(text(),'India')]")).click();
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

	}


}
