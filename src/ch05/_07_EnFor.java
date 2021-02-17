package ch05;

public class _07_EnFor {
		public static void main (String [] args) {
				/*		향상된 for 문 (218p) ==>자주 사용 숙지
				 * 		배열의 처음부터 끝까지 모든 요소를 참조할 때 사용하는 반복문 
				 * 		배열 요소값을 순서대로 하나씩 가져와서 변수에 대입
				 * 		따로 초기화와 종료조건이 없기 때문에, 모든 배열의 시작요소부터 끝요소까지 실행한다.
				 * 		for( 변수 : 배열 ){
				 *			반복실행문; 
				 * 		}
				 * 
				 */
				String [ ] strArray = { "java " , " jsp  " , " spring  " , " python   " , " java script  "}; 
				
				for(String  lang : strArray) {
					System.out.println(lang);
				}
				
				
				
				
				
				
				
			}
}
