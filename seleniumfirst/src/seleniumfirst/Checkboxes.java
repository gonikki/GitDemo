package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']"))
		.click();
		Thread.sleep(200L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(@class,highlight)]")).click();

		// Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@class,highlight)]")).click());
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active]")).click();
		// Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// WebElement staticdropdown =
		// driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		// Select dropdown = new Select(staticdropdown);
		// dropdown.selectByIndex(3);
		// System.out.println(dropdown.getFirstSelectedOption().getText());
		// dropdown.selectByVisibleText("AED");
		// System.out.println(dropdown.getFirstSelectedOption().getText());
		// dropdown.selectByValue("INR");
		// System.out.println(dropdown.getFirstSelectedOption().getText());

		// driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(4000L);
		// List<WebElement> options =
		// driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		// for (WebElement option : options) {
		// if (option.getText().equalsIgnoreCase("India")) {

		// option.click();
		// break;
		// }

		// }

	}

}
