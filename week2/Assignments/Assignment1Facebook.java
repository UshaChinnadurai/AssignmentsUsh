package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Facebook {

	public static void main(String[] args) throws InterruptedException {
		// Initiating the WebDriver
WebDriverManager.chromedriver().setup();

//Launching the chrome browser
ChromeDriver driver=new ChromeDriver();

//Launch the URL
driver.get("https://en-gb.facebook.com/");

//Maximise the browser
driver.manage().window().maximize();

//Add implicit wait
Thread.sleep(3000);

//Click on Create New Account button
driver.findElement(By.linkText("Create New Account")).click();

//Add implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//Enter the firstName
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Usha");

//Enter lastName
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chinnadurai");

//Enter MobileNumber
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");

//Enter MobileNumber
driver.findElement(By.id("password_step_input")).sendKeys("Qwerty@09");

//Selecting the DOB Dropdowns
WebElement day = driver.findElement(By.id("day"));

Select daysel = new Select(day);

daysel.selectByValue("8");

WebElement month = driver.findElement(By.id("month"));

Select monsel = new Select(month);

monsel.selectByVisibleText("Sep");

WebElement year = driver.findElement(By.id("year"));

Select yrsel = new Select(year);

yrsel.selectByValue("2000");

//Selecting the Gender as Female
driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
