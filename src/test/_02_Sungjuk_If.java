package test;

import java.util.Scanner;

public class _02_Sungjuk_If {
	public static void main (String [ ] args ) {

		Scanner scan = new Scanner (System.in);
		int score ;
		char grade =' ' ;
		System.out.print("점수를 입력하세요 : ") ;          //세미콜론 하지않음
		score = scan.nextInt();
		
		if( score >100 || score < 0 ) {
		System.out.println("잘못 입력하셨습니다.");
		} else {
		if( score >= 90) {
		   grade = 'A';
		} else if ( score >= 80) {
		   grade = 'B';
		} else if ( score >= 70) {
		   grade = 'C';
		} else if ( score >= 60) {
		   grade ='D';
		} else {
		   grade ='F';
		}
		System.out.println (	" 점수는 : " + score + " 학점은 : " +  grade);		
		}		
		scan.close( ); // scan close 안함  
          }
}