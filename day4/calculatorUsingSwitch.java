package day4;

public class calculatorUsingSwitch {

	public static void main(String[] args) {
		int num1 = 50, num2 = 0;
		
		String operator = "/";
		
		switch(operator) {
		case "+" : System.out.println(num1+num2);break;
		case "-" : System.out.println(num1-num2);break;
		case "*" : System.out.println(num1*num2);break;
		case "/" : if (num2!=0) {
			System.out.println((double) num1/num2);// here converting for this current expression into double in runtime. Here we cannot do like we declare in start without ()
			break;
			}
			else {
				System.out.println("Cannot divide by 0");
				break;
			}
		case "%" : if (num2!=0) {
			System.out.println((double)num1%num2);break;// here converting for this current expression into double in runtime. Here we cannot do like we declare in start without ()
		}
		else {
			System.out.println("Cannot divide by 0");
			break;
		}
		default : System.out.println("Invalid operator");
		}
	}

}
