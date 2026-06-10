package day6and7;

import java.util.Arrays;

public class mergeTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,5,6};
		int arr2[] = {4,5,6};
		
		int merArr[] = new int[arr1.length + arr2.length];
		
		
		for(int i=0;i<arr1.length;i++)
		{
			merArr[i] = arr1[i];
		}
		for(int y=0;y<arr2.length;y++)
		{
			merArr[arr1.length+y]=arr2[y]; 
		}
		
		System.out.println(Arrays.toString(merArr));
	}

}
