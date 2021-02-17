package ch13;

public class _03_Main {
//page 467
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "World!!";

		//인터페이스명 참조변수 =(매개변수1 , 매개변수2 ....) -> 구현부 
		_03_StringConcat concat = (String s, String v) -> System.out.println(s + "," + v);   //추상메소드를 메인에서 재정의함 
		//참조변수, 추상메소드 호출 => 구현부 실행
		
		concat.makeString(s1, s2); //재정의된 메소드 실행됨
		
		
		
		
		
	}

}
