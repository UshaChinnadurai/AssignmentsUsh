package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_CreateContactTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		//Download and attach the chrome drive to this test case
		WebDriverManager.chromedriver().setup();
		
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Step1: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximise the browser
		driver.manage().window().maximize();
		
		//Step2: Enter the Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Step3: Click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Step4: Click the CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Step5: Click the Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Step6: Click the CreateContacts Tab
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Step7: Enter firstname field using id locator
		driver.findElement(By.id("firstNameField")).sendKeys("Usha");
		
		//Step8: Enter lastname field using id locator
		driver.findElement(By.id("lastNameField")).sendKeys("Chinnadurai");
		
		//Step9: Enter firstname(local) field using id locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ush");
		
		//Step10: Enter lastname(local) field using id locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Durai");
				
		//Step11: Enter Departmental field 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Super");
		
		//Step12: Enter Description field 
		driver.findElement(By.id("createContactForm_description")).sendKeys("SuperStoreMarket");
		
		//Step13: Enter your email
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcv@gm.com");
		
		//Step14: Select the state/province
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selstate = new Select(state);
		selstate.selectByVisibleText("New York");
		
		//Step15: Click the Create Contact button
		driver.findElement(By.name("submitButton")).click();
		
		//Step16: Click the Edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Step17: Clear the description field
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		//Step18: Fill Importance field with any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("All is well");
		
		//Step19: Click the Update button using xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
				
		//Step20: Get Title of the ResultingPage
        String title = driver.getTitle();
        System.out.println("Title of the Page: "+title);
//driver.close();

	}
}
