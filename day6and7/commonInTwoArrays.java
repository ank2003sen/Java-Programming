package day6and7;

public class commonInTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,15,26};
		int arr2[] = {4,5,6};	
		boolean found = false;
		
		for(int i =0;i<arr1.length;i++)
		{
			for(int y=0;y<arr2.length;y++)
			{
				if(arr1[i]==arr2[y])
				{
					System.out.println(arr1[i] + " is common");
					found = true;
					break;
				}

			}
		}
		if(!found)
		{
			System.out.println("Nothing Matched");
		}
	}

}
