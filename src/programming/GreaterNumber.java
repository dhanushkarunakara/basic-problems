package programming;

public class GreaterNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int max;
		int min;
		
		max = a>b ? a:b; //ternary operator to compare 2 numbers only
		
		min = a<b ? a:b;
		
		System.out.println("The greater number is "+max);
		System.out.println("The greater number is "+min);
	}
}
