package ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _10_SerializationTest  {
	/*	
	 * 	550page
	 * 	직렬화 
	 * 	- 인스턴스의 정보를 그대로 저장하거나 네트워크를 통해 전송
	 * 	- 인스턴스 내용 (인스턴스 변수값)을 연속 스트림으로 만드는 것
	 *  - 스트림으로 만들어야 파일에 쓸 수 있고, 네트워크로 전송 할 수 있다.
	 *  - implements Serializable : 직렬화 구현
	 *  - transient : 해당 인스턴스 변수는 직렬화나 복원 과정에서 제외
	 * 
	 * 	역직렬화	
	 *  - 저장된 내용이나 전송받은 내용을 다시 복원하는 것
	 *  - 
	 * 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		
		
	Person p1 = new Person ("안재용" , "대표이사");
	Person p2 = new Person ("김철수", "상무이사");
	Person p3 = new Person ("홍길동", "경찰");
	
	
	try(FileOutputStream fos = new FileOutputStream("serial.out"); 
	     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		oos.writeObject(p1);
		oos.writeObject(p2);
	}catch(IOException e) {
		System.out.println( e.getMessage() );
	}finally {
	System.out.println("finally 문 !!!");	
	}
	
	try(FileInputStream fis = new FileInputStream ("serial.out") ;
		ObjectInputStream ois = new ObjectInputStream(fis) ){	
		Person pe1 = (Person)ois.readObject();
		Person pe2 = (Person)ois.readObject();
		System.out.println(pe1);
		
		System.out.println(pe2);
		
	}catch(IOException e) {
		System.out.println( e.getMessage());
		e.getStackTrace();
	}
	
	
	}	
	
}	
	





class Person implements Serializable {
	
	private static final long serialVersionUID = -150252402544036183L;
	
	String name ;
	String job;
	
	public Person() { }
	
	
	public Person(String name, String job) {
		this.name=name;
		this.job=job;
	}
	
	public String toString() {
		return name + " , " + job ;
	}
	
	
}
	
	
	

