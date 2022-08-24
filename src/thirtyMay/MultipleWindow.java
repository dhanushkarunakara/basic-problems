package thirtyMay;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("The total windows opened are "+count);
		
		/*String[] array = (String[]) allWindows.toArray();
		
		for (int i = 0; i < array.length; i++) {
			 String title = driver.switchTo().window(array[i]).getTitle();
			System.out.println(title);
		}*/
		
		for (String win : allWindows) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		driver.quit();
			
	}
}
