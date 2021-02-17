package ch02; 

import java.util.Scanner;

public class  _05_IfEx {
   		 public static void main (String [ ] args) {	    	
                           
	   			Scanner scan = new Scanner (System.in);
			
	   			int score =0 ;
	   			char grade = ' ' ;   //공백을 2칸이상 줌
	                           
	            System.out.print ( " 점수(0~100점) :  " );
	            score = scan.nextInt( ) ;   
	           
	            //100보다 큰 경우, 0보다 작은 경우 ==> 잘못된 점수입니다. 다시 입력하세요. !!
	            if( score > 100 ||  score <0) {  //  || (논리합) ==> or(또는)   &&(논리곱) ==> and(이면서)
	            	System.out.println(" 잘못된 점수 입니다. 다시 입력하세요. !! ");
	            } else {        	            
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
	            System.out.println(" 점수 : " + score + "  학점 : " + grade);
	           } 
	            scan.close ( );
	}
}
