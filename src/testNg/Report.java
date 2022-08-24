package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

	@Test
	public void demo() {

		System.out.println("I am a sysout function inside demo method");
		
		Reporter.log("I am first Reporter-log function inside demo method",true);
		
		Reporter.log("I am second Reporter-log function inside demo method",false);
	}
}
