package ch13;

public class _01_StringBuffer {

	public static void main(String[] args) {
	/*
	 * StringBuffer : 문자열을 추가하거나 변경시 사용
	 * - 추가 : append()
	 * - 삽입 : insert(시작위치, 문자열) : 특정위치에 원하는 문자열을 삽입
	 * - subString(시작위치, 끝위치) : 시작위치에서 끝 위치 -1 까지의 문자열을 추출한다. 공백포함  
	 * 							    인덱스는 0부터시작하며, 끝  위치보다 작아야 한다.
	 * - toString(): 메소드를 이용해서 String형으로 변경한다.
	 */
		
		StringBuffer sb = new StringBuffer();
		// 추가 : append()
		sb.append("맛있게 ");
		sb.append("먹으면 ");
		sb.append("0칼로리");
		
		System.out.println(sb);  //맛있게 먹으면 0칼로리 
		System.out.println( sb.toString() ); 
		
		sb.insert(8 ,"정말로");  //삽입 : insert(시작위치, 문자열);
		System.out.println(sb);//맛있게 먹으면 정말로0칼로리
		
		/*
		 *  = subString(시작위치, 끝 위치) : 시작위치에서 끝 위치 -1 까지의 문자열을 추출한다. 공백포함
		 * 								 인덱스는 0부터시작하며, 끝 위치보다 작아야 한다.					
		 */
		
		
		System.out.println(sb.substring(4, 7) );  //먹으면
		System.out.println(sb.substring(5,9));  //으면 정
		
		
		
		
		
		
		
		
		
		
		
	}

}
