package ch02;

public class _11_WhileEx {
	 public static void main (String [ ]   args) {
		 
		         // 1~10 까지 출력
				 int i =1;             // 1.초기값
				 while ( i <= 10 ) {   // 2.조건식
					 System.out.print(i+"  ");  
					 i++;         //3. 증감식
				 }
				 System.out.println();
				 //1~10 까지  합계  출력
				 
				 int   j =  1;
				 int sum = 0;
				 while( j <= 10) {
					 sum += j ;
					 j++;
				 }
				 System.out.println(" 1~10 까지의 합계  :  " + sum);
	 }	 
}
