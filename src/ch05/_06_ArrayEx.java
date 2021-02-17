package ch05;

public class _06_ArrayEx {
		public static void main  (String[ ] args) {	
			   /* 
				 *    ******* 성적표 *******
				 *  ======================
				 * 번호   국어   영어   수학   총점   평균   학점
				 * =======================
				 * 1         100  100 100 300 100    A
				 *                    5명정도 출력
				 * ===================
				 *  과목합계 
				 *  평균 : 소수점 둘째자리
				 *                
				 *  2차원 정해진 배열 => scores     2차원 배열 : 국 영 수 점수는 주어진 값
				 *    총점(sum), 평균(avg), 과목합계(korTot, engTot, mathTot)는 직접계산
				 * 
				 */
				System.out.println(" ******* 성적표 *******");
				System.out.println("==============================");
				System.out.println("   번호     국어    영어    수학    총점    평균    학점 ");
				System.out.println("==============================");
				int sum=0;
				double avg=sum/3;
				char grade = ' ';
				int korTot=0;
				int engTot=0;
				int mathTot=0;
				int [ ] [ ] scores = {
						{60, 70 , 80},
						{80, 90 , 70},
						{60, 90 , 50},
						{70, 50,  60},
						{80, 50,  60}
				};
				for ( int  i=0;  i < scores.length ; i++) {
					System.out.print("    " +(i+1) + "       ");
					sum=0;
					for(int j=0  ;   j < scores[i].length ;  j++)  {
						sum += scores [i][j] ;
						avg=sum/3;
						System.out.print( scores[i][j] + "       " );
						if ( j==0 ) {
							korTot += scores[i][j];
						} else if  (j==1) {
							engTot += scores[i][j];
						} else if (j==2) {
							mathTot += scores[i][j];
						}
					}
					if( avg >=80) {
						grade = 'A';
					} else if ( avg >= 70) {
						grade = 'B';
					} else if (avg >=60) {
						grade='C';
					} else if (avg >= 50) {
						grade ='D';
					} else {
						grade='F';
					}
					System.out.println( sum + "    " +  String.format( " %.2f ",  avg ) +"    " + grade );
				}
				
				System.out.println( " 국어 총점 : " + korTot + "\n 영어 총점 : " + engTot +"\n 수학 총점 : " + mathTot);
		}	
				
}


