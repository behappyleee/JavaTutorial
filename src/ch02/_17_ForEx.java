package ch02;

public class _17_ForEx {
		public static void main (String [] args) {
					/* 
					 *   for 문의 기본 구조  
					 *   for (  초기값 ;  조건식 ;  증감식) {	
					 *             수행문장 1;
					 * 				수행문장 2;	....		
					 * }
					 *    for 문 안의 변수는 local variable for문 안에서만 인정되는 변수임      
					 */
					// Good Luck 1 ~~ ..... Good Luck 5 ~~
				for ( int i = 1 ;  i<=5  ;  i++) {  
				   System.out.print(" Good Luck " + i + " ~~ ");
				}
				   System.out.println( );
		
				   
				   for ( int i = 5 ; i >= 1 ; i--) {  
					System.out.print(" Good Luck " + i + " ~~ ");
				}
				    System.out.println();
				// Hello ~~ 무한 루프
				//for (   ;    ;    ) {
					//System.out.println("Hello ~~ ");
				//}
				
				
		}				
}
