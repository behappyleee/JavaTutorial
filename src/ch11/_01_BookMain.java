package ch11;

public class _01_BookMain {
	public static void main(String[] args) {
		
		_01_Book book = new _01_Book(100 , "토지");
		
		System.out.println(book);
		System.out.println( book.toString() ); //클래스에 toString() 없음에도 에러안나는이유는 부모클래스(Object) 부모메소드를 가져왔기때문
											   //extends Object가 생략되어있음 
		
		
		
		
		}

	
	
}
