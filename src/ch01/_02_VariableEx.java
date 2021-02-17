package ch01;

public class _02_VariableEx {
	public static void main (String []  args) {
		
		/*
		 * method 명 변수명은 소문자로 시작(cf.클래스명은 대문자로 시작)		
		 * 변수 : 데이터를 담는 그릇이며, 데이터의 저장과 참조를 위해 메모리 공간을 할당받는다.
		 *      반드시 먼저 선언 : 컴파일러는 변수의 자료형에 맞는  기억공간을 미리 확보
		 *      선언 : 자료형 변수명 ; 예) int age ;
		 *      선언과 동시에 할당 :자료형  변수명= 초기화; 예) int age =30;
		 *         
		 * [면접문제]
		 * 1. 기본 자료형 (Primitive Type) : 실제 값 저장 
		 *    정수형 :  byte(1바이트) -> short(2바이트) -> int(4바이트) -> long(8바이트)
		 *    실수형 : float (4바이트)-> double (8바이트)
		 *    문자형 : char(2바이트)
		 *    부울형 : boolean (true/false) 
		 * 
		 * 2. 참조형 (Reference Type) : 실제 객체를 가르키는 주소 값 저장
		 * 		클래스, 인터페이스,배열 
		 *  
		 * 3. 문자열 : String 클래스 
		 * 
		 * 
		 */
		
		System.out.println("=== 정수형 변수 ===");
		// int num1=0;
		//     num1=20;
		int num1 = 20;
		// int num2=0;
		//     num2=10;
		int num2 = 10;
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("=== char형 변수 ===");
		char ch1 = ' ';         //char형은' ' 초기화 (공백 있어야함), ch1 변수선언 
		ch1 = 'C';              //ch1에 'C'으로 초기화(자료형 붙이면 안됨)
		System.out.println("ch1 : " + ch1);	
		char ch2 = 'A'; 
		System.out.println((int)ch2);
		int ch3 = 66;
	    System.out.println((char)ch3); 
		
		
			
		System.out.println("=== 실수형 변수 ===");
        float  fnum1 = 3.14f;        // float 형은 숫자 뒤에 F f를  붙여야함	
		double dnum1 = 3.14;         // double 형은 생략한다 
		long   lnum1 = 1234567890l;  // long 형은 숫자뒤에 L l 을 붙여야함
		System.out.println("fnum1 : " + fnum1);
		System.out.println("dnum1 : " + dnum1);
		System.out.println("lnum1 : " + lnum1);
		
		System.out.println("===String형 변수 ===");
		String name  = "김태희 "; //String은 반드시 대문자, String은클래스타입 자료형이 아님 
		String name1 = "";      //String형은 char형과다르게 "" 사이 공간 없어도 됨
		name1 = "홍길동";  
		System.out.println("name1 : " + name1);
		
		System.out.println("=== 부울형 변수 ===");
		boolean isMarried = true;
		System.out.println("isMarried : " + isMarried);
		
			
		System.out.println("fnum1 : " + fnum1);
		System.out.println("dnum1 : " + dnum1);
		System.out.println("lnum1 : " + lnum1);
    }
}