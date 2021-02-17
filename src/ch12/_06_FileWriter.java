package ch12;

import java.io.FileWriter;
import java.io.IOException;

public class _06_FileWriter {
	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("E:\\Dev76\\file\\fileWriter.txt");
			fw.write('A'); //없으면 오류남(문자 하나를 출력) 
			char buf [] = {'B' , 'C' , 'D' , 'E' , 'F', 'G'};
			fw.write(buf); //배열값을 출력
			fw.write("즐거운 오후되세요."); //문자열을 출력
			fw.write(buf, 1 , 3); // 1부터  3까지만 출력
			      //참조변수.write(배열명 ,시작위치 , 개수); ==> 배열의 일부만 출력
			fw.write("88");
			//출력내용 : ABCDEFG즐거운 오후되세요.CDE88
			//FileWriter 는 출력내용을 파일명에 작성해준다.  
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		try {
			fw.close();
		} catch(IOException e) {
			System.out.println( e.getMessage() );
		}
			
		}
		
		
	}
	
}
