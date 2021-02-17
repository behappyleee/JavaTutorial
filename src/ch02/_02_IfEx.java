package ch02;

public class _02_IfEx {
	public static void main(String [] args) {
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
		 *    수행문 5 //반드시 수행
		 * 
		 */
		 
		int num = 10;   //결과출력 => -10은 음수 입니다. (양수/0/음수)
		String result ;
		if (num > 0) {
			result = "양수 입니다." ;
		}  else if (num < 0) {
			result = "음수 입니다";			
		}  else {
		    result = "0 입니다";
		}
		   		
		System.out.println(num +"는 " + result);
		
	}
}
