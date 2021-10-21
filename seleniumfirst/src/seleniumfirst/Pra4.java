package seleniumfirst;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pra4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikki\\JavaProgarams\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gcreddy.com/project/create_account.php");
		driver.findElement(By.xpath("//td//input[@value='m']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nikhil");
		driver.findElement(By.name("lastname")).sendKeys("DD");
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Dec");
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		WebElement staticdropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select dropdown1 = new Select(staticdropdown1);
		dropdown1.selectByVisibleText("1989");
		List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		int count = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
			if (text.equalsIgnoreCase("22")) {
				driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
				break;
			}

		}
		driver.findElement(By.name("email_address")).sendKeys("Damaramch@gamil.com");
		driver.findElement(By.name("company")).sendKeys("ICICI Bank Ltd");
		driver.findElement(By.name("street_address")).sendKeys("Gachibowli");
		driver.findElement(By.name("suburb")).sendKeys("Hyderabad");
		driver.findElement(By.name("postcode")).sendKeys("500082");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.xpath("//select[@name='country']")).click();
		WebElement staticdropdown2 = driver.findElement(By.xpath("//select[@name='country']"));
		Select dropdown2 = new Select(staticdropdown2);
		dropdown2.selectByVisibleText("India");
		driver.findElement(By.name("telephone")).sendKeys("8019614361");
		driver.findElement(By.name("newsletter")).click();

		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmation")).sendKeys("123456");
		driver.findElement(By.id("tdb4")).click();

	}

}
