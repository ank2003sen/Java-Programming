package day6and7;

public class arrayPalindrome {

	public static void main(String[] args) {
		boolean palindrome =true;
		int arr[] = {1,1,2,1,1};
		int start = 0;
		int end = arr.length-1;
		while (start<end)
		{
			if(arr[start] != arr[end])
				palindrome = false;

			start++;
			end--;
		}
		if(palindrome)
		{
			System.out.println("Array in palindrome");
		}
		else
		{
			System.out.println("Array in not palindrome");

		}

	}

}
