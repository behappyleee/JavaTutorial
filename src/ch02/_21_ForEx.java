package ch02;

public class _21_ForEx {
		public static void main (String [ ] args) {
				// 2 ~ 20 까지 의 합계
				//증감식 활용
				
				int sum = 0;
				for ( int i = 2; i <= 20 ;  i += 2  ) {
					sum += i;
					System.out.println(" i = " + i + ", sum"+ sum);
				}
				
		}
}
