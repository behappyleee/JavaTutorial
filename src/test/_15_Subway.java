package test;

public class _15_Subway {

			private int subwayLine;
			private int passengerCount;
			private int money;
		
			public _15_Subway () {}
		
			public _15_Subway(int subwayLine){
			this.subwayLine=subwayLine;
			}
		
			public void setSubwayLine(int subwayLine){
			this.subwayLine=subwayLine;
			}
		
			public int getSubwayLine(){
			return this.subwayLine;
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
		
			
			public void printInfo(){
			System.out.println("호선 : " + subwayLine + "\n지하철 현재승객 수 : " +passengerCount + "\n 지하철수익 : " + money);
			}

}