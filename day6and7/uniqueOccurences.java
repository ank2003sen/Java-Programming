package day6and7;

public class uniqueOccurences {

	public static void main(String[] args) {


        int arr1[] = {1,1,6,4,2,2,3,5,6,4};

        for(int i = 0; i < arr1.length; i++) {

            boolean alreadyCounted = false;

            // Check if current element appeared before
            for(int j = 0; j < i; j++) {
                if(arr1[i] == arr1[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted) {
                continue;
            }

            int count = 0;

            // Count occurrences
            for(int j = 0; j < arr1.length; j++) {
                if(arr1[i] == arr1[j]) {
                    count++;
                }
            }
            if(count == 1)
            System.out.println(arr1[i] + " -> " + count);
        }
    
	}

}
