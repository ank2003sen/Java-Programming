package day5;

public class palindromeNumber {

	public static void main(String[] args) {
		int var= 121;
		int orignal = var;
		int reversed =0 ;
				
		var = Math.abs(var);
		while(var>0)
		{
			int digit = var%10;
			reversed = reversed *10 + digit;
			var = var/10;
		}
		if (orignal==reversed) {
			System.out.println("The number " + orignal + " is a Palindrome");
		}
		else {
			System.out.println("The number " + orignal + " is not a Palindrome");

		}

	}

}
