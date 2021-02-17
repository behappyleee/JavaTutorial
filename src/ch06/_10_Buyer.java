package ch06;

//자식 클래스
public class _10_Buyer extends _10_ElectroProduct {
				int myMoney = 5000000 ; // 소지금액
				int bonusPoint=0;
				// int  bonusPoint = 0;
				/*
				 *  보너스 포인트 계산, 잔액 계산
				 *  단, 잔액 부족시 잔금부족 출력
				 * buy (노트북) {
				 */
				//String bandName, int price, int bonusPoint, double bonusRatio, double  discountRatio
				
				public _10_Buyer () { }
				
				public _10_Buyer(String bandName, int price, int bonusPoint, double bonusRatio) {
					super(bandName, price, bonusPoint, bonusRatio);
				}
				
				//매개변수의 다형성 적용, 
				public void buy(_10_ElectroProduct product ) {  //부모 하나로 받으면 계속 바꿔가며 생성가능
					this.myMoney=myMoney;
					this.bonusPoint = bonusPoint ;
					
					if( myMoney > product.getPrice() ) {
						System.out.println("구매 가능합니다.");
					} else {
						System.out.println("잔액 부족입니다.");
					} 
						myMoney -= product.getPrice();
					     System.out.println("잔액 : " +myMoney);
					     bonusPoint += (product.getPrice() * product.getBonusRatio() ) ;
					     bonusPoint += super.getBonusPoint() ;
					     System.out.println("보너스 포인트 : " + bonusPoint);
				}
				public void printInfo() {
					super.printInfo();
				}
				
}
	
	
	

