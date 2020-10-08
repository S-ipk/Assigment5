package assigment5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		//Write a program to calculate the sum of the numbers 
		//from 1 till upper bound.
		
		Scanner scanner = new Scanner(System.in);
		int upperBound , number = 1, sum=0;
		
		System.out.println("Define a upper bound number: ");
		upperBound = scanner.nextInt();
	    
		String plusSign = "";
		
		while (number <= upperBound){
			
			sum += number;
			
			if (upperBound == 5) {
				System.out.print(plusSign + number);
				plusSign = " + ";
				
			}else if (upperBound == 11) {
				System.out.print(plusSign + number);
				plusSign = " + ";
				
			}else if (upperBound == 100) {
				System.out.print(plusSign + number);
				plusSign = " + ";	
			}
			number++;
		}
		System.out.println(" = " + sum);
		

	}

}
