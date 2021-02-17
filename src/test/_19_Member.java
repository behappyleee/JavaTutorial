package test;

public class  _19_Member   { 

					private int memberId;
					private String memberName;
				
					public _19_Member() { }
				
					public _19_Member (int memberId, String memberName){
					this.memberId=memberId;
					this.memberName=memberName;	
					}
				
					public void setMemberId(int memberId){
					this.memberId=memberId;
					}
				
					public int getMemberId(){  //public 오타
					return this.memberId;	
					}
				
					public void setMemberName(String memberName){
					this.memberName=memberName;
					}
				
					public String getMemberName(){
					return this.memberName;
					}
				
					public String toString (){  //toString 띄어쓰기함
					return memberId +"는 이름은 : " + memberName;
					}

}