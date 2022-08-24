package twentySevenMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//login to renew page
public class CareInsurance {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement Month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select selectMonth = new Select(Month);
		selectMonth.selectByVisibleText("Mar");
		WebElement Year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select selectYear = new Select(Year);
		selectYear.selectByVisibleText("1995");
		driver.findElement(By.xpath("//a[text()='16']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		String policyNum = driver.findElement(By.xpath("//span[@id='policynumberError']")).getText();
		String policyErrorMsg = "Please enter valid Policy No.";
		/*System.out.println(policyNum);
		System.out.println(policyErrorMsg);*/
		if(policyNum.equals(policyErrorMsg))
			System.out.println("the error message displayed is matching i.e " +policyNum);
		else
			System.out.println("the error message displayed is not matching");
		
		driver.close();
		
	}

}
