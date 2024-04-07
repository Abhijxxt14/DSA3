package assignment2;

import java.util.Scanner;

public class Ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		System.out.print("Enter the Postion number to add the color :");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Color Name : ");
		String color = sc.nextLine();
		try
		{
			arr[n]=color;
			System.out.println("Color Successfully added");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
