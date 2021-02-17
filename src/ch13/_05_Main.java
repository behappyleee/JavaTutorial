package ch13;

public class _05_Main {

	public static void main(String[] args) {
		
		//람다식을 인터페이스 형 변수에 대입하고, 그 변수를 사용해 람다식 구현부 호출
		
		_05_PrintString lamdaStr = str -> System.out.println(str);
		
		lamdaStr.showString("Hello_lamda_1");
		
		//똑같은 클래스 내의 static메소드는 참조변수 필요없음
		showMyString(lamdaStr); //메소드의 매개변수로 람다식을 대입한 변수 (=lamdaStr)전달
		
		
		
	}
	//매개변수를 인터페이스형으로 받음
	public static void showMyString(_05_PrintString p) {
		p.showString("Hello lamda_2");
	}

}

/*	
 *  Hello_lamda_1
 *	Hello lamda_2
 * 
 */


