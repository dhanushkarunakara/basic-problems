package programming;

public class ReverseStringWordAndSentence {

	public static void main(String[] args) {
		
		String sWord = "java";
		String rWord = "";
		
		String sSentence = "My name is Dhanush";
		String rSentence = "";
		
		char[] cw = sWord.toCharArray();
		char[] cs = sSentence.toCharArray();
		
		for (int i = 0; i < cw.length; i++) {
			rWord = cw[i] + rWord;
		}
		
		for (int i = 0; i < cs.length; i++) {
			rSentence = cs[i] + rSentence;
		}
		
		System.out.println("Given string is - "+sWord);
		System.out.println("Reversed string is - "+rWord);
		
		System.out.println("Given string is - "+sSentence);
		System.out.println("Reversed string is - "+rSentence);
	}
}
