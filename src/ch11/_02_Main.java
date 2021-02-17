package ch11;

public class _02_Main {
	public static void main(String[] args) {
		
		_02_Book book = new _02_Book(100 , "토지");
		//book.toString() 생략되어도 자동으로 컴파일러가 추가시켜줌 
		System.out.println(book);				//_01_과 다르게 toString() 을 재정의하였기에 return문이 출력이 됨 
		System.out.println( book.toString() );  //클래스에 toString() 없음에도 에러안나는이유는 부모클래스(Object) 부모메소드를 가져왔기때문
											    //extends Object가 생략되어있음 
		
		
		
	}

	
}
