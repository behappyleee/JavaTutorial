package ch02;
import java.util.Scanner;
public class _15_DoWhileEx {
		public static void main (String [ ] args) {
				// 월 입력 [1 ~ 12] : 입력월 출력
				// 범위초과 ( 12보다 크거나, 1보다 작으면 ) => ~월은 잘못된 월 입니다. 다시 입력하세요 ~~
				
			Scanner scan = new Scanner (System.in) ;
				int month =0 ;
						do {
							System.out.print ("월을 입력하십시오 [ 1 ~12 월 ] : ");
							month = scan.nextInt();
							System.out.println( month + " 월 입니다. ");
							
					} 	 while ( month <=12 ) ;   {
								System.out.println(" 초과한 월 입니다.");
					}
						
				   
				
	}
}
