package ch11;
//String과 Integer는 equals미리 재정의 되어있음

//확인 360page
public class _04_StringEquals {
	public static void main(String[] args) {
		/*   ==  : 물리적인 주소 비교 
		 *  String 클래스와 Integer 클래스에는 equals()가 이미 재정의 되어있어서 값이 동일한지 비교 
		 * 
		 * 
		 */
		//String 과 Ingeger 클래스에는 이미 equals()재정의
	String str1 = new String("abc");
	String str2 = new String ("abc");
	
	
	System.out.println(str1==str2);  //false ==>주소값다름 
	System.out.println(str1.equals(str2) );	//true
		
	Integer intt1 = new Integer(100);
	Integer intt2 = new Integer(100);
	
	System.out.println(intt1 == intt2); //false  ==>주소값다름
	System.out.println( intt1.equals(intt2) ); //true 
		
		
	
	}
	
}
