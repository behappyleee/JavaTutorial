package ch02;

public class _10_WhileEx {
	 public static void main (String [ ] args) {
		 	/*
		 	 *  반복문 : 조건식이 참인  동안 반복 :(while 문 for 문)
		 	 *                  초기값 ==> 조건식 ==> 증감식
		 	 *                  
		 	 *  초기값              
		 	 *  while (조건식) {
		 	 *            수행문1
		 	 *            수행문2...............
		 	 *             증감식;
		 	 *   }    
		 	 *    수행문3
		 	 */
            // Good Luck 1/2/3/4/5 ~~~~ 		 
 
				int i = 1;  //초기값
				
				while (i <=5) {  //조건식
					System.out.print("Goou Luck"+ i +"~~ ");
					i++; //증감식
				}
	          // Good Luck 5/4/3/2/1
				System.out.println();
				
				int j = 5 ;
				while  ( j >= 1 ) {
					System.out.print("Happy " + j +" ~~");
				    j--;
	             }
	

	
	
	 }	
}
		 
		 
		 
