package ch06;
//부모클래스
public class _10_ElectroProduct {
		
			private String bandName;
			private int price;
			private int bonusPoint;   
			private double bonusRatio;     //보너스 비율1프로, 0.01;
			
			public _10_ElectroProduct ( ) {
				bonusRatio = 0.01;
			} //디폴트 생성자
			
			public _10_ElectroProduct (String bandName, int price, int bonusPoint,  double bonusRatio ) { 		//매개변수 생성자
				this.bandName=bandName;
				this.price=price;
				this.bonusPoint=bonusPoint;
				this.bonusRatio=bonusRatio;
			}
				
			public void setBandName(String bandName) {
				this.bandName=bandName;
			}
			
			public String getBandName() {
				return this.bandName;
			}
			
			public void setPrice(int price) {
				this.price=price;
			}
			
			public int getPrice() {
				return this.price;
			}
			
			public void setBonusPoint(int bonusPoint) {
				this.bonusPoint=bonusPoint;
			}
			
			public int  getBonusPoint() {
				return this.bonusPoint;
			}
			
			public void setBonusRatio(double bonusRatio) {
				this.bonusRatio=bonusRatio;
			}
			
			public double getBonusRatio( ) {
				return this.bonusRatio;
			}
			
			public double bonusRatio(int price) {
				this.bonusRatio = this.price * 0.01 ;
				return bonusRatio;
			}
			
			public int calPrice(int price) {
				bonusPoint  +=  price *bonusRatio;
				return price;
			}
			
			public void printInfo() {
				System.out.println("브랜드네임 : " +bandName +  "\n가격 : " + price +"\n보너스포인트 : " + bonusPoint + "\n보너스비율 : " + bonusRatio);
			}
			
}
