package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikki\\JavaProgarams\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
		.click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath(
				"//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='HYD']"))
		.click();
		Thread.sleep(4000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if(driver.findElement(By.id("custom_date_picker_id_2")).getAttribute("style").contains("0.5"))
		{
			System.out.println("it is Enabled");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}

		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"))
		.click();
		WebElement staticdropdown = driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);

		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"))
		.click();
		Thread.sleep(4000L);
		WebElement staticdropdown1 = driver
				.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		Select dropdown1 = new Select(staticdropdown1);
		dropdown1.selectByVisibleText("INR");
		Thread.sleep(2000L);
		driver.findElement(
				By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']"))
		.click();
		// Assert.assertTrue(driver
		// .findElement(By.cssSelector(
		// "input[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']"))
		// .isSelected());
		Thread.sleep(2000L);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
	}

}
