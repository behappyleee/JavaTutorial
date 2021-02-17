package ch07;

public class _05_Main {
		public static void main (String [ ]  args) {
			
			//부모클래스 참조변수 = new 자식클래스 ();
			//부모인터페이스 참조변수 = new 자식클래스();
			/*
			 *  참조형(Reference Type) : 실제 객체를 가리키는 주소값 저장 -> 참조변수의 자료형
			 * 	클래스, 인터페이스, 배열
			 * 	-참조변수의 자료형 -> 클래스타입  참조변수/ 인터페이스타입 참조변수 / 배열타입 배열명 
			 * 
			 */
			
			_05_Tv  tv = new _05_SamsungTv ();
			System.out.println(tv);
			tv.turnsOn();
			
			tv.turnOff(); 
			
			 _05_SamsungTv tv1 =( _05_SamsungTv)tv;
			tv1.operation();
					
					
				}

}
