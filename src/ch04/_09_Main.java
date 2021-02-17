package ch04;

public class _09_Main {
//멤버변수는 private이 보통, 출력은 메소드이용이 보통
			public static void main(String[ ] args) {
		
		_09_Student tomas = new _09_Student ("홍길동", 30000);
		
		_09_Student james = new _09_Student ("김철수", 20000);
		
		_09_Bus bus100 = new _09_Bus(200);
		tomas.takeBus(bus100);
		tomas.showInfo();
		bus100.showInfo();
		
		_09_Subway subway = new _09_Subway ("2호선");
		james.takeSubway(subway);
		tomas.takeSubway(subway);
		james.showInfo();
		
				
			}

}
