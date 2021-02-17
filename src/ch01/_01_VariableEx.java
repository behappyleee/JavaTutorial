package ch01;

public class _01_VariableEx {
	//자바 프로그램의 첫 시작 함수
	public static void main (String [] args) {
	//값은 변수(변하는 값)에 담아서 계산, 
		
		String name = "이철한";
		int age = 28;
		String email = "lch93609@naver.com"; 
	    
		System.out.println("이름: "+ name); 
		System.out.println("나이: "+ age);
		System.out.println("email: "+ email);
        System.out.println("------------------------");
        
	    int num1; int num2;    // int는 메모리에 4byte차지
	    num1 = 20;  num2 = 10;
	    int addR = num1 + num2; 
	    int subR = num1 - num2;
	    int mulR = num1 * num2;
	    int divR = num1 / num2;
	    
	    System.out.println("num1 + num2 = " + addR);
        System.out.println("num1 - num2 = " + subR);
        System.out.println("num1 * num2 = " + mulR);
        System.out.println("num1 / num2 = " + divR);
        //System.out.println(변수명);-변수가 가지고 있는 값을 출력
        
        char level = 'F'; // 메모리에 1 byte차지, char 형은 single quotation 
        System.out.println((int)(Math.random()*1000)+1000);
	
	
	}       
}      
        
        
