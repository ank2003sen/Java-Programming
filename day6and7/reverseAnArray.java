package day6and7;

import java.util.Arrays;

public class reverseAnArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
//		int arrReversed[] = new int[arr.length];
//		
//		for(int i =0; i < arr.length;i++)
//		{
//			arrReversed[arr.length-1-i] = arr[i];
//		}
//		System.out.println(Arrays.toString(arrReversed));
		
		
		
		// timecomplexity is less for this
		int end= arr.length-1;
		int start = 0;
		
		while (start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
