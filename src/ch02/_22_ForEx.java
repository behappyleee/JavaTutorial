package ch02;

public class _22_ForEx {
		public static void main (String [ ] args) {
				/*
				 *  continue 문 예제 
				 *  continue 문은 반복문과 함께 쓰인다.
				 *  반복문 안에서 continue 문을 만나면, 그 이후의 문장은 수행하지 않고
				 *  for 문에 처음으로 돌아가 증감식을 수행한다.
				 * 
				 */
				// 1~100 까지의 홀수 합계 : total 구하여라.
				int num ;
				int total = 0;
				
				for (num =1 ;  num <= 100 ;  num++ ) {
					 if ( num%2==0)
						continue;
					 total += num;
				}
				
			System.out.println(" 1~ 100 까지의 홀 수 합계 :  " + total);
		}
}
