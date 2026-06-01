package day3;

public class percentageCalculator {

	public static void main(String[] args) {
		int maths = 80, science = 70, english = 85, history = 50, computer = 90;
		int totalMarks = maths+science+english+history+computer;
		float percentage = (totalMarks/500f)*100;
		
		System.out.println("Total marks = " + totalMarks);
		System.out.println("Percentage = " + percentage);
		
		//Mistake: totalMarks/500 performs integer division because both operands are int, so the decimal part is lost.

		//Solution: Make one operand a float or double
	}

}
