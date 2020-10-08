package assigment5;

public class Question11 {
	
	public static void main(String[] args) {
		
		
        int number1=4;
		
		int number2 = number1;
		
		for(int i=1; i<=number1;i++){
			
			for(int x=1; x<i;x++){ 
				System.out.print("  "); }  
			
			for(int j=number2; j>=1; j--) {
				System.out.print(j + "   ");} //print the column of elements
			
			System.out.println();  //add an enter
			number2--;     			   //decrement the number of rows without affecting 'n'
		}
	}
}
		
        

		
		
		
		
		

