package ch07;
//자식 클래스 implements-부모클래스가  인터페이스를  상속시 implements 사용
public abstract class _04_Calculator implements _04_Calc {

		@Override 
		public int add (int num1, int num2) {
			return num1 +num2;
		}   // interface에서 void타입이 아닌 int타입이므로 return 사용
		
		@Override
		public int substract(int num1, int num2) {
			return num1 - num2;
		}
		
		//times divide 안하겠다 == > abstract 클래스로 됨 
		/*@Override 
		public int  times (int num1, int  num2) {
			return num1 * num2;
		}
		*/

}
