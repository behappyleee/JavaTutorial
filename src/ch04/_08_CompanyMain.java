package ch04;

public class _08_CompanyMain {
		
	public static void main( String[] args) {
		/*
		 *   [면접]   ch04_08_Company.java
		 * 	    
		 * 		싱글톤패턴
		 *  -  인스턴스를 단 하나만 생성하는 디자인패턴
		 *  -  static을 응용해서 프로그램 전반에서 사용하는 동일한 인스턴스를 하나만 생성하는 방식
		 *  -  접근할 클래스에서 여러 메소드가 있을때, 외부 클래스가 해당 메소드에 접근할 때마다 객체를 생성 할 필요없이 
		 * 	      한번만 getInstance() 통해서 참조변수만 리턴받아 접근한다.
		 *      
		 *     싱글톤 패턴 생성
		 *   - 1단계 : 생성자를 private으로 만들기
		 *   - 2단계 : 클래스 내부에 static으로 유일한 인스턴스 생성하기
		 *   - 3단계 : 외부에서 참조할 수 있는 public 메소드 만들기
		 *  
		 *     호출 방법
		 *      외부클래스명 참조변수  =  외부클래스명.getInstance( );
		 *      예) _08_Company com1 =_08_Company.getInstace( );
		 *        
		 *        주소값은 다 똑같음 
		 *      call by value : 메서드 호출 시 매개변수에 값 전달
     	 *	    call by reference : 메서드 호출 시 매개변수에 주소(참조값)전달
		 *
		 */
			_08_Company myCompany1=_08_Company.getInstance();   //myCompany1은 08_Company.getInstance()의 주소 값을 가짐
			System.out.println( myCompany1 ); 					//_08_Company.getInstance() 는 new _08_Company ( );  와 똑같음
			_08_Company.getInstance();   //클래스명.메소드명
		    myCompany1.setAddress("강서");;
			myCompany1.setCompanyName("삼성");
			myCompany1.setTelno("0101010101");
			myCompany1.printInfo( );
			
			System.out.println("====================================");
			
			_08_Company myCompany2 = _08_Company.getInstance();
			System.out.println(myCompany2);
			
			myCompany2.printInfo( );
			System.out.println(myCompany1==myCompany2);
			
			_08_Company myCompany3 = _08_Company.getInstance( );
			System.out.println(myCompany3);
			myCompany3.printInfo( );
			System.out.println( _08_Company.getInstance() );
			
					
		}
					
}
