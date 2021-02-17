package ch01;
import java.util.Scanner; //java.util에 있는거 가져오기 위하여 import를 사용함 

public class _07_InOutEx {
		public static void main(String [] args) {
		
			int x = 0;  // 첫번째 숫자를 입력받아 저장
			int y = 0;  // 두번째 숫자를 입력받아 저장
			
			// Scanner scan = new Scanner (System.in); Scanner는 참조형(클래스), nextInt ( ) ==> console에 입력한 값을 읽어옴, scan.nextInt(); >console값 읽어옴 
		    // scan.nextInt(); console에서 값을 읽어옴 
			// 클래스형 참조변수명 = new 클래스명 ( ) ; 참조 변수명은 주소값을 가지고있다. new라는 명령어에 의해서 memory에 올라감 
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("첫번째 숫자를 입력하세요 : ");
			x=input.nextInt();
			
			System.out.print("두번째 숫자를 입력하세요 : ");
			y=input.nextInt();
			
			int sum = x + y ;
			System.out.println("sum : " + sum);
			
			System.out.println("프로그램 종료 ~~~~");
		    input.close (); //자원 해제
		    /* 자바 API ==> https://docs.oracle.com/javase/8/docs/api
		     * 변수 
		     * 1. 기초형 (Primitivie Type): 실제값이 저장
		     *    - 데이터타입 변수명 = 값;
		     *      int score = 70;
		     *    
		     * 2. 참조형 (Reference Type) : 실제 객체를 가리키는 주소값이 저장
		     *    - 클래스, 인터페이스, 배열 
		     *    - 클래스인 경우 
		     *    클래스명  참조변수 = new 클래스명 ();
		     *    참조변수명, 멤버메소드;
		     *    참조변수명.멤버변수;
		     *    
		     *    ex) Scanner scan = new Scanner (System.in);
		     *     - 참조변수명에는 객체(인스턴스)를 가리키는 주소값이 들어있다.
		     *    
		     *    
		     */
		    
		    
	}
}
