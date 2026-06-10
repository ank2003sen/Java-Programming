package day6and7;

public class linearSearchInArray {

	public static void main(String[] args) {
		//Linear search (also known as sequential search) is a simple searching algorithm that checks each element in an array one by one from the beginning until it finds the target value or reaches the end of the collection.
		//If the element matches the target, the algorithm returns its index. If the entire array is traversed without a match, it usually returns -1 to indicate the item does not exist.
		//How Linear Search WorksImagine you have an array [10, 50, 30, 70, 80] and you want to find the target value 30:
		//Check Index 0: Value is 10. Not a match. Move to the next index.Check Index 1: Value is 50. Not a match. 
		//Move to the next index.Check Index 2: Value is 30.
		//Match found! Return index 2 and stop the execution.
		
//		int arr[] = new int[2];
		int toSearch = 200;
		int arr[] = {100,200,230,400,500,200};
		boolean found = false;

		
		for (int x=0;x<arr.length;x++)
		{
			if (arr[x]==toSearch)
			{
				System.out.println("Element found at " + x + " index");
				found = true;
				break;
			}
			
		}
		if (!found) {
			System.out.println("Element not found");
		}


	}

}
