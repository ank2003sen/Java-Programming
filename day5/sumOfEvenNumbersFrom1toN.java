package day5;

public class sumOfEvenNumbersFrom1toN {

	public static void main(String[] args) {
		int N = 10;
		int sum = 0;
		for (int i=1;i<=N;i++)
		{
			if(i%2==0)
			sum +=i;
		}
		System.out.println("Sum of all even numbers from 0 to" + N + sum );


	}

}
