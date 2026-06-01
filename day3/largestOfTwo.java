package day3;

public class largestOfTwo {

    public static void main(String args[]) {

        int a = 40, b = 30;

        String result = (a > b)
                ? "a is largest"
                : (a < b)
                    ? "b is largest"
                    : "Both are equal";

        System.out.println(result);
    }
}