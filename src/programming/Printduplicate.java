package programming;

import java.util.List;
import java.util.ArrayList;

public class Printduplicate {

	public static void main(String[] args) {
		
		String s = "my first name is dhanush and my second name is karunakara";
		
		String[] sArray = s.split(" ");
		
		List<String> l = new ArrayList<String>();
		
		for (int i = 0; i < sArray.length; i++) {
			
			if(!l.contains(sArray[i]))
				l.add(sArray[i]);
			else
				System.out.print(sArray[i]+" ");
		}
	}
}
