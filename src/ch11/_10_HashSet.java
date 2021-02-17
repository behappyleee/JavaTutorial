package ch11;
import java.util.Iterator;
import java.util.HashSet;
//424page 코딩하기
public class _10_HashSet {

		private HashSet < _10_Member > hashSet;
		
		public  _10_HashSet () {
			hashSet = new HashSet < _10_Member > ();
		}
		
		public void addMember(_10_Member member) {
			hashSet.add(member);
		}
		
		public boolean removeMember(int memberId) { 
			Iterator <_10_Member> ir = hashSet.iterator();
			
			while( ir.hasNext() ) {
				_10_Member member = ir.next();
				int tempId = member.getMemberId();
				if(tempId == memberId) {	
					hashSet.remove(member);
					return true;
				}
			}
			System.out.println(memberId + "가 존재하지 않습니다. ");
			return true;
		}
		
		public void showAllMember() {
			for(_10_Member member : hashSet ) {
				System.out.println(member);
			}
			System.out.println();
		}
		
	
}
