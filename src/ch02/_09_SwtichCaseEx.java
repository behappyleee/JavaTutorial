package ch02;

import java.util.Scanner;

public class _09_SwtichCaseEx {
		public static void main (String  [ ] args) {
			 //90점 이상이면 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F  console입력받기   출력 ==> 점수 : Score, 학점 : grade
			
			Scanner scan = new Scanner (System.in);
			char grade; 
			int score;
			System.out.print("성적 (0~100) : ");
			score = scan.nextInt( ) ;
			
			if ( score > 100  ||  score < 0) {
				System.out.println("잘못된 점수 입니다.");
			} else {
					switch( score/10 ) {
						case   9    :  grade ='A';
							break;
						case   8    :  grade ='B';
							break;
						case   7    :  grade ='C';
							break;
						case   6    :  grade ='D';
							break;
						default     :  grade ='F';
			}	
			System.out.println("점수 : "+ score + " 학점은 : "+ grade +" 입니다.");
			}
			scan.close();
		}
}
