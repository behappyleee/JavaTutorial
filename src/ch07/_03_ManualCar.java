package ch07;
//부모클래스
public class _03_ManualCar  extends _03_Car {
			
				@Override
				public void drive() {
					System.out.println("사람이 운전합니다.");
					System.out.println("사람이 핸들을 조작합니다.");
				}
			
				@Override
				public void stop() {
					System.out.println("브레이크로 정지합니다.");	
				}
	
}
