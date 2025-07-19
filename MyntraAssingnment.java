package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyntraAssingnment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Bags",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='common-radioIndicator'])/parent::label")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']/parent::label")).click();
	String text = driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
	System.out.println("The count of Men Backpacks : " + text.substring(1,5));
	 Thread.sleep(5000);
	List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='product-brand']"));
	List<String> productBrands = new ArrayList<String>();
	
	for (WebElement each : elements) {
		
		productBrands.add(each.getText());
	}
	
	Set<String> uniqueProductBrands = new HashSet<>(productBrands);
	System.out.println("The Brands available for Men Backpacks are :");
	for (String string : uniqueProductBrands) {
		
		System.out.println(string);
	}
	System.out.println("Name of the Bags Avaialble for Men: ");
	List<WebElement> elements1 = driver.findElements(By.xpath("//h4[@class='product-product']"));
	for (WebElement webElement : elements1) {
		
		System.out.println(webElement.getText());
	}
	}

}
