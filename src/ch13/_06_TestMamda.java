package ch13;

public class _06_TestMamda {
	public static void main(String[] args) {
		
		//람다식을 인터페이스 형 변수에 대입하고,
		_06_PrintString lamdaStr = str -> System.out.println(str);
		
		lamdaStr.showString("Hello_lamda_1");
		
		//똑같은 클래스 내의 static메소드는 참조변수 필요없음
		showMyString(lamdaStr); //메소드의 매개변수로 람다식을 대입한 변수 (=lamdaStr)전달
		
		_06_PrintString reStr = returnString(); 	
		reStr.showString("hello ");
		
		
		
		
	}
	//매개변수를 인터페이스형으로 받음
		public static void showMyString(_06_PrintString p) {
			p.showString("Hello lamda_2");
		}
	//반환값으로 쓰이는 람다식
		
	public static _06_PrintString returnString() {
	
		return str -> System.out.println(str + "World");
	}
		
	
}
