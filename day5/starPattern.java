package day5;

public class starPattern {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// *****
		// ****
		// ***
		// **
		// *
		//     *
		//    **
		//   ***
		//  ****
		// *****
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		int length = 5;
		
		// for (int i =1;i<=length;i++)
		// {
		// 	for (int j=1;j<=i;j++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }


		// for (int i =length;i>=1;i--)
		// {
		// 	for (int j=i;j>=1;j--)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for (int i = length; i >0; i--)
		// {
		// 	for (int j = 1; j < i; j++)
		// 	{
		// 		System.out.print(" ");
		// 	}
		// 	for (int k = length; k >= i; k--)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		// for (int i = length; i > 0; i--)
		// {
		// 	for (int j = length; j > i; j--)
		// 	{
		// 		System.out.print(" ");
		// 	}
		// 	for (int k = 1; k <= i; k++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

// 	   *
//    ***
//   *****
//  *******
// *********

		for (int i = 1; i <= length; i++)
		{
			for (int j = 1; j <= length-i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
}


	

}
