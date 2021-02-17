package ch15;
// 스레드 - 잔액합계 상속받아 사용 잔액합계 스레드
public class _06_PrintTotalThread extends Thread{
	
	_06_SharedArea sharedArea;
	//디폴트 생성자
	public _06_PrintTotalThread () {}
	
	//매개변수 생성자
	public _06_PrintTotalThread(_06_SharedArea sharedArea) {
		this.sharedArea=sharedArea;
	}

	//추상메소드 재정의 계좌이체 5번 이체금액 1000
	// ==> 계좌이체 호출
	
	@Override  //==> 잔액합계 구하여 출력
	public void run() {
		for(int cnt=0; cnt<3; cnt ++) {
			//잔액 합계구해서 출력
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액합계: "+ sum);
			//너무 빠르기때문에 sleep 이용
			try {  //1000밀리언이면 1초
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			System.out.println( e.getMessage() );
			}
		}
		
	}
	
}
