package test;

public class _19_Main {
	public static void main (String [ ] args ) {

	_19_ArrayList  members = new _19_ArrayList ();    //클래스명 오타

	_19_Member mem1 = new _19_Member(1001, "유재석");
	_19_Member mem2 = new _19_Member(1002, "강호동");
	_19_Member mem3 = new _19_Member(1003, "지상렬");
	_19_Member mem4 = new _19_Member(1004, "이광수");

	members.addMember(mem1);
	members.addMember(mem2);
	members.addMember(mem3);
	members.addMember(mem4);
	
	members.removeMember(1002);

	members.showAllMember();


	}

}