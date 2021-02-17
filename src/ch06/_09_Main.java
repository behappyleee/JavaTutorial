package  ch06;

public class _09_Main {
		public static void main (String [  ]    args) {
			
			_09_Car car = new _09_Car ( );   
			car.start();
			car.stop();
												   //부모타입 참조변수 = new 자식타입 ( );
			_09_Car car1 = new _09_FireCar ( );    //다형성 - 부모메소드 사용가능 override된거 있으면 override 실행 
			car1.start();						   //부모메소드에만 있는거 사용가능 		
			car1.stop();
			
			_09_FireCar firecar = (_09_FireCar)car1;   //다운캐스팅(형변환) - 부모메소드에는 없고 자식메소드에만 있는 메소드에 접근 위하여
			firecar.water();
			
			
			_09_Car car2 = new _09_PoliceCar ();
			car2.start();          //부모메소드 start/ stop 호출이 아닌 override start/stop 메소드 호출
			car2.stop();
			
			_09_PoliceCar policecar = (_09_PoliceCar)car2;
			policecar.siren();
			policecar.start ();
			policecar.stop ();
		
			
			}
	
}
