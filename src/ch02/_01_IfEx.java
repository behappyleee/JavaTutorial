package ch02;

public class _01_IfEx {
	public static void main (String [] args) {
		/*
		 * if-else  if-else 문
		 * if(조건식1){  //조건식 1이 참인 경우 수행
		 *     수행문 1 ;
		 * } else if(조건식2) {   //조건식 2가 참인 경우 수행
		 *     수행문2;
		 * }  else if (조건식3) { //조건식 3가 참인 경우 수행
		 *     수행문3;
		 * } else {             //위 의 조건이 모두 해당되지 않는 경우 
		 *     수행문 4;
		 * }
		 * 수행문 5 //반드시 수행
		 * 
		 */
	     int age = 8; //8살 이상이면 "학교에 다닌다."출력  그렇지 않으면 "학교에 다니지 않는다." 출력
	                   //if 문은 구조부터 먼저 만들기 
	     if( age>= 8) {
	      	 System.out.println("학교에 다닌다");
	     } else {
	    	 System.out.println("학교에 다니지 않는다");
	     }
  
  }
}
