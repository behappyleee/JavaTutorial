package ch01;

public class _03_VariableEx {
	public static void main (String [] args) {
	
		/*  
		 * 아스키 코드값 (10진수) 
		 *  A : 65
		 *  B : 66
		 *  C : 67
		 *  Z : 90
		 *  a : 97 
         *  z : 122
		 *
		 *
		 */
		
	  char ch1 = 'A';
	  System.out.println("ch1 : " + ch1);
	  
	  // 문자에 해당하는 정수값 (아스키 코드값) 출력
      System.out.println((int)ch1);       //65		
      
      char ch2 = 66;
	  System.out.println("ch2 : " + ch2); //B	
	  // 정수값에 해당하는 문자출력 
	  
	  int ch3 = 67;
	  System.out.println("ch3 : " + ch3); //67
	  System.out.println((char)ch3);      //C	
		
	  char ch4 = 97;
	  System.out.println((int)ch4);       //97
		
	  char ch5 = 'z';
	  System.out.println((int)ch5);       //122
		
	
	  
	  
	  
	  
	  
	  
	  
		
	}
}
