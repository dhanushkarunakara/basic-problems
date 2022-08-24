package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium%20softwares/html/basic.html");
		
		driver.findElement(By.cssSelector("#d1")).click();//by id
//		driver.findElement(By.cssSelector(".c1")).click();//by class
//		driver.findElement(By.cssSelector("a#d1")).click();//by tag and id
//		driver.findElement(By.cssSelector("a.c1")).click();//by tag and class
//		driver.findElement(By.cssSelector("a[id='d1']")).click();// by tag[AttrName ='AttrValue']	
		
		/*
		driver.get("file:///D:/selenium%20softwares/html/cssSelector.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div#buttonDiv>button")).click();
		//to locate child element from parent element.
		*/
		
		/*
		driver.get("file:///D:/selenium%20softwares/html/cssSelector.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div#buttonDiv button")).click();
		//to locate child or grandchild eelement from parent element
		*/
		
		/*
		driver.get("file:///D:/selenium%20softwares/html/cssSelector.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#testingTypes li:nth-child(2)"));
		//‘#testingTypes li:nth-child(2)’ will select the element with id ‘testingType’ 
		//and then locate the 2nd child of type li i.e. ‘Performance Testing’ list item.
		*/
	
	}

}
