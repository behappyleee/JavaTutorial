package ch04;

public class _07_StudentMain {
			
	public static void main(String[ ] args) {
		
		/*  [면접]
		 * 		static 변수 = 정적변수 = 공유변수 = 클래스변수
		 *		
		 *		static 변수  
		 *        - 프로그램이 실행되어서 메모리에 올라갔을때 딱 한번 데이터영역 메모리공간에 할당 	
		 * 		   - 객체를 생성하지 않고, 바로 클래스명으로 접근가능
		 * 		   - 인스턴스마다 생성되는 변수가 아니라, 클래스에 속해 한번만 생성되는 변수이고, 여러 인스턴스가  공유하기때문이다.
		 * 		   - 인스턴스가 생성되지 않아도 사용가능하다 (클래스명.static변수, 클래스명.static메소드 사용가능)
		 * 		   
		 *      -  static 변수나 메소드는 static메소드에서 호출 가능
		 *      	클래스 메소드 내부에서 지역변수와 클래스변수는 사용할 수 있지만, 인스턴스 변수는 사용불가
		 *      	클래스 메소드에서 인스턴스 변수를 사용할 수 없지만 반대로 일반 메소드에서 클래스변수를 사용가능하는 것은 문제가 안된다.
		 *    		( 왜냐하면 일반메소드는 인스턴스가 생성될 때 호출되는 메소드이기 때문)
		 *     		(왜냐하면 클래스 변수는 이미 만들어진 변수이기 때문에 일반 메소드에서도 클래스 변수를 호출할 수 있기 때문이다.)
		 *		    (정적메소드에서 일반 인스턴수 변수나 인스턴스 메소드를 호출시 compile 오류발생) ==> 인스턴스 변수,메소드는 메인에서 생성해야 사용가능
		 *			static 메소드는 프로그램 실행 시 자동으로 메모리에 올라가나, 일반메소드는 객체를 생성해야 메모리에 올라간다.
		 *					
		 *	
		 *
		 */
			//serialNum 은 static 변수(공유변수=클래스변수)- 인스턴스 생성과 무관 
			_07_Student st1 = new _07_Student();
			st1.setStudentName(" 홍길동 ");
			System.out.println(  _07_Student.getSerialNum()  ); //생성자가 먼저호출되어 serialNum이 1이증가됨 
			System.out.println("학번 : "+  st1.studentID + "\n이름 " + st1.studentName);
			
			//st1.serialNum++;
			//st1.printInfo();       //serialNum : 1001
			
			System.out.println("==========================");
			_07_Student st2 = new _07_Student();
			st2.setStudentName("유재석");
			System.out.println(_07_Student.getSerialNum() );  //클래스명.참조변수 ==> static변수이기 때문에 가능
			System.out.println("학번 : "+  st2.studentID + "\n이름 " + st2.studentName);
			
			//st2.printInfo();  //serialNum : 1001
			
			//_06_Student2.serialNum ++;
			
			//st2.printInfo();   //serialNum : 1002
			
			System.out.println("=======================================");
			
			_07_Student st3 = new _07_Student();
			st3.setStudentName("강호동");
			System.out.println(  _07_Student.getSerialNum( ) );  //클래스명.참조변수 ==> static변수이기 때문에 가능
			System.out.println("학번 : "+  st3.studentID + "\n이름 " + st3.studentName);
			
			// 클래스명으로 private static 접근방법 클래스로는 접근못함 getter로 접근하여야함
			// public 일시에는 클래스명.static 변수로 접근가능하지만 private일시에는 getter로 접근하여야함  
			
			}	
	
}
