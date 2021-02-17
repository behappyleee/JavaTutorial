package ch06;
//자식 클래쓰
public class _03_Manager extends _02_Sawon {
			
			private int bonus;
			//디폴트 생성자
			public  _03_Manager() {
				System.out.println("디폴트 입니다.");
			}
			
			public _03_Manager(int bonus) {
				this.bonus=bonus;
			}
			
			// setter & getter
			public void setBonus(int bonus) {
				this.bonus=bonus;
			}
			
			public int getBonus() {
				return this.bonus;
			}
			
			//메소드
			//manager extends _02_Sawon꺼 하여도
			
			@Override
			public void printInfo() {
				super.printInfo( );   //부모클래스+overrider된 부모클래스 
				System.out.println(" 보너스 :  " +  bonus);
			}
}
