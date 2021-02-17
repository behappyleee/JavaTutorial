package test;
//상수 이용하여 출력, 메소드 4개출력, 다형성 적용
public interface _16_Interface {

	String CAR_AI = "AICar";
	String CAR_MANUAL = "ManualCar";

	public void drive();
	public void stop();
	public void startCar();
	public void turnOff();

    public default void run() {  //run이 오류발생  ==>default 적지않음 
	startCar();
	drive();
	stop();
	turnOff();	
	}

}