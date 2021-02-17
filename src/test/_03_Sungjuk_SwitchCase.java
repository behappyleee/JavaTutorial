package test;

import java.util.Scanner;

public class _03_Sungjuk_SwitchCase {
	
	public static void main(String [] args) {	
	
         Scanner scan = new Scanner(System.in);
		int score ;
		char grade = ' ';
		System.out.println(" 점수를 입력 하세요 : ");
		score = scan.nextInt();
		
		if ( score > 100 || score < 0) {
		System.out.println("잘못 입력하셨습니다. ");
		} else {
		switch(score/10) {
			case  9 : grade = 'A';	        // case 대신 score 입력함
			break;
			case  8 : grade = 'B';
			break;
			case  7 : grade = 'C';
			break;
			case  6 : grade = 'D';
			break;
		     default : grade = 'F';						
		}
		System.out.println(" 점수 : " + score + " 학점 : " +grade);
		}
		scan.close( );  // scan close 안함  
        }
}