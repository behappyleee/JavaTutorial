package test; 

import java.util.Scanner;

public class  _01_Sungjuk_If {
   		 public static void main (String [ ] args) {	    	
                           
	   			Scanner scan = new Scanner (System.in);
			
	   			int score ;
	   			char grade = ' ' ;   //공백을 2칸이상 줌
	                           
	            System.out.print ( " 점수는 : " );
	            score = scan.nextInt( ) ;  
	                          
	            if ( score >= 90 ) {
			        grade = 'A';
	            } else if ( score >= 80) {
			       grade = 'B'; 
	            } else if ( score >= 70) {
			       grade = 'C';	
	            } else if ( score >= 60) {
			       grade = 'D';
		        } else {
			       grade ='F';	
		        }
	                        
	            System.out.println(" 점수 : " + score + " 학점 : " + grade);

	}
}
