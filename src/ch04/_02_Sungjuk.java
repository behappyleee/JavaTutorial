package ch04;

public class _02_Sungjuk {
				int num1;
				int num2;
				int num3;
				
				// 국영수 합계(getTotal) int
				
				public int getTotal(int num1, int num2, int num3) {
					int result = num1 + num2 + num3;
					return result;
				}
				
				//국영수 평균(getAvg) double
				public double getAvg (int  num1, int num2, int  num3) {
					double result =(num1 + num2 + num3)/3;
					return result;
				}
				
}
