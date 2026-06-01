package day4;

public class leapYearChecker {

	public static void main(String[] args) {
		// if divisible by 4 then it is  a leap year but if it is also divisible by 100 then it is not and one exception if it is divisible by 4 , 100 and also 400 then it is a leap year
		int year = 2000;
		
//		if (year % 4 == 0) {
//
//            if (year % 100 == 0) {
//
//                if (year % 400 == 0)
//                    System.out.println(year + " is a leap year");
//                else
//                    System.out.println(year + " is not a leap year");
//
//            } else {
//                System.out.println(year + " is a leap year");
//            }
//
//        } else {
//            System.out.println(year + " is not a leap year");
//        }
		
		
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		    System.out.println(year + " is a leap year");
		else
		    System.out.println(year + " is not a leap year");
	}
}
