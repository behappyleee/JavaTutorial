package ch13;

//page 465
// ==> 하나의 메소드만 선언가능하므로 실수로 한개 이상 선언시  오류를 발생시킴 

 //함수형 인터페이스 ==> 추상메소드가 하나라는 사실을알려주며 한개 이상 생성시 오류 만들어버림 
public class _04_Anonymous {

	//익명 객체(new 인터페이스명() ) 을 생성하는 람다식
	_04_StringConcat concat = new _04_StringConcat() {
		
		@Override
		public void makeString(String s1, String s2) {
			System.out.println(s1 + " , " + s2);
		}
	};  //반드시 세미콜론을주어야함 안줄시 오류발생(세미콜론을 주어야 add implements method 추가하라고 나옴)
	
	
	
	
	
}
