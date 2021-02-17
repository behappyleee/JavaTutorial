package ch08;

import java.util.HashMap;

import java.util.Iterator;

public class _06_MemberHashMap {
			
		private HashMap< Integer,  _06_Member > hashMap ;
				
		public _06_MemberHashMap( ) {
			hashMap = new HashMap < Integer , _06_Member>();
		}
		
		public void addMember(_06_Member member) {
			hashMap.put(member.getMemberId(), member);
		}
	
		public boolean removeMember(int memberId) {
			if(hashMap.containsKey(memberId)) {
				hashMap.remove(memberId);
				return true ;
			}
			System.out.println(memberId+"가  존재하지 않습니다.");
			return false;
		}
	
		public void showAllMember() {
			Iterator <Integer> ir = hashMap.keySet().iterator();
			while(ir.hasNext()) {
				int key = ir.next();
				_06_Member member = hashMap.get(key);
				System.out.println(member);
			}
			System.out.println();
		}
	
}
