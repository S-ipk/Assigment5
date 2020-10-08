package assigment5;

public class Question6 {

	public static void main(String[] args) {
		
		//Fibonacci Series
		
		int previousNumber = 0;
		int nextNumber = 1;
		
		for (int i = 1; i <= 25; ++i) {
			System.out.println(previousNumber + " ");
			
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}

	}

}
