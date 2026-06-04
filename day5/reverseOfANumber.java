package day5;

public class reverseOfANumber {

	public static void main(String[] args) {
		int var= 123;
		int reversed =0 ;
		
		boolean isNegative = var<0;
		
		var = Math.abs(var);
		while(var>0)
		{
			int digit = var%10;
			reversed = reversed *10 + digit;
			var = var/10;
		}
		if (isNegative) {
		System.out.println("Reversed Number = " + - reversed );
		}else {
		System.out.println("Reversed Number = " + reversed );
		}

	}

}
