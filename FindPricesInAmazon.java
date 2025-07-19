package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindPricesInAmazon {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones", Keys.ENTER);// search for product
		List<WebElement> allPrices = driver.findElements(By.className("a-price-whole"));
		List<String> list = new ArrayList<String>();
		
		for (WebElement each : allPrices) {
			String Price = each.getText();
			list.add(Price);
		}
		System.out.println(list);
	}
	
}
