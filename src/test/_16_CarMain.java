package test;

//main 에서 다형성이용하여 ai and manual 호출
public class _16_CarMain {
	public static void main (String [] args) {


	_16_Car aicar = new AICar();

	aicar.run();

	_16_Car manualcar = new ManualCar();
	
	manualcar.run();

	}

}