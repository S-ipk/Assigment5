package assigment5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Define an end number : ");
		int endNumber = input.nextInt();
		int i = 0;
		String comma = "";
		
				
		while (i <= endNumber) {
			
			if (endNumber == 10 &&  i % 2 != 0) {
				
				System.out.print(comma+i);
				comma = ",";
				
				}else if (endNumber == 11 && i % 2 !=0 ) {
					
				System.out.print(comma+i);	
				comma = ",";
				
				}
			i++;
		}

	}

}
