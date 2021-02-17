package ch07;

public class _06_Main {

			public static void main(String[ ] args) {
			 
					//부모클래스 _06_PDA의 method 호출하기
					//인터페이스 추상메소드 play(),  stop() 호출, 다형성 적용
					//mp3의 재정의된 추상메소드 호출
					//mobile의 재정의된  추상메소드호출
					
					_06_PDA pda = new _06_SmartPhone();
					int num1 = 10;
					int num2=5;
					System.out.println( pda.calculate(num1, num2) );
					
					_06_SmartPhone abc = new _06_SmartPhone();
					_06_Mp3 mp3 = abc;   //new _06_SmartPhone();     abc ; 와 똑같음 
					mp3.stop();			//오버라이드 된 자식메소드가 호출
					mp3.play();
					
					//자식 메소드에 접근하기 위해 다운캐스팅을 한다.
					_06_SmartPhone phone  = (_06_SmartPhone)mp3;
					phone.play();
					phone.stop();
					phone.sendSMS();
					phone.receiveSMS();
			
					}

}
