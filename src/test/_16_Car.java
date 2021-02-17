package test;

public abstract class _16_Car{

	public abstract void drive(); 
	
	public abstract void stop();

	
	public void startCar(){    //일반 클래스에 abstract를 실수로 적어놓음 
	System.out.println("시동을 켭니다.");
	}

	public void turnOff(){
	System.out.println("시동을 끕니다.");
	}

	final public void run( ) { //abstract적어서 오류발생 
	startCar();
	drive();
	stop();
	turnOff();
	}
	
}

