package ch08;

public class _04_MemberArrayListTest {
			public static void main(String[ ] args) {
		
					
					_04_MemberArrayList memberArrayList = new _04_MemberArrayList();
				
					_04_Member memberLee = new _04_Member(1001, "이지원");
					_04_Member memberSon = new _04_Member(1002, "손민국");
					_04_Member memberPark = new _04_Member(1003, "박서훤");
					_04_Member memberHong = new _04_Member(1004, "홍길동");
				
					
					memberArrayList.addMember(memberLee);
					memberArrayList.addMember(memberSon);
					memberArrayList.addMember(memberPark);
					memberArrayList.addMember(memberHong);

					memberArrayList.showAllMember( )  ;
					
					memberArrayList.removeMember(memberHong.getMemberId());
					
					memberArrayList.showAllMember();
				
				
			}
	
}
