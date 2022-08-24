package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAllignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement emailCheckbox = driver.findElement(By.id("email"));
		WebElement passwordCheckbox = driver.findElement(By.id("password"));
		Point emailLoc = emailCheckbox.getLocation();
		Point PasswordLoc = passwordCheckbox.getLocation();
		int emailX = emailLoc.getX(); //distance from x-axis
		int passX = PasswordLoc.getX();
		
		System.out.println("The email checkbox location is "+emailX);
		System.out.println("The email checkbox location is "+passX);
		
		if(emailX == passX)     //(emailX - passX < 50 && emailX - passX > -50)
			System.out.println("the email and password checkbox are alligned");
		else
			System.out.println("the email and password checkbox are not alligned. raise the bug to developer");
		
		driver.close();
	}
}
