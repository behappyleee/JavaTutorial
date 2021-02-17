package ch03;

public class _01_StudentMain {
	public static void main(String [ ] args) { //main 함수는 JVM소환 함수
	/*
	 * 		인스턴스 생성 : 클래스명 참조변수명 = new 클래스명  (  );      //new 생성자;
	 *		접근	  : 참조변수명, 멤버변수 
	 *				참조변수명.멤버메소드;
	 *		-참조변수명에는 생성한 인스턴스의 힙메모리공간 주소값이 들어있다.
	 *		앞의 클래스명은 데이터 타입이고, 참조변수로 접근할 때 사용한다.
	 *		뒤에 클래스명은 데이터 타입이고, 힙메모리에 인스턴스생성시 사용한다.
	 * 
	 */
		// 인스턴스 생성,반드시 class 저장된 상태로 인스턴스 생성해여야 함
		// 인스턴스 생성 : 클래스명 참조변수명 = new 클래스명 ( );
		    _01_StudentInfo info1 = new   _01_StudentInfo ( );
		    _01_StudentInfo info2 = new   _01_StudentInfo ( );
			// 변수의 값 설정 , 참조변수명.멤버변수, 변수 스택메모리, 클래스 힙메모리
		    info1.studentID = 100;
		    info1.studentName = "이철한";
		    info1.studentAge = 28;
		    info1.email = " lch93609 @ naver.com ";
		    
		    info2.studentID = 200;
		    info2.studentName = "홍길동 ";
		    info2.studentAge = 30;
		    info2.email = " hong @ naver.com ";
		    
		    // 출력
		    info1.printInfo ( ) ;
		    System.out.println(" ========================== ");
		    info2.printInfo ( );
		    
		    
		   
		    
		    
		    
		    
		    
		}
}
