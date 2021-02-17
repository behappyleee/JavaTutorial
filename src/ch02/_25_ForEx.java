package ch02;

public class _25_ForEx {
	
	public static void main (String [ ] args) {
				 //str 문자열 중에서 ' n ' 의 갯수 :  4 (count)
				//str의 길이 : str.length ();
				//str.charAt(i) == 'n'
				//출력 : ==>str의 길이, 문장에서 발견된 n 의갯수
		
				String str = "no pain no gain" ;
				int  count = 0 ;
				str.length();
				// str 문자열 중에서 'n' 이 나오면count를 증가 시킨다.
				
				for ( int i =0 ;  i <str.length();  i++ ) {
					if (str.charAt(i) != 'n') 
						continue;
					
						count ++;
					
				}
						System.out.println("문장에서 발견된 n의 갯수 : " + count );
		
	}
}
