package day3;

public class swapNumberUsingThirdvariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int tempVariable;
		
		System.out.println("Value of a before swap, a = " + a);
		System.out.println("Value of b before swap, b = " + b);
		
		tempVariable = b;
		b = a;
		a = tempVariable;
		
		System.out.println("Value of a after swap, a = " + a);
		System.out.println("Value of b after swap, b = " + b);
		
		

	}

}
