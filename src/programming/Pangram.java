package programming;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over a lazy dog";
		
		String[] sArray = s.toLowerCase().split(" ");
		
		String sLower = "";
		
		for (String string : sArray) {
			
			sLower = sLower.concat(string);
		}
		
		System.out.println(sLower);
		
		Set<Character> set = new HashSet<Character>();
		
		
		for (int i = 0; i < sLower.length(); i++) {
			
			if(sLower.charAt(i) >= 'a' && sLower.charAt(i) <= 'z')
			set.add(sLower.charAt(i));
			else
			{
				System.out.println("Not a pangram");
				System.exit(0);
			}
		}
		
		if(set.size() == 26)
		System.out.println("It is a pangram " +set);
		else
			System.out.println("Not a pangram");
	}
}
