package ch01;

public class _05_VariableEx {
	public static void main (String [] args) {
		/*
		 * 형변환-1 p.64
		 * 1. 자동적인 형변환 (확대 형변환, 묵시적 형변환)
		 *  데이터가 손실되지 않거나, 손실이 제한적인 범위내에서 묵시적으로 형변환 
		 *  자료형이 다른 변수에 값을 할당하는 경우, 형변환을 생략
		 *  데이터 큰 타입  = 데이터 작은 타입(ex. float f = 10f;  //f에 10.0 대입   
		 *  자료형이 다른 값을 연산하는경우   (ex. double d = 10.0 + 30 // double d = 10.0 + 30.0 
		 *
		 *
		 * 2.강제적인 형변환 (축소 형변환, 명시적 형변환) 
  		 *  명시적으로 형변환 하는것을 Type Casting  
		 *  casting은 생략할 수 없다, 생략시 compile 오류 발생, 반드시 명시적으로 형변환 
		 *  강제로 형변환 하므로 데이터 손실  위험 있음
		 *  데이터 작은 타입  = (작은타입) 데이터 큰 타입을 대입
		 */
			System.out.println ("형변환-1 예제");
			
			double d = 20; // 자동적인 형변환(확대 형변환, 묵시적 형변환) : 데이터 큰 타입 = 데이터 작은 타입
	 	    System.out.println("d :" + d);            // d= 20.0
		    
		    float f = 20.5f + 10;
		    System.out.println("f :" + f); 
		    
		    int i = (int)10.5;
		    System.out.println("i :" + i);
		   /*
		    * 형변환 -2
		    *  3. int (4byte) 보다 작은 자료형은 int 형으로 형 변환 후  계산 
		    *  ex) byte + short -> int + int 
		    *  
		    *  
		    *  4. 두개의 피 연산자 중 표현범위가  큰쪽에 맞춰서 형 변환 후에 계산
		    *  
		    */
		    System.out.println ("형변환-2 예제");
		    
		    int ii;   double ff;
		    ii = 5 / 3;  // int = int/int  
		    System.out.println("ii :"+ii);
		    
		    ff = 5 / 4; //double = int/int -> double ff = 1; 1.25가 1로 int/int는 int
		    System.out.println("ff :" +ff); // ff : 1.0
		  
		    // 형변환보다 () 안의 계산이 우선   
		    ii = (int) (2.5 + 3.3);
		    System.out.println(ii); // int ii = (int)(double + double); // (int)(5.8) = 5
	       	
            System.out.println("============================");
              
            int gg  = 1000000;
            int jj  = 2000000;
            long ll = 2000000l;
	        
	        int e1  =gg * jj;
	        System.out.println("e1 :" + e1);
	        
	        long e2 = (long) (gg*jj); 
	        System.out.println("e2 :" + e2); //연산결과가 계산 전부터이미 int 범위를 초과
	        
	        long e3 = ll*jj;
		    System.out.println("e3 :" + e3); //long형으로 형변환하기 전부터 연선결과가 int형 범위 초과
		    
		    long e4 =(long)gg*jj ; // long * int->long 하나만 long형이여야 함 가로가 연산자 우선순위라 먼저 long변환후  계산됨
		    System.out.println("e4 :" + e4);
		    
		    long e5 = gg * ll;
		    System.out.println("e5 :" + e5);
		    
		    float a6 = 12311111111L;  //float가 long보다 정밀하므로 가능함 
		    
		    ++a6;
		   
		    int a = 7; int b = 9;
		    
		    
		    
		    
         		    
		    
		    
		    
		    
		    
		    
		    
	}
}
