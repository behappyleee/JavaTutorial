package ch02;
import java.util.Scanner;
public class _06_IfEx {
	 	public static void main (String  [ ] args) {
	 			/*
	 			 *  입장료 
	 			 *  age : 나이 입력 받는다        1~8세    :   미취학 아동(grade)   : 1000
	 			 *  charge  : 요금             ~13세    :   초등학생 (grade)      : 2000
	 			 *  grade    : 단계            ~19세    :   청소년(grade)          : 3000
	 			 *                                               ~64세    :   일반인(grade)          : ADULT _CHARGE : 4000 선언 ==> charge에 대입 
	 			 *                                              ~65세     :  경로우대                 : ADULT_CHARGE에 20%할인 
	 			 *                                              출력 형식 ==> 나이 : ~이며, GRADE,  입장료 : CHARGE 
	 			 */
	 		Scanner scan = new Scanner (System.in);
	 		
	 	    final int ADULT_CHARGE =  4000;  // 상수 처리 (변경불가)
	 		int age;   
	 		String grade;
	 		int charge=0;
	 	    double a ;  
	 	    double b=0.8;
	 	    System.out.print ( " 나이 :  " );
	 	    age = scan.nextInt ();
	 	    
	 	    if (age <= 8 ) {
                grade = "미취학아동";	 charge = 1000 ;  	    	
	 	    } else if ( age <= 13) {
	 	    	grade = "초등학생" ;     charge =  2000;
	 	    } else if ( age <= 19) {
	 	    	grade = "청소년";         charge =  3000;
	 	    } else if ( age <= 64) {
	 	    	grade ="일반인";          charge = ADULT_CHARGE ;
	 	    } else { 
	 	    	grade = "경로우대";  a= ADULT_CHARGE * b ;   charge =(int)a ; // 명시적 형변환 charge =  (int)ADULT_CHARGE * b 
 	 	    }                                                                                                           
	 		System.out.println(" 나이 :  " + age +" 세이며, " + grade + " ,입장료 : " + charge);
	 		scan.close ( );
	 	     		 }
}
