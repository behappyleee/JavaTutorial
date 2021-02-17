package ch08;

public class _06_MemberHashMapTest {
		
		public static void main(String[] args) {
		
				_06_MemberHashMap memberHashMap =new _06_MemberHashMap();
			
				_06_Member memberLee   = new _06_Member  (1001, "이지원");
				_06_Member memberSon   = new _06_Member  (1002, "손민국");
				_06_Member memberPark  = new _06_Member  (1003, "박서훤");
				_06_Member memberHong  = new _06_Member  (1004, "홍길동");	
		
				memberHashMap.addMember(memberLee);
				memberHashMap.addMember(memberSon);
				memberHashMap.addMember(memberPark);
				memberHashMap.addMember(memberHong);
				
				memberHashMap.showAllMember();
				memberHashMap.removeMember(1003);
				memberHashMap.showAllMember();
			
			
		}
}
