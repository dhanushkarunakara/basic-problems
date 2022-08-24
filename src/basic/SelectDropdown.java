package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement dropdownDay = driver.findElement(By.xpath("//select[@id='day']"));
		Select selectDay = new Select(dropdownDay);
		selectDay.selectByVisibleText("14");
		
		WebElement dropdownMonth = driver.findElement(By.id("month"));
		new Select(dropdownMonth).selectByVisibleText("Jun");
		
		WebElement dropdownYear = driver.findElement(By.id("year"));
		new Select(dropdownYear).selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//label[.='Male']")).click();
		
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		/*Submit button click operation didnt work with id attribute.
		It threw ElementClickInterceptedException*/
	}
}
