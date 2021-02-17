package ch04;

public class _01_CalMain {
		public static void main (String [ ] args) {
			
			_01_Calculator plus = new _01_Calculator ();
			
			double sum = plus.add (10.0, 5.0);    //10.0 과 5.0이 매개변수
			System.out.println("두 수의 합 : " + sum);  //sum 에 return 값이 담김
			
			double sub = plus.sub(10.0, 5.0);
			System.out.println("두 수의 뺏셈 : " + sub);
			
			double mul = plus.mul(10.0, 5.0);
			System.out.println("두 수의 곱셈 : " + mul);
			
			double div = plus.div(10.0, 5.0);
			System.out.println("두 수의 나눗셈 : " + div);
			
			
			
			
				
			
		}
}
