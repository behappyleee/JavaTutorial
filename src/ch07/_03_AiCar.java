package ch07;
//자식클래스
public class  _03_AiCar extends _03_Car {
				
			@Override
			public void drive() {
				System.out.println("자율주행을 시작합니다.");
				System.out.println("자동차가 알아서 방향을 전환합니다.");
			}
			
			
			@Override
			public void stop() {
				System.out.println("스스로 멈춥니다.");
			}
	
}
