package ch06;

public class _02_CarMain {
		public static void main(String[] args) {
	
				_02_FireCar car  = new _02_FireCar (); //FireCar 객체생성
				
				car.setKind(" 소방차 ");
				car.setSpeed(3000);
				car.printInfo();
				car.water();
				System.out.println(car);
				System.out.println("===========================");
				
				_02_PoliceCar police = new _02_PoliceCar(); //Police Car 객체생성 police car는 firecar를 상속하였으므로 그 부모인 Car도 상속받게됨
				police.siren();
				police.setKind(" 소방차 ");
				police.setSpeed(2000);
				police.printInfo();
				police.water();
				System.out.println(police); //toString을 정의할 시 주소값이 아니라 객체에대한 정보 출력
				
			}
}
