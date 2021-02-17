package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_IOException {
	
	public static void main(String[] args)  {
		
		FileInputStream fis = null;  //file을 읽어들이는 함수 
		
		try {
			System.out.println("정상");
			fis = new FileInputStream("a.txt");
		} catch ( FileNotFoundException e ) {
			System.out.println("예외 발생 ");
			System.out.println("getMessage : " + e.getMessage() );  //a.txt (지정된 파일을 찾을 수 없습니다.)
				return ;   //return 의미는 함수종료의미임 메인함수가 종료되버림 (return은 신중하게 사용하기 밑에문장 도 정상종료 수행안됨)finally까지만 수행이됨 
				//e.printStackTrace();
		} finally {  // finally는 항상 수행이 됨 
			System.out.println("finally 문장이므로 수행");
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
					
				}
			}
		}		
		
		System.out.println("정상종료 ~~");   //return문에 의해서 출력되지 않음 하지만 finally 문장은 수행이 됨 
		
	}
	
}
