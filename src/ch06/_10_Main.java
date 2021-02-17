package ch06;


public class _10_Main {
				
		public static void main(String [  ] args) {
					
		//구매자가 노트북 구입,  보너스 0.01
		//다형성  적용 노트북을 구매 
		//String bandName, int price, int bonusPoint, double bonusRatio, double  discountRatio
		
		_10_ElectroProduct elec = new _10_NoteBook("삼성",3000000, 0 , 0.01, 0.02 , "메탈");
		elec.printInfo();
		elec.calPrice( elec.getPrice() ) ;
		_10_NoteBook notebook =(_10_NoteBook)elec;
		notebook.calPrice();
		
		//String bandName, int price, int bonusPoint, double bonusRatio, double  discountRatio
		_10_ElectroProduct elec1 = new _10_Buyer("LG", 3500000 , 0 , 0.02);
		elec1.printInfo();
		_10_Buyer buyer = (_10_Buyer)elec1;
		buyer.buy( elec1 );
		buyer.buy(elec);
		
		_10_ElectroProduct elec2 = new _10_Tv("금성", 2800000, 0, 0.02);
		buyer.buy(elec2);
		}
					
}			
				// public static void showInfo(_10_ElectroProduct elec ) {
				// elec.printInfo();
				// if(elec instanceof _10_NoteBook) {
				//	_10_NoteBook notebook =(_10_NoteBook)elec;
				//notebook.bonusRatio(  elec.getPrice() );
				//} else if ( elec instanceof _10_Buyer) {
				//	 _10_Buyer buyer =(_10_Buyer)elec;
				//}
 

	

