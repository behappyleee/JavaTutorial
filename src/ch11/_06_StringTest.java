package ch11;
//370page 코드 작성
public class _06_StringTest {
		/*
		 *  page370
		 * 	str1, str2 는 동적메모르 공간인 힙메모르 주소이다.
		 * 	String 과 Integer 클래스는 equals(), hashCode()가 미리 재정의 되어있다
		 * 
		 */
	public static void main(String[] args) {
	
		String str1 = new String("abc");
		String str2 = new String("abc");
	
		String str3 = "abc";
		String str4 = "abc";
	
		System.out.println(str1 == str2); //false
		System.out.println(str1.equals(str2)); //true
		
		System.out.println(str3 == str4 ); //true
		System.out.println(str3.equals(str4)); //true
	}
	
}
