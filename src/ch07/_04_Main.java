package ch07 ;

public class _04_Main {

		public static void main(String[ ] args) {
			/*
			 *   다형성 적용해서 메소드 호출
			 *   부모타입참조변수 = NEW 자식타입 ( );
			 *   
			 */
			
		_04_CompleteCalc calc = new _04_CompleteCalc ( ) ;
		
		System.out.println(" 덧셈 :"     +   calc.add(3, 5) );
		System.out.println(" 나눗셈 : " +   calc.divide(8, 4));
		System.out.println(" 곱셈 : "    +   calc.times(3, 6));
		System.out.println(" 뺄셈 : "    +   calc.substract(7, 5));
		
		calc.printInfo( );
		
		_04_Calculator cal = new  _04_CompleteCalc () ;
		System.out.println("덧셈 : " + cal.add (5, 8) );
		System.out.println("뺼셈 : "  +cal.substract (8, 5) );
		
		if(cal instanceof _04_CompleteCalc) {           //생략을 해도 문제 없음 
			_04_CompleteCalc cals =  (_04_CompleteCalc)cal;
			cals.printInfo();
		}
		
		 _04_CompleteCalc cal1 = ( _04_CompleteCalc)cal ;     //다운캐스팅
		  cal1.printInfo( );
		  System.out.println(" 곱셈 : " +cal1.times(3, 6) ) ;
		  System.out.println(" 나눗셈 :  " +cal1.divide(6, 3) ) ;
		  
		}
		
}
