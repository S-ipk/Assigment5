package assigment5;

public class Question13 {

	public static void main(String[] args) {
		
		//if we are on line 0, the pattern starts with W    (WBWBWBWB)
        // But on line 1, the pattern starts with B (BWBWBWBWBW)
        // The pattern is on every even line, it starts with W, and on every odd line, it starts with B.
		
		
		 for (int i=0; i<8; i++) {
	            for (int j=0; j<8; j++) {
	            	//checking first, if (i%2==0) is checking if the line I am currently on is even.
	            	
	                if (i%2==0) {
	                	//if it is, then I now need to check what letter I am on,
	                	//because the letter sequence also has a pattern.
	                	
	                    if(j%2==0) {
	                        System.out.print("W");
	                    }
	                    else {
	                        System.out.print("B");
	                    }
	                    //Now we go to the outer if. In the other case, if we are NOT on an even LINE,
	                    //IE i%2 does not equal 0,
	                    //then that means we are on a line where B is the starting letter
	                }else {
	                    if(j%2==0) {
	                        System.out.print("B");
	                    }
	                    else {
	                        System.out.print("W");
	                    }
	                }
	            }
	            System.out.println("");
	        }
	        }
		
} 

