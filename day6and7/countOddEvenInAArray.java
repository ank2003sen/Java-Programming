package day6and7;

public class countOddEvenInAArray {

	public static void main(String[] args) {
		int arr[] = {12,23,43,65,67,34};
		int odd = 0,even=0;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				even+=1;
			else
				odd+=1;
			
		}
		System.out.println("Even numbers in array :" + even + " and odd numbers : " + odd);
	}

}
