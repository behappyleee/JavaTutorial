package ch01;

import java.util.Calendar;

public class _04_VariableEx {
		public static void main (String [] args) {
			/*
			 *  상수 : 프로그램이 실행되는 동안, 값이 변하지  않는 수 또는 변경 불가능한 수
			 *       final 키워드는 변수에 값이 대입되고  나면, 변수값이 더 이상 변경되지 않는다는 의미 
			 *       주로 대문자를 사용
			 *       만일 값 변경시 상수를 선언한 부분의 값만 변경 
			 *       
			 *       final
			 *       1)변수 2) 메소드 3) 클래스
			 *
			 *  
			 */		
					final double PI = 3.14; // 상수 선언 및 초기화
					double val = 0.5;
					
					double result = PI * val;
					System.out.println("result : " + result);   //1.57
					// PI = 3.15 ; // 오류 : 상수는 final로 선언하며,변경불가  
					System.out.println("---------------------------");
					
					final String MY_NAME = "이철한";   //MY_NAME을  String을상수처리함
			        final int MY_AGE = 28;           //MY_AGE를 상수 처리함
					System.out.println("이름 : " + MY_NAME);
					System.out.println("나이 : " + MY_AGE);
					System.out.println("이름 : " + MY_NAME + ",나이 : "+ MY_AGE);
							
					
					
					
					}
}
