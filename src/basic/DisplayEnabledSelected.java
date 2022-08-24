package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayEnabledSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		//Whether or not the element is displayed
		boolean displayed = driver.findElement(By.id("email")).isDisplayed(); //displayed,enabled
		if(displayed) {
			System.out.println("Is Displayed");
		}
		else {
			System.out.println("Not Displayed. Raise the bug to developer");
		}
		
		//returns true, except when 'disabled' keyword is used.
		boolean enabled = driver.findElement(By.name("login")).isEnabled();
		if(enabled) {
			System.out.println("Is Enabled");
		}
		else {
			System.out.println("Not Enabled. Raise the bug to developer");
		}
		
		//True if the element is currently selected or checked, false otherwise.
		boolean selected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected(); //displayed,enabled,selected
		if(selected) {
			System.out.println("Is Selected");
		}
		else {
			System.out.println("Not Selected");
		}
		
		/*driver.get("D:\\selenium softwares\\html\\DisabledInput.html");
		boolean enabled = driver.findElement(By.id("d2")).isEnabled(); //disabled
		if(enabled) {
			System.out.println("Is Enabled");
		}
		else {
			System.out.println("Not Enabled. Raise the bug to developer");
		}*/
		
		driver.close();
	}
}
