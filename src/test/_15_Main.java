package test;

public class _15_Main {    //클래스명 잘못작성

	public static void main (String [ ] args){
				//takebus, take subway
				_15_Student tomas  = new _15_Student("홍길동", 30000);
				 _15_Subway green = new  _15_Subway (2);  //bus, subway 객체생성 하지않음 
				 _15_Bus bus100 = new _15_Bus(100);
				tomas.takeSubway(green);
				tomas.takeBus(bus100); //메소드명 잘못입력, 매개변수 미입력, 매개변수 잘못입력
				tomas.printInfo();	
				
				_15_Student james = new _15_Student("김철수", 20000);
			
				james.takeSubway(green); //메소드명 잘못입력 () 빼먹음, 매개변수 미입력 
				james.takeBus(bus100);
				james.printInfo();
			
				bus100.printInfo();
				green.printInfo();
				
	
				}

	
}