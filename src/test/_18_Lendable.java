package test;

public interface  _18_Lendable {

			//상수(인터페이스 클래스)
			int STATE_BORROWED  = 1;  //대출상태
			int STATE_NORMAL = 0 ;        //반납상태
		
			//추상메소드(인터페이스)
			public void checkOut( String borrower, String date );  //대출
			public void checkIn();    //반납

}
	
	
	
	
	
	
	
	
	
	
	

