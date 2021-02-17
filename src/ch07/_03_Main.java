package ch07;

public  class _03_Main {

		public static void main(String[ ] args) {
				/*
				 *	템플릿 메소드
				 *	- 메소드실행순의 시나리오를 정의하는것 
				 * 	- 로직흐름이 이미 정해져있는 프레임워크에서 많이 사용하는 구현 방법
				 * 	- final 선언이유는 모든 하위클래스가 공통으로 사용하고, 코드를 변경하면 안되기때문에 final로 선언함
				 * 	  final 메소드명 : 상속받은 하위클래스가 부모 메소드를 재정의 할 수 없음 (305page)
				 *
				 */
				System.out.println("=== 자율주행하는 자동차 ===");
				_03_Car myCar = new _03_AiCar ( );
				myCar.run();
				
		
				System.out.println("=== 사람이 운전하는  자동차 ===");
				_03_Car myCar1= new _03_ManualCar ( );  //다형성 적용이라 자식메소드 수행
				myCar1.run();
		
				}
		

}
