package ch11;
//page 371 page 코드 작성하기 
public class _07_StringTest {
	/*
	 * value 변수 : private final char [ ] value ==> final 이므로 한번 생성된 문자열은 변경되지 않는다.
	 * 			     따라서 값이 변경되거나 추가시 새로운 문자열이 생성된다.	
	 */
	public static void main(String[] args) {
		String javaStr = new String ("java");  
		String androidStr = new String("android"); //
		
		System.out.println("javaStr 주소 값 : "+System.identityHashCode(javaStr) ); // javaStr 주소 값 : 366712642
		System.out.println("androidStr 주소 값 : "  + System.identityHashCode(androidStr) ); // androidStr 주소 값 : 1829164700
		
		System.out.println(javaStr); //java 출력 
		
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));  //처음 문자열 주소값 : 366712642 
		
		javaStr = javaStr.concat(" " + androidStr); //concat은 문자열 잇는 메소드임  ==> concat 할 시 주소값변함
		
		System.out.println(javaStr); //javaandroid 출력 
		
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));  //연결된 문자열 주소 값 : 2018699554
		//concat 시행할 시 주소값 처음이랑 변함 
		
	}
	
	
}
