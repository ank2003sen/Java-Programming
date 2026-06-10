package day6and7;

public class secondLargestInAnArray {

    public static void main(String[] args) {

    	int arr[] = {10, 50, 70, 70, 40};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {// if the number is greater than current largest then assign that as largest the old largest will be transfered to second largest

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] < largest) {// if current num is less than current largest, then check whether it is greater than current second largest and less than current largest

                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}