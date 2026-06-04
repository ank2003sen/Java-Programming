package day5;

class func{
	int calculatePower(int digit,int power) {
		int result =1;
		for (int i = 1; i<=power;i++)
		{
			result = result * digit;
		}
		return result;
	};
}

public class armstrongNumber {
	
	

	public static void main(String[] args) {
		// Armstrong Number :- 153 = 1^3+5^3+3^3 =153
		func obj = new func();
		
		int num = 153;
		int armNum=0;
		int count = 0;
		int orignal = num;
		num = Math.abs(num);
		while(num>0) {
			int digit = num%10;
			count ++;
			num= num/10;
			
		}
		num = orignal;
		while (num>0) {
			int digit = num%10;
			armNum = armNum + obj.calculatePower(digit,count);
			num=num/10;
		}
		if(armNum==orignal)
			System.out.println(orignal + " is an armstrong Number");
		else
			System.out.println(orignal + " is not an armstrong Number");

	}

}
