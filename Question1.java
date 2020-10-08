package assigment5;

public class Question1 {

	public static void main(String[] args) {
		
		int number = 1000;
		String comma = "";
		
		for (int i = 0; i <= number; i+=10) {
			
			System.out.print(comma + i);
			comma = ",";
		}

	}

}
