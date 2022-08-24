package programming;

import java.util.ArrayList;
import java.util.List;

//remove duplicates
public class PrintUnique {

	public static void main(String[] args) {
	
		String s = "my first name is dhanush and my second name is karunakara";
		String[] stringArray = s.split(" ");
		
		List<String> l = new ArrayList<String>();
		
		for (String string : stringArray) {
			
			if(!l.contains(string))
			l.add(string);
		}
		
		System.out.println(l);
		
		for (String string : l) {
			System.out.print(string+" ");
		}
		
		/*Set<String> set = new LinkedHashSet<String>();
		
		for (String string : stringArray) {
			
			set.add(string);
		}
		
		System.out.println(set);*/
		
		
		
		
	}
}
