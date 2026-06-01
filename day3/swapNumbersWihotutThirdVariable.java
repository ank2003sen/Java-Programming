package day3;

public class swapNumbersWihotutThirdVariable {

	public static void main(String[] args) {
		int a =0,b=50;
		
		System.out.println("Value of a before swap, a = " + a);
		System.out.println("Value of a before swap, b = " + b);
		
		a = a+b; // 30
		b = a-b; // 10
		a = a-b; // 20
		
		System.out.println("Value of a after swap, a = " + a);
		System.out.println("Value of a after swap, b = " + b);
		
		
// CAN BE DONE USING * & / OPERATOR FOR MOST OF THE CASES , BUT WILL NOT WORK IF ONE OF THE NUMBER IS 0.
	}

}
