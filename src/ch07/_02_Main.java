package ch07;
//추상클래스 
public class _02_Main {
		
		public static void main(String[ ] args) {
				
		  //_02_Calculator cals  = new _02_Calculator();  ==> 에러발생 부모클래스는 추상클래스이므로  인스턴스 생성불가(모든 메서드가 구현되지 않았으므로)
			_02_Calculator cal = new _02_CompleteCalc();   // ==> 다형성 이용하여 인스턴스 생성 (자식클래스로 접근)
				
			cal.add (5 , 7);   //재정의된 자식 메소드가 호출
			cal.sub (8 , 5);
			cal.mul (3 , 5);
			cal.div (6 , 3);
			
			_02_CompleteCalc com = (_02_CompleteCalc)cal;
			com.printInfo();
			
			
		}
	
}
