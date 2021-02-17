package test;
// 다중상속 ,자식클래스 ==>상속과 구현 동시
// 같은 클래스끼리는 extends 인터페이스는 implements 예약어 이용
public class  _06_SmartPhone extends  _06_PDA  implements _06_Mp3, _06_Mobile  {
	
			//mp3
			public void play() {
				System.out.println("음악을 연주하다.");
			}
			
			public void stop() {
				System.out.println("음악을 멈추다.");
			}
			
			//mobile
			public void sendSMS() {
				System.out.println("문자를 보낸다.");
			}
			
			public void receiveSMS() {
				System.out.println("문자를 받다.");
			}
			
			
					
}
