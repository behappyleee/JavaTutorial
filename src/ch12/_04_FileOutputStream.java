package ch12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_FileOutputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("E:\\Dev76\\file\\inputStream.txt");	 //파일명 직접 내가 생성
			fos = new FileOutputStream("E:\\Dev76\\file\\outputStream341.txt",true); //자동생성 , true를 주면 한번 생성된 자료에 연결되어출력을 준다
			int i;
			while(( i = fis.read() ) != -1) { //input 데이터를 1바이트씩 읽어서 아스키코드로 변환 .. 파일 끝까지(-1때까지) 
				System.out.print( (char)i );  //아스키값을 char형으로 변환 후 화면에 출력
				fos.write(i);   //input file 을 읽어서 output파일에 출력  //FileOutputStream으로인하여 만들어진 파일에 똑같은 문구 삽입시켜줌 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}  finally {  //밑에 if문도 오류날시  try-catch 문 주어야 함 
			if(fis != null) fis.close();
			if(fos != null) fos.close();
		}
		
		System.out.println();
		System.out.println("END!");
		System.out.println("정상종료!");
		
	}
	
	
}
