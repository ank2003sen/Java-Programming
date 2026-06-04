package day5;

public class forLoopDemo {

	public static void main(String[] args) {
		// Print number from 1...10
//		for(int i=1; i<=10;i++) {
//			System.out.println(i);
//		}
		
		
		// Print even numbes from 1....10
//		for (int i=2;i<=10;i+=2)
//		{
//			System.out.println(i);
//		}
		
		
		// Print from 1....10 , with whether it is even or odd
//		for(int i=1; i<=10;i++)
//			if(i%2==0)
//			{
//				System.out.println(i+" is Even");
//			}
//			else {
//				System.out.println(i+" is Odd");
//			}
		
		// Print from 10....11 , with whether it is even or odd
		for(int i=10; i>0;i--)
			if(i%2==0)
			{
				System.out.println(i+" is Even");
			}
			else {
				System.out.println(i+" is Odd");
			}		
	}

}
