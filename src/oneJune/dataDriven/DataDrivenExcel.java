package oneJune.dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fileExcel = new FileInputStream("./data/book1.xlsx");
		Workbook wb = WorkbookFactory.create(fileExcel);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String userName = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String passWord = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}