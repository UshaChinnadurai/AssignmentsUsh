package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_AcmeTest {

	public static void main(String[] args) throws InterruptedException {
		// Initiating the WebDriver
WebDriverManager.chromedriver().setup();

//Launching the chrome browser
ChromeDriver driver=new ChromeDriver();

//Step1: Launch the URL
driver.get("https://acme-test.uipath.com/login");

//Maximise the browser
driver.manage().window().maximize();

//Step2: Enter the EmailAddress
driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");

//Step3: Enter the Password
driver.findElement(By.name("password")).sendKeys("leaf@12");

//Step4: Click the login button
driver.findElement(By.xpath("//button[@type='submit']")).click();

//Step5: Get the Title of the page and Print
String title= driver.getTitle();
System.out.println("Title of the page: "+title);

//Step6: Click on LogOut
driver.findElement(By.linkText("Log Out"));

//Step7: Close the browser
driver.close();
	}

}
