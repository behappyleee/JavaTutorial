package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_LoginHashMap {
		public static void main(String[] args) {
		/*
		 *  1. Id. pwd 5건을 hashtable에 저장(HashMap에 저장)
		 *  2. console로부터 id,pw 를 입력받는다.
		 *	3. 1과 2를 비교해서 Id가 없으면 "입력하신  ID가 존재하지 않습니다." 출력
		 *  4. ID가 있으면 일치시 "로그인 되었습니다." 출력
		 * 		불일치시 "비밀번호가 일치하지 않습니다." 출력
		 *  5. Q 나 q 이면 종료
		 * 
		 * 	id = "hong" pw = "hong1234"
		 * 3) 메소드
		 * 데
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		Map <String , String> hashmap = new HashMap <String , String > ( );
		
		hashmap.put("hong", "hong1234");
		hashmap.put("park", "park1234");
		hashmap.put("lee" , "lee1234");
		hashmap.put("kim" , "kim1234");
		hashmap.put("son" , "son1234");
		
		/*System.out.println("ID를 입력하시오 : ");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력하시오 : ");
		String pwd = scan.nextLine();*/
		
		//주의사항 : 
		do {
			System.out.println("ID를 입력하십시오 : ");
			String id  = scan.next();
			String pwd = null;
			
			if(id.equals("Q")  || id.contentEquals("q") ) {
				break;
			} else if( hashmap.containsKey(id) )  {     ///id 일치
				System.out.println("PWD를 입력하세요 : ");
				pwd = scan.next();
			} else if(!hashmap.containsKey(id)){
				System.out.println("존재하지 않는 ID입니다.");
				continue;
			}	if(pwd.equals(hashmap.get(id)) ) {     //패스워드일치  ==> if( pwd.equals(id로 읽어오는 값) ) { },  id가 키이므로 id로 가져온값 읽음 
				System.out.println("로그인 되었습니다.");
			} else  {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}  while( true ); {
			System.out.println("로그인 종료");
		}

			
		}
		
}

		/*if( id.equals(hashmap.containsKey(id) ) && pwd.contains(pwd) )  {  
			System.out.println("로그인 되었습니다.");
		
		} else if(id.equals(hashmap.get(id) )){
			System.out.println("비밀번호가 틀렸습니다.");
	
		} else if (pwd.equals(hashmap.get(pwd) ) ) {
			System.out.println("존재하지 않는 ID입니다.");
		
		} */
		
		
		//Q 나 q 이면 종료
		//System.out.println("=====================================");
		//System.out.println(" 종료하고 싶으시면 Q나 q를 입력하십시오. ");
		//String a = scan.nextLine();
	
		/*String a;
		do {
			System.out.println("종료하고 싶으시면 Q나 q를 입력하십시오.");
			a = scan.nextLine();
			
		} while(!a.contentEquals("Q") && !a.contentEquals("q") );{
			System.out.println(" 종료되었습니다. ");
			
		}*/
		
		
		
		
	
		
		
