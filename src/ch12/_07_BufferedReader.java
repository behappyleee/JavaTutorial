package ch12;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _07_BufferedReader {
	
	public static void main(String[] args) {
		
		/* 	Buffered 스트림은 멤버변수로 8,192 바이트 배열을 가지고 있다.
		 *	즉 한번 자료를 읽을 떄 8KB 정보를 한꺼번에 읽고 쓸 수 있으므로 1바이트씩 읽고 쓸때마다 훨씬 
		 *	수행속도가 빠르다. 
		 * 	매개변수로는 기반 스트림을 주로 사용한다. 
		 */
		BufferedReader in = null;
		PrintWriter out= null;
		
		try {
			in = new BufferedReader((new FileReader("E:\\Dev76\\file\\_07_fileReader.txt"))); //직접생성
			out = new PrintWriter("E:\\Dev76\\file\\_07_fileWriter.txt"); //자동생성
			int i;
			while((i=in.read()) != 1) {
				out.write(i);
			}
			System.out.println("출력완료 !");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			in.close();
		} catch(IOException e) {
			System.out.println( e.getMessage() );
		}
			
		}
		
		
	}
	
}
