package day5;

public class countDigitsInANumber {

	public static void main(String[] args) {
		long number = -123;
		int count = 0 ;
		number = Math.abs(number);//Math.abs() means absolute value. It converts a negative number to a positive number.

		if(number == 0) { // added to handle if number provided is zero
			count = 1;
		}
		else
		{
			while(number>0)// iterating till  number becomes 0
			{
				number = number/10;// dividing by 10 every time , / will remove the quotient i.e the last number every time as divided by 10
				count++;// increasing count on every iteration of while loop
			}
		}
		System.out.println("Digits count = " + count);

		}

}
