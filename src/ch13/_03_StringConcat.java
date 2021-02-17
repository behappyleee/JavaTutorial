package ch13;

//page 465
// ==> 하나의 메소드만 선언가능하므로 실수로 한개 이상 선언시  오류를 발생시킴 

@FunctionalInterface  //함수형 인터페이스 ==> 추상메소드가 하나라는 사실을알려주며 한개 이상 생성시 오류 만들어버림 
public interface _03_StringConcat {

	public void makeString(String s1, String s2);
	
	
	
	
	
}
