package ch15;
// 클래스 상속받아서 스레드 - 계좌이체 
public class _06_TransferThread extends Thread {
	
	_06_SharedArea sharedArea;
	//디폴트 생성자
	
	_06_TransferThread ( ){ }
	
	//매개변수 생성자 
	public _06_TransferThread(_06_SharedArea sharedArea) {
		this.sharedArea=sharedArea;
	}
	
	
	//추상메소드 재정의 계좌이체 5번 이체금액 1000
	// ==> 계좌이체 호출
	@Override  
	public void run() {
		//계좌이체 5번,이체금액 1000
		for(int cnt=0; cnt<5; cnt ++) {
			sharedArea.transfer(1000);
		}
		
	}
	
	
		
	
}
