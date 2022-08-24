package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGmail {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.google.com/search?q=gmail&rlz=1C1CHBF_enIN1005IN1005&ei=tzuLYoS6FMK1mgf09JyIAg&ved=0ahUKEwjE8ci_kPX3AhXCmuYKHXQ6ByEQ4dUDCA4&uact=5&oq=gmail&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwguELADEENKBAhBGABKBAhGGABQAFgAYJlvaANwAXgAgAEAiAEAkgEAmAEAyAEJwAEB&sclient=gws-wiz");
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		driver.navigate().back();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dhanukar2021");
		driver.findElement(By.xpath("//span[text()='Next']")).click();	*/	
		
		
	}

}
