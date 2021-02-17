package ch12;

import java.io.IOException;

public class _02_ByteInputStream {
	
	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요.");
		
		/*try {
			int i;
			while( (i =System.in.read()) != -1 ) {  //데이터를 1byte씩 읽어들여서 아스카값으로 저장
				System.out.print( (char)i + " " );
			}
		}catch (IOException e) {
			System.out.println( e.getMessage() );
		} */
		
		while (true) {
			try {
			int i = System.in.read();
			if( i == 13 ) { // 10:줄바꿈   13:Enter 
				System.out.println("출력완료 !");
				break;
			}
			System.out.print( (char)i +" " );
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			
	}
		
	}
	
}
