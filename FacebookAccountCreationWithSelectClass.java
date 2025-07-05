package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreationWithSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/"); // loading URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click(); // click on create new account button
		driver.findElement(By.name("firstname")).sendKeys("Chitra"); // Entering first name
		driver.findElement(By.name("lastname")).sendKeys("RaghulNivas"); // Entering last name

		driver.findElement(By.xpath("//input[contains(@name,'reg_email')][1]")).sendKeys("vyugaRaghul1@gmail.com"); // Entering
																													// email
																													// id
		driver.findElement(By.id("password_step_input")).sendKeys("Vyuga@1234"); // Entering password

		// selecting date from drop down
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sel1 = new Select(dayDD);
		sel1.selectByValue("8");

		// selecting month from drop down
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sel2 = new Select(monthDD);
		sel2.selectByValue("12");

		// selecting year from drop down
		WebElement yearDD = driver.findElement(By.id("year"));
		Select sel3 = new Select(yearDD);
		sel3.selectByValue("1994");

		driver.findElement(By.xpath("//input[@id='sex'][1]")).click(); // selecting gender radio button

	}

}
