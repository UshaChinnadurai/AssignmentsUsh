package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2SalesForce {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.name("UserFirstName")).sendKeys("Usha");
driver.findElement(By.name("UserLastName")).sendKeys("Chinnadurai");
driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
WebElement jobtit = driver.findElement(By.name("UserTitle"));
Select jobsel = new Select(jobtit);
jobsel.selectByIndex(5);
driver.findElement(By.name("CompanyName")).sendKeys("Test");
WebElement emp = driver.findElement(By.name("CompanyEmployees"));
Select empsel = new Select(emp);
empsel.selectByValue("950");
driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
WebElement country = driver.findElement(By.name("CompanyCountry"));
Select selcoun = new Select(country);
selcoun.selectByVisibleText("Canada");
WebElement state = driver.findElement(By.name("CompanyState"));
Select selstate = new Select(state);
selstate.selectByVisibleText("Newfoundland");
driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
	}

}
