package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_DuplicateLeadTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		//Download and attach the chrome drive to this test case
		WebDriverManager.chromedriver().setup();
		
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Step1: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximise the browser
		driver.manage().window().maximize();
		
		//Step2: Enter the Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Step3: Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Step4: Click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Step5: Click the CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Step6: Click the leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Step7: Click the Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Step8: Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Step9: Enter email address
		driver.findElement(By.name("emailAddress")).sendKeys("abcd@jh.in");
		
		//Step10: Click on findLeads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		//Step11: Capture Name of first resulting lead
		String FirName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("Name: "+FirName);
		
		Thread.sleep(3000);
		//Step12: Click first ResultingD 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		//Step13: Click Duplicate Lead Button 
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		Thread.sleep(1000);
		
		//Step14 Verify the duplicate lead title
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		//Step15 Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Step16 Confirm the duplicated lead name is same as captured name
		String dupnam = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Duplicate Name created: "+dupnam);
		if(FirName.equals(dupnam))
		{
			System.out.println("Duplicated Name is same as captured name");
		}
		else
		{
			System.out.println("The names are different");
		}
		//Step18: Close the browser
        driver.close();
	}
}
