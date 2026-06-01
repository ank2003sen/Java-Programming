package day3;

public class largestOfThree {

	public static void main(String[] args) {
		int a= 50, b= 50, c= 50;
		String result = (a==b &&b ==c)?"All are equal":(a>b&&a>c)?"a is largest":(b>a&&b>c)?"b is largest" : "c is largest";
		System.out.println(result);

	}

}
