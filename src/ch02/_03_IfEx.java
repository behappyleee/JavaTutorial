package ch02;

import java.util.Date;

public class _03_IfEx {
		public static void main (String[] args) {
		// score가 60이상이면 "합격" 60점 미만이면 "불합격" 40점미만이면 "과락" result 변수 출력
			
			int score = 48 ;
			String result;
			
			if ( score >= 60 ) {
				result  = "합격";
			} else if ( score >= 40 ) {
				result = "불합격";
			} else {
				result = "과락";
			}
		
			System.out.println( score + " : " + result );
		
			
		}
}
