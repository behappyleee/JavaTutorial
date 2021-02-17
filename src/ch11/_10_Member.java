package ch11;

//407page 코딩하기

public class _10_Member {
	
		private int memberId;
		private String memberName;
		
		public _10_Member () {}
		
		public _10_Member(int memberId, String memberName) {
			this.memberId=memberId;
			this.memberName=memberName;
		}
	
		public int getMemberId() {
			return memberId;
		}
	
		public void setMemberId(int memberId) {
			this.memberId = memberId;
		}
	
		public String getMemberName() {
			return memberName;
		}
	
		
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		
		
		@Override
		public String toString () {
			return	memberName + " 님의 ID는 " + memberId;  
		}
	
}
