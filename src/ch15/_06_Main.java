package ch15;

public class _06_Main {
	public static void main(String[] args) {
		/*
		 * 1) 한 계좌의 금액을 다른 계좌로 이체
		 * 2) 공유영역(김태희 계좌 (2,000,000)) + 비계좌(1,000,000))
		 * 3) 두 계좌의 잔액 합계를 출력하는 일을 동시에 한다.
		 * 
		 * 
		 */
	    //Account매개변수 생성자의 값 전달 Thread 를 생성 하라 
		_06_SharedArea sa = new _06_SharedArea();
		sa.account1=new _06_Account("010-111" , "김태희" , 1000000);
		sa.account2=new _06_Account("010-111" , "김태희" , 2000000);
		//_06_Account account1 = new _06_Account("010-111" , "김태희" , 2000000);
		//_06_Account account2 = new new _06_Account("010-111" , "김태희" , 2000000);
		
		//Thread 생성시 매개변수로 sharedArea 참조변수를 매개변수로 주기
		_06_TransferThread   t1  = new _06_TransferThread(sa);  //계좌이체5회
		_06_PrintTotalThread t2  = new _06_PrintTotalThread(sa);	//토탈 3회출력
		
		//2개 스레드 생성
		t1.start();
		t2.start();
		
		
		
	}

}
/*
 * 김태희 계좌 : 1000원 인출
 * 
 * 비계좌 : 1000원 입금 
 * 
 * 5번 입출금 출력
 * 
 * 
 * 계좌 잔액 합계 : 출력
 * 계좌이제 5회
 * 잔앱합계 3회 출력
 */




