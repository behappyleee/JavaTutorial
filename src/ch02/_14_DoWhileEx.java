package ch02;

public class _14_DoWhileEx {
			
		public static void main (String [ ] args) {
		/*
		 * Do-While 문 : 반드시 1번은 수행해야 하는 경우 사용
		 * 	      	        조건이 만족하지 않을 때 블록을 빠져나간다.
		 * 				데이터를 처리하기 전에 사용자로부터 메뉴나 데이터를
		 * 				입력받아야 하는 경우 많이 사용
		 *      do {
		 * 				 수행문 1 ;
		 *    			 수행문 2 ;
		 */
		
		// 1 부터 10 까지의 합
		  
			int num = 1 ;
			int sum = 0 ;
			
			do {
				sum += num ;
				num ++ ;
			}    while (num <=10 );  {
					System.out.println(" 1부터 10까지 의  합은 : "  + sum + "  입니다 " );
			}
		}
}
				
				
				
				
				
				
				
				
