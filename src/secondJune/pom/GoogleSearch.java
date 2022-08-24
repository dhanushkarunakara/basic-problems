package secondJune.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class
public class GoogleSearch {

	@FindBy(name="q")
	private WebElement searchBox;
	
	public GoogleSearch(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void searchTextBox(String search) {

		searchBox.sendKeys(search);
	}
}
