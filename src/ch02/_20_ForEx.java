package ch02;

public class _20_ForEx {
	
		public static void main (String [ ]  args) {
					//		2 단부터 9단까지 단 입력 받지 않고 출력
					/*
					 * 		for ( 초기값 ; 조건식 ; 증감식;) {
					 *            수행문 ~~ ;
					 * 				
					 * 		for (초기값; 조건식; 증감식){
					 * 				수행문 ~~ ;		
					 *			}	괄호 닫을때 열었을 때랑 맞춰야함 
					 * }
					 * 
					 */
					int times ;
					int sum  ;
					int dan ;
					
					for(  dan =2 ;  dan <= 9;  dan ++ ) {
						System.out.println("====== " + dan + "단 ======");
							for (  times = 1 ;  times <= 9 ;  times++) {
								sum = dan * times ;
								System.out.println(dan + " * " +  times + " = "+ sum);
								}
					}
		
		}
}
