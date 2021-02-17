package ch02;

public class _23_ForEx {
		public static void main (String [ ] args) {
				 /*
				  *		break 문 예제
			      *		반복문에서 break문을 사용하면 그 지점에서 더 이상 수행문을
				  *		반복하지 않고 반복문을 빠져나온다.
				  *		중첩 반복분일 경우 모든 반복문을 빠져나오는 것이 아니라, break 문을 감싸고 있는
				  *		해당 반복문만 빠져 나온다.
				  *		이 때 외부 반복문은 계속  수행된다.
				  * 	continue 문은 반복문을 계속 사용하지만, 그 이후의 문장은수행하지 않고, 
				  *		break 문은 반복문을 더 이상 수행하지않고 빠져나온다.
				  */
					int sum = 0;
					int num =0;
					
					for ( num =0;   ;  num ++) {
						sum += num;
						if ( sum > 100 )
							break;
					}
			
					System.out.println("num : "+ num + " sum : " + sum);
			
					int  month = 0 ;
					int sum1 = 0 ;
					
					for (month =1 ;        ;   month ++) {
						sum1 += month;
						System.out.println(month + " 월 ");
							if( month >= 12 )
								break ;
					}
		}
}
