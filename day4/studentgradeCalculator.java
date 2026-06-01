package day4;

public class studentgradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double percentage = 0;
		
		if (percentage < 0 || percentage > 100)
		    System.out.println("Invalid Percentage");
		else if (percentage >= 90)
		    System.out.println("Student Grade is A+");
		else if (percentage >= 80)
		    System.out.println("Student Grade is A");
		else if (percentage >= 70)
		    System.out.println("Student Grade is B");
		else if (percentage >= 60)
		    System.out.println("Student Grade is C");
		else
		    System.out.println("Student is Fail");
	}
}
