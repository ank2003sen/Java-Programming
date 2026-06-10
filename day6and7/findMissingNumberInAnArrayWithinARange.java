package day6and7;

import java.util.Arrays;

public class findMissingNumberInAnArrayWithinARange {

    public static void main(String[] args) {

        int arr[] = {5, 7, 9, 8};
      Arrays.sort(arr);
// this will only work if the number starts from 1 
//        int sum1  = 0; // sum of array elements
//        int sum2 = 0; // sum of all the elements till last number
//        for(int i =0;i<arr.length;i++)
//        {
//        	sum1 = sum1 + arr[i];
//        }
//        System.out.println("Sum of elemnts in a array " + sum1);
//        for (int y = 0; y<=(arr[arr.length-1]);y++)
//        {
//        	sum2= sum2+y;
//        }
//        System.out.println("sum of all the elements till last number " + sum2);
//
//        System.out.println("missing number =" + (sum2-sum1));

// this will work for every range
        for (int x = arr[0]; x <= arr[arr.length - 1]; x++) {

            boolean found = false;

            for (int y = 0; y <= (arr.length-1); y++) {

                if (x == arr[y]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(x + " is missing");
            }
        }
    }
}