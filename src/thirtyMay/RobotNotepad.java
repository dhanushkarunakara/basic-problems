package thirtyMay;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotNotepad {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		Runtime.getRuntime().exec("notepad");
		//it accesses the "run" software in pc
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_S);
	}

}
