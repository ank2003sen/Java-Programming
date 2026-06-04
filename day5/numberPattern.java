package day5;

public class numberPattern {

	public static void main(String[] args) {

				// 1
				// 12
				// 123
				// 1234
				// 12345
				// 54321
				// 4321
				// 321
				// 21
				// 1
				
				int length = 5;
				
				for (int i =1;i<=length;i++)
				{
					for (int j=1;j<=i;j++)
					{
						System.out.print(j);
					}
					System.out.println();
				}

				
				for (int i =length;i>=1;i--)
				{
					for (int j=i;j>=1;j--)
					{
						System.out.print(j);
					}
					System.out.println();
				}

	}

}
