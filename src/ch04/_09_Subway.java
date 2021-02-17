package ch04;

public class _09_Subway {

					String lineNumber;
					int passengerCount;
					int money;
					
					public _09_Subway (String lineNumber) {
						this.lineNumber = lineNumber;
					}
					
					public void takemoney (int money) {
						this.money += money;
							passengerCount ++;
					}
					
					public void showInfo() {
						System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 "
					          + money  +"입니다.");
					}
	
}
