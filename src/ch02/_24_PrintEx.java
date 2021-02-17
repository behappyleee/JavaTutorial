package ch02;

public class _24_PrintEx {
	public static void main (String [ ] args) {
				/*
				 * 		print (형식 지정자, 값 또는 변수)
				 * 		- 형식 지정자 
				 * 		%d : 정수를 출력한다.    예) System.out.printf("%d, 10);
				 * 		%f : 실수를 출력한다.     예) System.out.printf("%f, 3.14f);    // 실수 6자리
				 * 		%c : 한문자를 출력한다. 예) System.out.printf("%c, 'A');  //character
				 * 		%s : 문자열을 출력한다. 예) System.out.printf("%s, "Hello");
				 * 
				 * 		println 과 print 와 차이 printf는 실수 6자리로 보여준다 (기본 6자리)
				 */
				double value =1.0/3.0;
				System.out.println( " value :  " + value );      // value :  0.3333333333333333
				System.out.printf("%f" , value);                     //0.333333
				System.out.println();
				
				//System.out.printf("%전체자리수.나머지 자리수f" , value);  //자리수 부족시 공백으로 채움 
				System.out.printf("%6.2f" , value);                //  0.33   //앞의 2자리가 공백으로 채워짐 
				
				System.out.println();
				System.out.printf("%s " , "2020203023");
	}
}
