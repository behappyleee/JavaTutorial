package test;

public class _16_InterfaceManual implements _16_interface {  //implements 예약어를 적지않음
	
	public void drive(){
	System.out.println(_16_interface.CAR_MANUAL +"가 운전합니다");   // " " 를 기입하지않음
	}

	public void stop(){
	System.out.println(_16_interfaceCar.CAR_MANUAL +"가 멈춥니다");
	}

	public void startCar(){
	System.out.println(interfaceCar.CAR_MANUAL + "가 시동을 켭니다.");
	}

	public void turnOff(){
	System.out.println(interfaceCar.CAR_MANUAL +"가 시동을끕니다.");
	}
	
}