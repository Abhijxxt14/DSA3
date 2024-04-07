package assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Lucky Number :");
		int num =sc.nextInt();
		try {
			if(num < 0) {
				throw new NumberFormatException("NumberFormatException");
			 }
			
			System.out.println("Your Lucky Number is "+ num);
		     }
		
		catch(NumberFormatException e) {
			System.out.println("Not Lucky,exception");
			System.out.println(e);
		}
	}

}
