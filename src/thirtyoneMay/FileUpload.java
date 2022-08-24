package thirtyoneMay;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/selenium%20softwares/html/filehandling.html");
		File file = new File("./data/resume.pdf");
		String path = file.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);
		//driver.close();
	}

}
