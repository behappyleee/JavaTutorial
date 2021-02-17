package ch10;

import java.util.Scanner;

public class _02_ArithmeticException {
	
	public static void main(String[] args) {
		
		System.out.println("=== 두개의 정수를 입력 ===");
		Scanner input= new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("두번쨰 값을 입력 : ");
		int num2 = input.nextInt();
		
		try {
			System.out.println("몫  : " + (num1/num2) );
			System.out.println("나머지 : " + (num1% num2 ) );
		} catch (ArithmeticException e) {
			System.out.println("=== 예외 발생 ===");
			System.out.println("e : " + e.getMessage() );
			System.out.println("e : " + e);
			e.printStackTrace();
		} finally {
			System.out.println("==== finally ====");
			input.close();
		}
		
		
		System.out.println("정상 종료 !");
		
	}

}
