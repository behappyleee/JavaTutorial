package ch11;

public class _01_Book {
	
	int bookNumber;
	String bookTitle;
	
	public _01_Book () {}
	
	public _01_Book(int bookNumber, String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	/* toString () 메소드가 정의 되어있지않다.
	 * 컴파일 과정에서 Extends Object가 자동으로 추가, Object의 toString() 메소드가 호출되었다.
	 * Object의 toString() : 패키지명.클래스명@해시코드값 ==> 주소값
	 * 재정의해서 객체정보를 문자열로 반환하여 사용해야 원하는 정보 출력가능함 
	 * 모든 클래스의 최상위 클래스는 Object
	 * 
	 * 
	 */
	
	
}
