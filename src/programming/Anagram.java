package programming;

import java.util.Arrays;

//sort and compare
public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silent";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if(Arrays.equals(c1, c2))
			System.out.println("The words are anagram");
		else
			System.out.println("The words are not anagram");
	}
}
