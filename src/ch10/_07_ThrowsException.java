package ch10;

import java.util.Scanner;

public class _07_ThrowsException {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//readNmae() readAge() 동시에 호출 
		
		try {
			callMethod();
		} catch (ArithmeticException A) {
			System.out.println("예외 " + A.getMessage() );
		} catch (Exception A) {
			System.out.println("예외 : " + A.getMessage());
		} finally {
			System.out.println("Hello ! ");
			//input.close();
		}
	
	
}
		
	
     static void callMethod() throws Exception{
    	 readName();
    	 readAge();
	}
	
	
	static String  readName() throws Exception{
		System.out.println("이름을 입력하시오 : ");
		String name = input.next();		
		if(name.length() <2) {
			throw new Exception("이름은 2글자 이상이어야 합니다.");
		} else {
			return name;
		}
	}

	
	
	
	static int readAge() throws ArithmeticException {
		System.out.println(" 나이를 입력하시오 : ");
		int age = input.nextInt();
		
		if(age < 0) {
			throw new ArithmeticException("나이는 양수이어여야 합니다.");
		} else {
			return age;
		}
	}
	
}	
	
	
