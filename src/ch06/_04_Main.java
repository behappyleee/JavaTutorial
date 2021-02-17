package ch06;

public class _04_Main {
		public static void main (String [ ]   args) {
						
			_04_Manager manager= new  _04_Manager();	
			// 부모 디폴트 생성자는 자식보다 먼저 호출된다
			// 자식 생성자 호출시 부모생성자가 자동으로 호출됨
			// 부모 생성자가없어도 컴파일러가 자동으로 default 생성자 만들어줌	
			// 부모가 기본생성자 없이 매개변수 생성자만 있을시 에러발생
			// 마찬가지로 자식클래스도 기본생성자 없이 매개변수 생성자만 있을시 에러발생
			
			//1.자식 매개 변수 생성자 호출
			_04_Manager manager1=new _04_Manager(" S001 ", " 홍길동 ", " 경영 ", 4000000, 200000) ;
			//super( "S001" ,  " 홍길동 " , " 경영 " , 3000000);
			
			manager1.printInfo();		
						
				
			}
		
}
