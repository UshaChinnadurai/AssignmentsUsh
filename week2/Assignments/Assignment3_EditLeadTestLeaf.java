package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_EditLeadTestLeaf {

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
		
		Thread.sleep(2000);
		//Step8: Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Usha");
		
		//Step9: Click on findLeads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(3000);
		
		//Step10: Click first ResultingLead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		//Step11: Verify the title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		String ComNambef = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name before Updating: "+ComNambef);
		
		//Step12: Click Edit
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(2000);
		//Step13: Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		
		//Step14: Click on Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Step15 Confirm the name changed
		String ComNamAft = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name After Updation: "+ComNamAft);
		if(ComNambef.equals(ComNamAft))
		{
			System.out.println("Company name not changed");
		}
		else
		{
			System.out.println("Company name is changed");
		}
		//Step18: Close the browser
        driver.close();
	}
}
