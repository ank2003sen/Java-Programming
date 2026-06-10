package day6and7;

import java.util.Arrays;
import java.util.Scanner;

public class lowestAndLargetInAnArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int arr[] = new int[5];
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Number in "+ i+" index");
			arr[i] = sc.nextInt();
			}
//		Arrays.sort(arr);
//		System.out.println("Sorted Array :- "+Arrays.toString(arr));
//		System.out.println("Lowest Number in the array : " + arr[0] );
//		System.out.println("Largest Number in the array : " + arr[arr.length-1] );
		
		int smallest = arr[0];
		int largest = arr[0];

		for(int i = 1; i < arr.length; i++) {
		    if(arr[i] < smallest)
		        smallest = arr[i];

		    if(arr[i] > largest)
		        largest = arr[i];
		}
		System.out.println(smallest);
		System.out.println(largest);
		sc.close();
	}
	

}
