package ch11;
//모든 클래스의 최상위 클래스는 Object
public class _02_Book extends Object {

	int bookNumber;
	String bookTitle;
	
	public _02_Book () {}
	
	public _02_Book(int bookNumber, String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	@Override                   // 부모 Object 클래스의 toString() 메소드를 재정의  ==> 실제 Book 정보 출력
	public String toString() { //부모메소드 toString()을 자식메소드에서 재정의함 ==>Override
		return "책 이름 : " + bookTitle + "책 번호 : " + bookNumber;
	}
		
	/* 	toString () 메소드가 정의 되어있지않다.525
	 * 	Extends Object가 생략되어있고, Object의 toString() 메소드가 호출되었다.
	 * 	Object의 toString() : 패키지명.클래스명@해시코드값 ==> 주소값
	 * 	재정의해서 객체정보를 문자열로 반환하여 사용해야 원하는 정보 출력가능함 
	 * 
	 */
	
}