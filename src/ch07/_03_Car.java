package ch07;
//부모 클래스
public abstract class _03_Car {
		
			public abstract void drive( );
			
			public abstract void stop();
			
			
			public void startCar() {
				System.out.println( "시동을 켭니다. ");
			}
	
			
			public void turnOff() {
				System.out.println("시동을 끕니다.");
			}
	
			
			//템플릿메소드 : 자동차가 달리는 방법을 순서대로 구현
			public void run( ) {
				startCar();
				drive();
				stop();
				turnOff();
			}
			
			
}
