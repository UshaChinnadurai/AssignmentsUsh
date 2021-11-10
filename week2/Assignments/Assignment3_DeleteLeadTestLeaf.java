package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_DeleteLeadTestLeaf {

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
		
		//Step8: Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Step9: Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		
		//Step10: Click on findLeads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		//Step11: Capture lead ID of first resulting lead
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("ID Number: "+leadID);
		
		Thread.sleep(3000);
		//Step12: Click first ResultingD 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Step13: Click Delete Button 
		driver.findElement(By.linkText("Delete")).click();
		
		Thread.sleep(1000);
		
		//Step14: Click the Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Step15: Enter captured ID
		driver.findElement(By.name("id")).sendKeys(leadID);
		
		//Step16: Click on findLeads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		//Step17 Verify the message "No records to display"
		String msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(msg);
		
		//Step18: Close the browser
        driver.close();
	}
}
