package assigment5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int result;
		
		
		while (number < 100) {
			
			result = number*10;
			
			System.out.println(number + " * " + "10" + " = " + result);
			number++;
		}


	}

}
