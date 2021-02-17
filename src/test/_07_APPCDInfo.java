package test;
//자식클래스 
public class _07_APPCDInfo extends _07_CDInfo implements _07_Lendable{

	private String borrower;
	private String checkOutDate;
	private String date;
	private int checkOutDateState;
	
	public _07_APPCDInfo() {}
	
	public _07_APPCDInfo(String registerNo, String title, String borrower, String checkOutDate) {
		super(registerNo, title);
		this.borrower=borrower;
		this.checkOutDate=checkOutDate;
		checkOutDateState=_07_Lendable.STATE_NORMAL;
		}
	
	//대출하다
	@Override
	public void checkOut(String borrower, String date) {
		System.out.println("대출자 : " + borrower);   //반납상태 >대출가능한 상태임 
		if(checkOutDateState == _07_Lendable.STATE_NORMAL) {   //대출시 if
			checkOutDateState = _07_Lendable.STATE_BORROWED;   //대출가능한상태에서 대출한 생태로 바뀜 대출불가로 바뀜
			this.checkOutDate=date; //대출일로 됨 
			System.out.println("책이름 : " +super.getTitle());
			System.out.println("대출자 : " + borrower);
			System.out.println("대출일 : " + date);
		} else {  //대출 한 후면 이 else 코드를 탐 (동일한 책 대출시)
			System.out.println("대출상태 : 대출중");
			System.out.println("대출 시 : 대출할 수 없습니다.");
			//System.out.println("대출 가능 합니다.");
			//return _07_Lendable.STATE_NORMAL; //0
		}
		System.out.println("==================================");
		}

	/*
	 * 	public void checkOut(String borrower, String date){
	 * if(checkOutDate == _07_Lendable.STATE_NORMAL) {
	 * 	checkOutDate =_07_Lendable.STATE_NORMAL;
	 * } else {
	 * 	System.out.println("대출상태 : " + 대출불가);
	 * 	
	 * 
	 * 
	 */
	
	//반납하다
	public void checkIn() {
		
		if(checkOutDateState == _07_Lendable.STATE_NORMAL) {
			System.out.println("반납시 : 반납할 수 없습니다");
		} else {
			checkOutDateState = _07_Lendable.STATE_NORMAL; 
			System.out.println(super.getTitle()+"이 반납 되었습니다.");
			System.out.println("반납자 : " + borrower);
		}
		
	}
	
	/*
	 * public void checkIn(){
	 * if(checkOutDate == _07_Lendable.STATE_NORMAL){
	 * System.out.println("반납할 수 없습니다.");
	 * } else {
	 * checkOutDate=_07_Lendable.STATE_NORMAL;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}	
	
	//printInfo
	/*public void printInfo() {
		System.out.println("대출상태 : "+ );
		System.out.println("대출 시 : "+  );
		System.out.println("책이름 : "+ super.getTitle());
		System.out.println("대출일 : " + checkOutDate);
	}
		*/
	
	

