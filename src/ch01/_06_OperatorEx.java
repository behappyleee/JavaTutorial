package ch01;

public class _06_OperatorEx {
	public static void main (String [] args) {
		
		System.out.println(" === 사칙연산자 예제 === ");
		int num1 = 8; //변수선언, 초기화 
		int num2 = 4; //변수선언, 초기화
		
		int addR = num1 + num2;
		int subR = num1 - num2;
   		int mulR = num1 * num2;
   		int divR = num1 / num2;
   		int modR = num1 % num2;
		
		System.out.println("num 1 :" + num1 );
		System.out.println("num 1 :" + num2) ;	
		System.out.println("num 1 + num2 :" + addR );
		System.out.println("num 1 - num2 :" + subR );
		System.out.println("num 1 * num2 :" + mulR );
		System.out.println("num 1 / num2 :" + divR );
		System.out.println("num 1 % num2 :" + modR );
        /*
         * 2. 증감연산자
         * 
         * 1) 전위 연산자 : y=++x; ==> ++x; y=x;
         *   1.x값을 1증가한 후  2. 그 증가값을 y에 대입 
         * 
         * 2) 후위 연선자 : y=x++; ==> y=x; x++; 
         *   1. x값을 y에 먼저 대입   2. x값을  증가 
         *      
         */ 
		
		System.out.println(" === 증감연산자 예제 === ");
		
		int c =5;   int nextC = ++c;     //전위 연산자    ++c ==> c=c+1
		System.out.println("c= " + c);   // c = 6
		System.out.println("nextC = " + nextC);
		
	    int d = 5;  int nextD = d++;        // nextD = d++ ==> nextD에 d를 대입, d를 1 증가
	    System.out.println("d =" + d );     // d=6    ==> 증가된 값을 출력
	    System.out.println("nextD =" + nextD);  //후위연산자는 대입을 먼저 함 
	    
        int e =2, f =3, result=0;	 
        System.out.println(++e + --f*e--);   // 3+2*3=9
        System.out.println("e = " + e);      // e=2
        System.out.println("f = " + f);      // f=2
        
        result = ++e + --f*e--;
        System.out.println("result = " + result); // 3 + 1 * 3 = 6
        System.out.println("e =" + e);            // e=2
        System.out.println("f =" + f);            // f=1
        
        System.out.println();     
      
        int e1 = 4, f1 = 5, result1 = 0;
	    System.out.println( ++e1 + f1-- + ++f1*e1-- );    
	    
	    int j2 = 3;
	    System.out.println(++j2 + e*++j2); //증감연산자 중복일때 앞에서 부터 증감 
	    System.out.println(j2);

	    boolean asd = (5>3) ;
	    System.out.println(asd);
	    /*
	     * 연산자 
	     * 3. 관계 연산자 : 같다 (==), 같지 않다 (!=), >, <, >=, <=
	     */
	    System.out.println(" === 관계연산자 예제 === ");   
	    int c1= 10; 
	    int c2= 20;
	    System.out.println("c1 == c2 :" + (c1==c2));  //false 
	    System.out.println("c1 != c2 :" + (c1!=c2));  //true
	    System.out.println("c1 > c2 :" + (c1==c2));   //false 
	    System.out.println("c1 < c2 :" + (c1==c2));   //true
	    System.out.println("c1 >= c2 :" + (c1==c2));  //false
	    System.out.println("c1 <= c2 :" + (c1==c2));  //true
	    /*
	    * 4. 복합 연산자 
	    */
	    System.out.println("=== 복합연산자 예제 ===");  
	    int i = 5;
	    i += 10;  // i = i + 10; 
	    System.out.println("i = " + i);
	    i *= 10;
	    System.out.println("i =" + i);
	    i /= 10;
	    System.out.println("i ="+  i);
	    i %= 7;
	    System.out.println("i =" + i);
	    i -= 1;
	    System.out.println("i=" +  i);
	    
	    /*
	     * 5. 논리 연산자 : 1이면 TRUE(참) 0이면 FALSE(거짓)
	     *  &&(논리곱) : x && y ==> x와 y 모두 참이면참, 그렇지 않으면 거짓
	     *  ||(논리합) : x || y ==> x와 y 중에서 하나만 참이면 참, 그렇지 않으면 거짓
	     */
	    System.out.println(" === 논리연산자 예제 === ");
	    int z1 = 4, y1 =5;
	    System.out.println( (z1==4)&& (y1==5) );   //T && T ==> T
	    System.out.println( (z1==4)&& (y1==10));   //T && F ==> F
	    
	    System.out.println( (z1==4)|| (y1==5) );   //T || T ==> T
	    System.out.println( (z1==4)|| (y1==10));   //T || F ==> T
	    System.out.println( (z1==3)|| (y1==10) );  //F || F ==> F
	    /*
	     *  6. 삼항연산자 : 항이 3개인 연산자를 의미
	     *  조건식 ? 결과1 : 결과2;  조건식이 참이면 결과1 수행, 거짓이면 결과2 수행
	     *  
	     */
	    //SCORE 60이상이면 "합격" 그렇지 않으면"불합격" result2 출력
	    int score = 10;    
	    String result2 = (score >= 60) ? "합격":"불합격";
	    System.out.println("result2 :" + result2); // 결과=조건식 ? 결과1:결과2;
	    //score60이상이면합격 그렇지 않으면 불합격 40미만이면 과락 result3 출력
	    String result3 = (score>=60) ? "합격" : (score >= 40) ? "불합격" : "과락" ; 
	    

	    
	    
	    
	    
	    
	}
}
