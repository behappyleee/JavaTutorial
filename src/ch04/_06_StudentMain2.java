package ch04;

public class _06_StudentMain2 {
		public static void main(String[ ] args) {
			/*  	[면접]
			 * 		static 변수 = 정적변수 = 공유변수 = 클래스변수
			 * 
			 *		static 변수  
			 *        - 프로그램이 실행되어서 메모리에 올라갔을때 딱 한번 데이터영역 메모리공간에 할당 	
			 * 		   - 객체를 생성하지 않고, 바로 클래스명으로 접근가능
			 * 		   - 인스턴스마다 생성되는 변수가 아니라, 클래스에 속해 한번만 생성되는 변수이고, 여러 인스턴스가  공유하기때문이다.
			 * 		   - 인스턴스가 생성되지 않아도 사용가능하다 (클래스명.static변수, 클래스명.static메소드 사용가능)
			 * 		   
			 *      - static 변수나 메소드는 static메소드에서 호출 가능
			 *		   (정적메소드에서 일반 인스턴수 변수나 메소드를 호출시 compile 오류발생) ==> static변수는 바로  만들어지고  인스턴스변수는 객체생성해야 만들어짐
			 *			static 메소드는 프로그램 실행 시 자동으로 메모리에 올라가나, 일반메소드는 객체를 생성해야 메모리에 올라간다.
			 *					
			 */
						//serialNum 은 static 변수(공유변수=클래스변수)- 인스턴스 생성과 무관 
						_06_Student2 st1 = new _06_Student2();
						st1.setStudentName(" 홍길동 ");
						System.out.println(_06_Student2.serialNum);   //생성자가 먼저호출되어 serialNum이 1이증가됨 
						System.out.println("학번 : "+  st1.studentID + "\n이름 " + st1.studentName);
						
						//st1.serialNum++;
						//st1.printInfo();       //serialNum : 1001
						
						System.out.println("==========================");
						_06_Student2 st2 = new _06_Student2();
						st2.setStudentName("유재석");
						System.out.println(_06_Student2.serialNum);  //클래스명.참조변수 ==> static변수이기 때문에 가능
						System.out.println("학번 : "+  st2.studentID + "\n이름 " + st2.studentName);
						//st2.printInfo();  //serialNum : 1001
						
						//_06_Student2.serialNum ++;
						
						//st2.printInfo();   //serialNum : 1002
						
						System.out.println("=======================================");
						
						_06_Student2 st3 = new _06_Student2();
						st3.setStudentName("강호동");
						System.out.println ( _06_Student2.serialNum ) ;  //클래스명.참조변수 ==> static변수이기 때문에 가능
						System.out.println("학번 : "+  st3.studentID + "\n이름 " + st3.studentName);
						
						}	
}
