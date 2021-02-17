package ch11;
//424page 코딩하기 
public class _10_Main {
	public static void main(String[] args) {
		
		// equals와 hashcode 를 오버라이딩하여 중복되는 데이터는 추가되지않도록 한다. 
		// 객체가 동일함을 구현하여 중복되는 데이터는 추가 되지 않도록 함 
		
		_10_HashSet member = new _10_HashSet();
		
		_10_Member memberLee = new  _10_Member (1001, "이지원");
		_10_Member memberSon = new  _10_Member (1002, "손민국");
		_10_Member memberPark = new _10_Member (1003, "박서훤");
		
		member.addMember(memberLee);
		member.addMember(memberSon);
		member.addMember(memberPark);
		member.removeMember(1002);
		member.showAllMember();
		
		_10_Member memberHong = new _10_Member (1003, "홍길동");
		member.addMember(memberHong);
		member.showAllMember();
		
		
	}
}
