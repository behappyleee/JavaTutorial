package ch04;

import java.util.Scanner;

public class _02_SungjukMain {
	public static void main (String [] args) {
			Scanner scan = new Scanner(System.in);
			//인스턴스 생성
		_02_Sungjuk score = new _02_Sungjuk();
		
		int korean =score.num1;
		int english = score.num2;
		int math=score.num3;
		
		
		 //출력 성적(Scanner로 값 받기), 국영수 점수 입력받기
		System.out.print(" 국어 성적 : " );
		korean=scan.nextInt();
		System.out.print(" 영어 성적 : " );
		english = scan.nextInt();
		System.out.print(" 수학 성적 : " );
		math=scan.nextInt();
		
		//국영수 평균, 합계 호출 
		System.out.println("국영수 총합은 : " + score.getTotal(korean, english, math ));
		System.out.println("국영수 평균은 : " + score.getAvg(korean, english, math));
		
		//score.getAvg(score.getAvg);
		
		
		
		
		
		
	}
}
