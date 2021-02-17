package ch12;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//548 page 코딩
public class _08_DataStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		DataOutputStream dos = null;
		DataInputStream dis  = null;
		
		try {
			fos = new FileOutputStream("E:\\Dev76\\file\\_09_fileWriter.txt"); //자동생성 .. 기반 스트림 
			dos = new DataOutputStream(fos);   //보조스트림 
			//각 자료형에 맞게 data를 작성
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(20);
			dos.writeFloat(3.14f);
			dos.writeUTF("TEST");
			
			fis = new FileInputStream("E:\\Dev76\\file\\_09_fileWriter.txt"); //파일명이동일해야한다.(작성된 파일을 읽어야 하므로)
			dis = new DataInputStream(fis);  //보조스트림 
			
			//자료형에 맞게 자료를 읽어서 콘솔에 출력
			System.out.println( dis.readByte() );
			System.out.println( dis.readChar() );
			System.out.println( dis.readInt()  );
			System.out.println( dis.readFloat() );
			System.out.println( dis.readUTF() );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		dos = new DataOutputStream(fos); //보조 스트림 
		
		
	}
	
}
