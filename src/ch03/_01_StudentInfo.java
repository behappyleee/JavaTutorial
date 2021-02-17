package ch03;

public class _01_StudentInfo {    //실행은 오직 Main 클래스에서만 가능(instance 생성 후) 생성되지 않으면 문서로만 존재
		/*
		 * 	    클래스 :  객체에 대한 설계도, 디자인, 
		 * 		-멤버변수 (속성, 필드) + 멤버메서드(기능, 동작) + 생성자 
		 * 			
		 * 		클래스(힙메모리에저장)는 설계도(디자인)이며 인스턴스는 이 설계도를 바탕으로 만들어진 Heap memory 공간
		 * 		그 결과 주소값이  만들어지며, 참조변수(스택에 저장)에 할당한다.
		 * 		객체는 인스턴스라고도 한다.	
		 * 	
		 * 		인스턴스 생성 : 클래스명 참조변수명 = new 클래스명 ( );      //new 생성자;
		 *						접근	  : 참조변수명, 멤버변수 
		 *									참조변수명.멤버메소드;
		 *		-참조변수명에는 생성한 인스턴스의 힙메모리공간 주소값이 들어있다.
		 *		앞의 클래스명은 데이터 타입이고, 참조변수로 접근할 때 사용한다.
		 *		뒤에 클래스명은 데이터 타입이고, 힙메모리에 인스턴스생성시 사용한다.
		 * 
		 */
			// 멤버변수  -  속성, 초기화 필요X, heap 메모리에 올라갈시 자동으로 초기화됨
			int studentID;         // 학번.100
			String  studentName;   //이름
			int studentAge;
			String email;
			
			//멤버 메소드 - 기능
			public void printInfo( ) {
				System.out.println(" 학번 : " + studentID);
				System.out.println(" 이름 : " + studentName);
				System.out.println(" 나이 : " + studentAge );
				System.out.println(" email : "+email);	
			}
			
}
