package ch11;

public class _08_StringBuilder {
	public static void main(String[] args) {
		
		String javaStr = new String ("Java");
		
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));	  //javaStr 문자열 주소 : 366712642
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 javaStr의 메모리 주소 : " +System.identityHashCode(buffer) ); //연산 전 javaStr의 메모리 주소 : 1829164700
		
		buffer.append(" and ");
		buffer.append(" android ");
		buffer.append(" programming is fun !!! ");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer) );  //연산 후 buffer 메모리 주소 : 1829164700
		
		javaStr = buffer.toString(); 
		
		System.out.println(javaStr); //Java and  android  programming is fun !!! 
		System.out.println("연결 된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr)); //연결 된 javaStr 문자열 주소 : 2018699554
		
		
	}
}
