package oneJune.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		/*Properties property = new Properties();
		property.load(new FileInputStream("./data/data.properties"));*/
		
		FileInputStream file = new FileInputStream("./data/data.properties");
		Properties property = new Properties();
		property.load(file);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(property.getProperty("url"));
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(property.getProperty("password"));
//		driver.findElement(By.id("password")).sendKeys(property.getProperty("pass"));
		driver.findElement(By.xpath("//*[@id=\"last\"]")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
