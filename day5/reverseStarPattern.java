package day5;

public class reverseStarPattern {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
int length = 5;
		
		for (int i =length;i>0;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
