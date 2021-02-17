package ch12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _05_FileLeader {

	public static void main(String[] args) throws IOException {
		//선언	
		FileReader fr = null;
		int i ;
		try {
			//직접생성 ... 저장시 인코딩을 UTF-8로 저장
			fr=new FileReader("E:\\Dev76\\file\\fileReader.txt");  //한글이깨지지 않고 제대로출력
			
			while((i=fr.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) fr.close();
		}
		
		System.out.println();
		System.out.println("END!");
		System.out.println("정상종료!");
		
	}
}
