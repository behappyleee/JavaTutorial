package ch02;

import  java.util.Scanner;

public class _19_ForEx {
		
	public static void main (String [ ] args) {
				
		Scanner scan = new Scanner (System.in) ;	
	    
		int dan;	
	    int i ;
	    int sum;
	    
	    System.out.print(" 단을 입력하시오 : ");
	    dan =scan.nextInt( ) ;
	    System.out.println("-------------------------");
	    System.out.println("==== " + dan + "단 ====");
	    System.out.println("-------------------------");
	    
		for ( i =  1, sum=0 ; i <= 9 ;  i++  ) {
			sum = dan * i;
			System.out.println(dan + "*" + i +" = "+ sum ) ; 
		}
		
			
		}

}
