package day5;

public class fibonacciSequence {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next;
		int var = 10;
		System.out.println(first);
		System.out.println(second);
		for (int i=3;i<=var;i++)
		{
			next = first + second;
			first = second;
			second = next;
			
			System.out.println(next);
		}

	}

}
