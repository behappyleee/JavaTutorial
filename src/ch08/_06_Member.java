package ch08;

public class _06_Member {

		private int memberId;
		private String memberName;
		
		public _06_Member ( )  { }
		
		public _06_Member(int memberId, String memberName) {
			this.memberId=memberId;
			this.memberName=memberName;
		}
	
		public void setMemberId(int memberId) {
			this.memberId=memberId;
		}
		
		public int getMemberId() {
			return this.memberId;
		}
		
		public void setMemberName(String memberName) {
			this.memberName=memberName;
		}
		
		public String getMemberName() {
			return this.memberName;
		}
		
		@Override
		public String toString() {
			return memberName + "회원님의 ID는 " +  memberId + " 입니다.";
		}

		
}