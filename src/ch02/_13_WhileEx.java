package ch02;

public class _13_WhileEx {
		public static void main (String [ ] args) {
			// 1~9단          1. 초기값           2. 조건식           3. 증감식 
				// 초기값
				int dan =2 ;                                            
				int sum;
				// 2 . 조건식
				while ( dan  <= 9 ) {
					System.out.println("======" + dan + "======");
					 int times =1;  
					 while( times <= 9) {
						 sum = dan * times;
						 System.out.println( dan + " * " + times +" = " + sum );
						 times++;                    	 //증감식
					 }
					 	dan++;                              //증감식
					                                            //초기 값 반드시 줘야함 
					 
				}                                         	 //코드확인하기
				
		}			
}	

