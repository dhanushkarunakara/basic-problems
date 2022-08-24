package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script to check the height and width of mail and password checkbox of demo.skillrary login page
public class CheckboxSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='email']")); //WebElement is a class
		Dimension mailSize = emailTextBox.getSize(); //Dimension is a class
		int mailHeight = mailSize.getHeight();
		int mailWidth = mailSize.getWidth();
		System.out.println("the height of mail textbox is "+mailHeight+" and the width of mail textbox is "+mailWidth);
		int passHeight = driver.findElement(By.id("password")).getSize().getHeight();
		int passWidth = driver.findElement(By.id("password")).getSize().getWidth();
		System.out.println("the height of password textbox is "+passHeight+" and the width of password textbox is "+passWidth);
		if(passHeight == mailHeight && passWidth == mailWidth) {
			System.out.println("the height and width of the password checkbox is equal to mail checkbox");
		}
		else {
			System.out.println("the height and width of the password checkbox is not equal to mail checkbox. Raise the bug to developer");
		}
		
		driver.close();
	}

}
