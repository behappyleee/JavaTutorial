package ch04;

public class _05_StudentMain {
		public static void main(String[ ] args) {
			/*  [면접]
			 * 	static 변수 = 정적변수 = 공유변수 = 클래스변수
			 *		
			 *	static 변수  
			 *  - 프로그램이 실행되어서 메모리에 올라갔을때 딱 한번 데이터영역 메모리공간에 할당 	
			 * 	- 객체를 생성하지 않고, 바로 클래스명으로 접근가능
			 *  - 인스턴스마다 생성되는 변수가 아니라, 클래스에 속해 한번만 생성되는 변수이고, 여러 인스턴스가  공유하기때문이다.
			 *  - 인스턴스가 생성되지 않아도 사용가능하다 ( 클래스명.static변수,  클래스명.static메소드 사용가능 )
			 * 		   
			 *   - static 변수나 메소드는 static메소드에서 호출 가능
			 *	   (정적메소드에서 일반 인스턴수 변수나 메소드를 호출시 compile 오류발생) ==>객체를 생성해야 인스턴스 변수가 만들어지기때문 static은 바로만들어짐
			 *	   static 메소드는 프로그램 실행 시 자동으로 메모리에 올라가나, 일반메소드는 객체를 생성해야 메모리에 올라간다.
			 *						
			 * 
			 */
			//serialNum 은 static 변수(공유변수=클래스변수)- 인스턴스 생성과 무관 
			_05_Student st1 = new _05_Student();
			st1.setStudentName("홍길동");
			st1.setStudentID(1);
			st1.printInfo();        // serialNum : 1000
			
			st1.serialNum++;
			st1.printInfo();       //serialNum : 1001
			
			System.out.println("==========================");
			_05_Student st2 = new _05_Student();
			st2.setStudentName("유재석");
			st2.setStudentID(2);
			st2.printInfo();  //serialNum : 1001
					
			_05_Student.serialNum ++;
					
			st2.printInfo();   //serialNum : 1002
					
			}	

}
