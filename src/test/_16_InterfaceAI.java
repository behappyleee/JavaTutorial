package test;

public class _16_InterfaceAI implements _16_Interface {

	public void startCar(){
	System.out.println(_16_Interface.CAR_AI+"가 시동을 켭니다.");
	}

	public void drive(){
	System.out.println(_16_Interface.CAR_AI +"가 운전을 합니다.");
	}

	public void stop(){
	System.out.println(_16_Interface.CAR_AI +"가 멈춥니다.");
	}

	public void turnOff(){
	System.out.println(_16_Interface.CAR_AI +"가 시동을 끕니다."); //클래스명 오타발생
	}

}