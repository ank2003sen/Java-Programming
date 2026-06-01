package day3;

public class temperatureConverter {

	public static void main(String[] args) {
		float celsius = 37f, fahernheit = 98.6f;
		float F= (celsius*(9f/5f)) + 32;
		
		System.out.println("fahernheit temprature = " + F);
		
		float C = (fahernheit-32)*(5f/9f);
		
		System.out.println("Celsius Temprature = " + C);
	}

}
