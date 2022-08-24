package thirtyMay;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowClosing {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		String homeWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("The total windows opened are "+count);
		
		//it will close all windows except home window
		for (String win : allWindows) {
			
			driver.switchTo().window(win);
			
			if(win.equals(homeWindow))
				continue;
			else
				driver.close();
				
		}	
	}
}
