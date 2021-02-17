package ch04;

public class _09_Bus {

		int busNumber;
		int passengerCount;
		int money;
	
		public _09_Bus (int busNumber) {
			this.busNumber=busNumber;
		}
		
		public void takemoney(int money) {
			this.money += money;
			passengerCount++;
		}
	
		public void showInfo() {
			System.out.println("버스 : " + busNumber + "번의 승객은" + passengerCount +"명이고"
			+ "수입은 " + money + "입니다."		);
		}
	
	
}
