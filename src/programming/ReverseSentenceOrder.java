package programming;

public class ReverseSentenceOrder {

	public static void main(String[] args) {
		
		String s = "My name is Dhanush";
		String[] sA = s.split(" ");
		
		String reverse = "";
		
		for (String string : sA) {
			reverse = string + " " + reverse; 
		}
		
		System.out.println(reverse);
	}
}
