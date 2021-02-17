package test;

public class _08_CalMain {
	public static void main (String [ ] args) {

			_08_CalEx Calculator = new _08_CalEx ( );
		
			int num1 = 20;
			int num2 = 10;
			
			int Total = Calculator.getTotal(num1, num2);
			int Avg = Calculator.getAvg(num1, num2);
		
			System.out.println(" 두 수의 총 합은 : " + Total);
			System.out.println(" 두 수의 평균은 : " + Avg);

			}
}