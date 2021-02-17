package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_IOExcepiton {
	
	public static void main(String[] args) throws FileNotFoundException {
			/*
			 * 	예외처리 미루기 - throws 사용 
			 * 	- 예외를  해당 메소드에서 처리(try-catch)하지 않고 미룬 후, 메소드를 호출하여 사용하는 부분에서 예외를 처리하는 방법이다.
			 * 	- throws exception
			 * 
			 */
		
			FileInputStream fis = null;  //file을 읽어들이는 함수 
			
			fis = new FileInputStream("a.txt");
		
			System.out.println("정상종료 ~~");   
	
	}
	
}
