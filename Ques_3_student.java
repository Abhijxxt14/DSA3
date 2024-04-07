package assignment2;

import java.util.Scanner;

public class Ques_3_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of Student :");
		String name = sc.nextLine();
		System.out.print("Enter the Marks obtained :");
		int marks = sc.nextInt();
		try
		{
			if(marks>100)
				throw new MarksOutOfBoundException("Marks cannot be more than 100");
			System.out.println(name+", you obtained "+ marks +" marks");
		}
		catch(MarksOutOfBoundException e)
		{
			System.out.println(e);
		}
	}
}
class MarksOutOfBoundException extends Exception
{
	MarksOutOfBoundException(String s)
	{
		super(s);
	}

	}


