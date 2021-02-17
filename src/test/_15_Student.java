package test;

public class _15_Student {

			private String name;
			private int money;
		
			public _15_Student () {}
		
			public _15_Student (String name, int money){
			this.name=name;
			this.money=money;
			}
			
			public void setName(String name){
			this.name=name;
			}
		
			public String getName(){
			return this.name;
			}
		
			public void setMoney(int money){
			this.money=money;
			}
		
			public int getMoney(){
			return this.money;
			}
			
			public void takeBus(_15_Bus bus){
			bus.take(1000);
			this.money -= 1000;
			}
		
			public void takeSubway(_15_Subway subway){
			subway.take(1500);
			this.money -= 1500;
			}
		
		
			public void printInfo(){
			System.out.println("이름 : " + name +"\n 잔액 : " + money);
			}

}