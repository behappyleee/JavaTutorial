package ch13;

public class _04_Main {
	
	public static void main(String[] args) {

		String s1 ="hello" ;
		String s2= "World!!";
		int i = 100; 
		
		_04_StringConcat concat = (s,v) -> {
			// i = 100; //익명내부클래스에서 사용하는 경우에는 지역변수가 상수로 바뀌므로 변경불가 .. 지역변수는 메소드호출이 끝나면 메모리에서 사라지므로 
			System.out.println(s + " , " + v);
			System.out.println(i);
		};
		
		concat.makeString(s1, s2);

		
	}

}
