package test;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class _20_Login {
	
	public static void main(String [] args ) {

		Map <String , String> login = new HashMap < >();  //new 를 뺴먹어서 ERROR발생 
		Scanner scan = new Scanner (System.in);

		login.put("kim"  , "kim1234" );
		login.put("lee"  , "lee1234" );  //"" 빼먹음 
		login.put("hong" , "hong1234");
		login.put("park" , "park1234");
		login.put("baek" , "baek1234");
		
		String id  ;
		String pwd =null;
		System.out.println("종료 원할 시 Q or q를 입력하여 주시오. ");
		
		do {
			System.out.print("ID를 입력하여 주시오 : ");
			id = scan.next();		
		 
		if( id.equals("q")  || id.equals("Q") ) {
		 		break;
		 } else if (id.equals(login.containsKey(id) )  ) {
			 System.out.print("PWD를 입력하여주십시오 : ");
			 pwd= scan.next();
		 } else if(id.equals(!login.containsKey(id) ) ) {	
			 System.out.println("존재하지 않는 ID 입니다." );
			 continue;
		 }	if( pwd.equals(login.get(id) ) ) {      //메소드명 틀림 , id == longin.containsKey(id)라 기입함
			System.out.println("정상 로그인 되었습니다." );
		 }	else   {  //equals를 사용안하고  실수로 == 연산자 사용함 
			System.out.println( "비밀번호가 틀렸습니다. ");
			System.out.println("다시 입력하여 주십시오.");
		 } 
		 } while(true); { 		 
			 System.out.println("정상 종료 되었습니다. ");
		 }
	
		 
		 
	}
		
}


		 
		

		
		


		
		
		

