package programming;

public class CountUpperLowercase {

	public static void main(String[] args) {
		
		String s = "My NAme iS DhanusH";
		int lcount = 0;
		int uCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				uCount++;
			}
			else {
				if(s.charAt(i)!=' ')
				lcount++;
			}
		}
		
		System.out.println("Number of uppercase letters are "+uCount+ " and the number of lowercase letters are " +lcount);
	}
}
