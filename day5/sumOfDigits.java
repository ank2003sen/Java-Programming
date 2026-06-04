package day5;

public class sumOfDigits {

	public static void main(String[] args) {
		int num= 12345;
		int sum = 0 ;
		
		num = Math.abs(num);
		while(num>0) {
			int digit  = num%10;// to get the last digit 
			sum = sum + digit;// to remove the last number on every iteration
			num = num/10;
		}
		System.out.println("Sum of Digits " + sum);
	}

}
