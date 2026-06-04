package day5;

public class doWhileLoopDemo {

	public static void main(String[] args) {
		// Example 1 : Print from 1-10;
//		int i=1;
//		do{
//			System.out.println(i);
//			i++;
//		}while(i<=10) ;
//		
		
		
		
		// Example 2 : Print only even number s from 1 -10
//		int i=2;
//		do{
//			System.out.println(i);
//			i+=2;
//		}while(i<=10);
		// approach 2
//		int i=1;
//		do{
//			if (i%2==0) {
//			System.out.println(i);
//			}
//			i++;
//		}while (i<=10) ;
		
		
		
		
		// Example 3: print from 1 and 10 and whether it is odd or even
//		int i=1;
//		do{
//			if (i%2==0) {
//			System.out.println(i + " is Even");
//			}
//			else {
//				System.out.println(i + " is Odd");
//			}
//			i++;
//		}while (i<=10) ;
		
		
		
		// Example 4: print from 10 and 1 and whether it is odd or even
		int i=10;
		do{
			if (i%2==0) {
			System.out.println(i + " is Even");
			}
			else {
				System.out.println(i + " is Odd");
			}
			i--;
		}
		while(i>0);
	}

}
