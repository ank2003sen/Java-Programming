package day6and7;

public class removeDuplicatesFromAnArray {
	public static void main(String args[]) {


        int arr1[] = {1,1,6,4,2,2,3,5,6,4};

        for(int i = 0; i < arr1.length; i++) {

            boolean duplicate = false;

            // Check if current element appeared before
            for(int j = 0; j < i; j++) {
                if(arr1[i] == arr1[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
            {
            	System.out.println(arr1[i]);
            }
        }
    
	}
}
