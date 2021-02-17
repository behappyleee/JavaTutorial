package ch07;
//인터페이스클래스(추상메소드 + 상수)
public interface  _04_Calc {
		// 상수
		double PI = 3.14; //public static final 생략(컴파일 과정에서 모든 변수 상수로 변환)
		int ERROR = - 999999;
		
		//추상메소드==>  public abstract 생략 (컴파일 과정에서 추상메소드로 변환)
		int add(int num1, int num2); 
		int substract(int num1, int num2);
		int times(int num1, int num2);
		int divide(int num1, int num2);
				
}
