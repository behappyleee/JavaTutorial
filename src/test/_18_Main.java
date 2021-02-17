package test;

public class _18_Main {
	public static void main (String [ ] args){
 
		
	//String registerNo, String title, String checkOutdate
			_18_APPCDInfo info = new _18_APPCDInfo("R1", "백야", "2020-11-27", " 김철수");
			
		
			info.checkOut(" 홍길동", "2020-11-28");
			info.checkOut(" 홍길동", "2020-11-28");
			info.checkIn();
			info.checkIn();

	}

}