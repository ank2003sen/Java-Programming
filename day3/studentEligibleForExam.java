package day3;

public class studentEligibleForExam {

	public static void main(String[] args) {
		double percentage = 74.9;
		boolean feesPaid = true;
		
		System.out.println("The Student is " + ((percentage >= 75.0)&&(feesPaid == true)?"Eligible for Exam":"Not Eligible for Exam"));

	}

}
