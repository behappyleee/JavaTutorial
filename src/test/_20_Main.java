package test ;

public class _20_Main {
	public static void main(String [ ]  args) {

			_20_Memberhashmap hash = new _20_Memberhashmap ();
		
			_20_Member mem1 = new _20_Member(1001, "유재석");
			_20_Member mem2 = new _20_Member(1002, "강호동");
			_20_Member mem3 = new _20_Member(1003, "지상렬");
			_20_Member mem4 = new _20_Member(1004, "이광수");
		
			hash.addMember(mem1);
			hash.addMember(mem2);
			hash.addMember(mem3);
			hash.addMember(mem4);
			
			hash.removeMember(1002);
			
			hash.showAllMember();

	}

}