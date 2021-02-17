package ch06;

//자식 클래스
public class _10_NoteBook extends _10_ElectroProduct {
	
				private String modelName ;
				private double discountRatio;
				//디폴트 매개변수
			
				public _10_NoteBook ( ) {}
			
				 public _10_NoteBook (String bandName, int price, int bonusPoint, double bonusRatio, double  discountRatio, String modelName) {
					 super(bandName, price, bonusPoint, bonusRatio);
					 this.discountRatio=discountRatio;
					 this.modelName= modelName;
				 }
				 
				 //보너스 포인트 누적 = 가격*보너스비율
				 public void calPrice() {
				 double discount = ( discountRatio  * super.getPrice() );					
					System.out.println("할인금액 : " + (super.getPrice() - discount) );
					double bonusPoint = 0;
					bonusPoint += (super.getPrice()  *  super.getBonusRatio() ) ;
					System.out.println( "보너스 포인트 : " + bonusPoint )   ;
				}
						
				public void printInfo() {	
						super.printInfo() ;
						System.out.println("할인비율 : " + discountRatio);
						System.out.println("모델 : " + modelName);
				}
				
				
}
