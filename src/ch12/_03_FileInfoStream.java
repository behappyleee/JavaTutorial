package ch12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FileInfoStream {
	
	public static void main(String [] args)  throws IOException {
		//예외발생 O  try -> catch -> finally , 예외발생 X try ->finally 
		FileInputStream fis = null;
		//한글은 2byte 이므로 깨진다. 
		//inputStream.txt 를 byte 단위로 읽어서 콘솔에 출력
		try {  //주의사항 : 탐색기의 파일 확장명 보이도록 체크, 메모장 저장시 UTF-8로 선택되었는지 CHECK
			fis = new FileInputStream ("E:\\Dev76\\file\\inputStream.txt");
			
			int i;							// -1은 끝을 의미 다음에 더 읽을게  없다는 의미 (파일에 끝에 도달하면 -1을 반환)
		while((i=fis.read())!= -1 ) {   	// while은 파일이 끝이 아닌동안 돌음
				System.out.print( (char)i );// fis.read()는 안에 내용물을 다 읽어오는 메소드
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		
		System.out.println();
		System.out.println("END!");
		System.out.println("정상종료!");
		
	}
	
}
