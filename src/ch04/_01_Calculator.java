package ch04;

public class _01_Calculator {
	/*
	 * p.134 
	 * 함수는 하나의 기능을 수행하는 일련의 코드
	 * 
	 * 메소드 : 클래스 안에 정의된함수
	 * 		   특정한 작업을 수행하는 문장들의 모임
	 * 		  입력을 받아서 처리결과를 반환하는 기능
	 * 	      메소드 호출 시 메소드명이 일치해야함, 매개변수 갯수와 타입 일치 (중요)
	 * 						
	 *  	public 반환형 메소드명 (매개변수1, 매개변수2 ......) {
	 *  		return 반환값;  ==>  처리결과를 반환하며, 반환형과 일치해야함 (중요) 
	 *    }
	 *    반환형이 void로 선언된 메소드는 결과값을 반환하지 않는다.
	 */
	
		public double add (double num1, double num2) {
			double result = num1 + num2;
			return result;  //return은 메소드 맨 마지막에 작성 더 작성시 에러  발생
		}

		public double sub(double num1, double num2) {
			double result = num1 -num2;
			return result;
		}
		
		public double mul(double num1, double num2) {
			double result = num1 * num2;
			return result;
		}
		
		public double div(double num1, double num2) {
			double result = num1/num2;
			return result;
		}
}
