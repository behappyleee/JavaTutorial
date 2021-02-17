package test;

public class _18_APPCDInfo extends _18_CDInfo implements _18_Lendable {

				private String borrower;
				private String checkOutDate;
				private String date;
				private int state;
			
				//상수(인터페이스 클래스)
				//int STATE_BORROWED = 1;  //대출상태
				//int STATE_NORMAL= 0;        //반납상태
			
				public _18_APPCDInfo () { }
			
				public _18_APPCDInfo (String registerNo, String title, String checkOutDate, String borrower) {
					super(registerNo, title); //부모 생성자에 매개변수 등록안되어있을시 에러발생함 
					this.checkOutDate = checkOutDate;
					this.borrower=borrower;
					this.state = _18_Lendable.STATE_NORMAL; // 반납상태(초기상태로 만듦) -normal로 만듦
					System.out.println(" 등록번호 : "+ registerNo + "\n 제목 : " + title+ "\n 대출일 :  "+ checkOutDate+"\n 대출자" + borrower );
				}
			
				public void checkOut(String borrower, String date){
				
				if(state == _18_Lendable.STATE_NORMAL){
					this.checkOutDate=date;
					this.borrower=borrower;
					state=_18_Lendable.STATE_BORROWED;
					System.out.println(super.getTitle() + "대출 되었습니다");
					System.out.println("대출자 : " + this.borrower);
					} else {
					System.out.println("현재 대출중 입니다.");	
					}
				}
			
				public void checkIn(){
			
					if( state ==_18_Lendable.STATE_BORROWED) {  //if문에 =연산기호 하나만 씀 두개써야함 ==
	 					System.out.println(super.getTitle() +" 반납 되었습니다.");		
						state=_18_Lendable.STATE_NORMAL;
						} else {
						System.out.println("반납 되어있습니다.");
						}	
					System.out.println("===========================");
					}
			
				public void setBorrower(String borrower){
				this.borrower=borrower;
				}
			
				public String getBorrower(){
				return  this.borrower;
				}
			
				public void setCheckOutDate(String checkOutDate){
				this.checkOutDate=checkOutDate;
				}
			
				public String getCheckOutDate(){
				return this.checkOutDate;
				}
			
				public void setDate(String date){
				this.date=date;
				}
			
				public String getDate(){
				return this.date;
				}
			
				public void setState(int state){
				this.state=state;
				}
			
				public int getState(){
				return this.state;
				}
			
				public void printInfo(){
				System.out.println(                    );
			
				}
			
}



