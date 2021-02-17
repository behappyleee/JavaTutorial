package ch06;
//부모 클래스
public class _02_Car {
		// 멤버변수
			private String kind;
			private int speed;
	
		// 생성자
			public _02_Car() {
				System.out.println(" 디폴트 입니다. ");
			}
	
		// 멤버 메소드
			
			public void setKind(String kind) {
				this.kind=kind;
			}
			
			public String getKind( ) {
				return this.kind ;
			}
	
			public void setSpeed(int speed) {
				this.speed=speed;
			}
			
			public int getSpeed() {
				return this.speed;
			}
			
			public void printInfo() {
				System.out.println(" 종류 : " + kind + "\n 속도 : " + speed);
			}
}
