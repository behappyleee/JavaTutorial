package ch07;
//시험 
public class _07_Main {

	public static void main(String[] args) {
		
		//checkOutDate = 대출날짜 
		//String registerNo, String title, String borrower, String checkOutDate
		_07_APPCDInfo app = new _07_APPCDInfo("SOO1", "데미안", "홍길동", "  ");
		
		//String borrower, String date
		app.checkOut(" ", "2020-08-24");
		app.checkOut("김철수", "2020-11-24");
		app.checkIn();
		
		}

}

// 자식의 매개변수 생성자로 값 호출
/*
 * 대출상태 : 대출중
 * 대출시 : 이미 대출 중입니다.
 * 책 이름 :
 * 대출 상태 :
 * 대출일 ~~~~~
 * 대출일 ~~~~~
 * =======================
 * ~이 반납되었습니다.
 * 반납시 : 반납할 수 없습니다.
 * 대출상태 : 대출가능
 * =====================
 * 
 * 
 * 
 */




