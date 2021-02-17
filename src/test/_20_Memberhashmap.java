package test;
import java.util.HashMap;
import java.util.Iterator;

public class _20_Memberhashmap {

		HashMap <Integer , _20_Member> hashmap ;
	
		public _20_Memberhashmap (){
		hashmap = new HashMap <Integer, _20_Member> ( );
		}
	
		public void addMember(_20_Member member) {   	//클래스명 실수
		hashmap.put(member.getMemberId() , member);  	//member.getMemberId() 를 _19_Member.getMemberId();라 적음	
		}
	
		public boolean removeMember(int memberId){ //문법실수
			if(hashmap.containsKey(memberId)) {	
				hashmap.remove(memberId);
				return true;
		}
			System.out.println(memberId +" 가 존재하지 않습니다.");
				return false;
		}	
			
		
		public void showAllMember() {  //문법 실수
			Iterator <Integer> ir = hashmap.keySet().iterator();
			while( ir.hasNext() )	{
				int key = ir.next();
				_20_Member mems = hashmap.get(key);
				System.out.println(mems);
			}
		System.out.println();
		}


}