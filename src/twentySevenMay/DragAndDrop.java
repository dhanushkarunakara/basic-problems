package twentySevenMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).perform();
		
		/*Action dragAndDrop = action.clickAndHold(source).moveToElement(target).release(target).build();
		dragAndDrop.perform();*/
		
		//we can use any one of above two steps to perform drag&Drop
	}
}
