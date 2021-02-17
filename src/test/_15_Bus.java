package test;
 
public class _15_Bus {

				private int busNumber;
				private int money;
				private int passengerCount;
			
				public _15_Bus() { }
			
				public _15_Bus(int busNumber){
				this.busNumber=busNumber;  //오타발생
				}
			
				public void setBusNumber(int busNumber){
				this.busNumber=busNumber; //오타발생
				}
			
				public int getBusNumber(){
				return this.busNumber;
				}
			
				public void setPassengerCount(int passengerCount){
				this.passengerCount=passengerCount;
				}
			
				public int getPassengerCount(){
				return this.passengerCount;
				}
			
				public void setMoney(int money){
				this.money = money;
				}
			
				public int getMoney(){
				return this.money;
				}
			
				public void take(int money){
				this.money += money;
				passengerCount++;
				}
			
				public void printInfo() {
				System.out.println("버스번호 : " + busNumber + "\n 승객수 : " + passengerCount + "\n 요금 : " + money);
				}


}