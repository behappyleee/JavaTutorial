package ch10;

import java.util.Scanner;

public class _05_ThrowsException {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {  // throws Exception : JVM에게 떠넘김 
		
		// 입력받은이름이 2자 미만이면 예외 발생하자 
		// 3. 직접적으로 예외를 처리하겠다. try ~ catch ~ finally
		
		try {
			String name = readName();
			System.out.println(" 이름 : " + name);
			
		} catch (Exception e) {  // Exception e = new Exception (); 아래메소드에서 Exception 주소 값 전달임  e.getMessage(); ==>("이름은 2글자  이상입니다.") 사용  
			//e.printStackTrace();
			System.out.println( " 예외 : " + e.getMessage() );  
			
		} finally {  //예외 발생시 finally 수행이됨 
			input.close();
			System.out.println("finally  문 ");
		}
		
		System.out.println(" 정상종료 ");
	}
	
	
	
	static String readName ( ) throws Exception {	//2.상위메소드에게 예외처리를 미루는 throws (예외는 개발자가 정의한 예외임)
		System.out.print(" 이름을 입력 하시오 : ");
		String name = input.next();
		
		if(name.length() < 2) {
			// 1. 강제 예외발생 : throw new Exception(); ==> 어떻게 사용할지는 개발자 마음, 		
			//e.getMessage();
			//Exception e = new Exception();
			throw new Exception (" 이름은 2글자 이상 ~~ ");  // throws 기능 사용 , 다양한 예외들을 자바에서 제공할 수 없으므로 개발자가  정의하여 예외발생하여 사용 
		} else {										// Exception 클래스의 매개변수 생성자 호출
			return name;
		}
		
	}	
		
}
