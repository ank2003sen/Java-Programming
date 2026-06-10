package day6and7;

public class findHowManyDuplicatesInAnArray {

	public static void main(String[] args) {
		int toSearch = 200;
		int count = 0;
		int arr[] = {100,200,230,400,500,200};
		boolean found = false;

		
		for (int x=0;x<arr.length;x++)
		{
			if (arr[x]==toSearch)
			{
				System.out.println("Element found at " + x + " index");
				count ++;
				found = true;
			}
	 		
		}
		
		if (!found) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Elemnt was found " + count + " times");
		}


	}

}
