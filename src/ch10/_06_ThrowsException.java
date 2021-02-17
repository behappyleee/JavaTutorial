package ch10;

import java.util.Scanner;

public class _06_ThrowsException {
	static Scanner scan =  new Scanner (System.in);
	public static void main(String[] args) {
		
		//readAge() : 나이 출력 (age<0 ArithmeticException 예외발생)
		try {
		readAge();
		} catch (Exception e) {
			System.out.println(" 예외 : " +  e.getMessage() );
			System.out.println(e);
		}finally {
			System.out.println("Hello World !");
			scan.close();
		}
		
		System.out.println(" 정상종료 ");
		
	}
	
	static int readAge() throws Exception {
		System.out.print(" 나이를 입력하시오 : ");
		int age = scan.nextInt();
		if(age < 0 ) {
		throw new Exception(" 나이는 0살 이상이어야 합니다. ");
	} else {
		return age;
	}
	
}
	
}
