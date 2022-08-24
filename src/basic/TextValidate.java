package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextValidate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.xpath("//h2[contains(text(),'connect and share')]")).getText();
		if(text.contains("Facebook helps you connect and share with the people in your life."))
			System.out.println("text is matching");
		else
			System.out.println("text not matching. Raise a bug to developer");
		driver.close();
	}
}
