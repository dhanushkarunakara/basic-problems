package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority=3)
	public void AhatsAppCall() {
		
		Reporter.log("I can make calls",true);
	}
	
	@Test(priority=1,enabled=false)
	public void whatsAppChat() {
		
		Reporter.log("I spread gossip through chats", true); 
		//default - false, i.e if boolean value is not given
	}
	
	@Test(priority=2,invocationCount=3)
	public void whatsAppStatus() {
		
		Reporter.log("I display your moods and status",true);
	}
	
	/*note-
	1) when no explicit priority is given to annotation, it prints
		in alphabetical order inside TestNg report and console, 
		else
		In console, as per priority.
		In testng report , as per alphabetical order.
	2) invocationCount - it will run that particular case for given number of times.
	3) enabled-	it will work if true, wont if false
		
		
		*/
}
