package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertAssingnment {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Chitra");
        alert.dismiss();
        String text = driver.findElement(By.id("confirm_result")).getText();
        if(text.contains("User cancelled the prompt.")) {
        	System.out.println("The Alert is cancelled successfully");
        }
        else {
        	System.out.println("Something went wrong");
        }
	}

}
