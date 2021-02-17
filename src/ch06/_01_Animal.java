package ch06;
//부모 클래스
public class _01_Animal {
		//멤버변수
		private String kind;
		private String legs;
		
		//디폴트 생성자
		public _01_Animal () {
			System.out.println("디폴트 입니다.");
		}
		// setter,getter
		public void setKind(String kind) {
			this.kind=kind;
		}
		
		public String getKind() {
			return this.kind;
		}
		
		public void setLegs(String legs) {
			this.legs=legs;
		}
		
		public String getLegs() {
			return this.legs;
		}
		
		//멤버 메소드
		public void eat() {
			System.out.println("먹다.");
		}
	
		public void sleep() {
			System.out.println("자다.");
		}
		
		public void play() {
			System.out.println("놀다.");
		}
		
		public void printInfo() {
			System.out.println(" kind : " + kind + "\n legs  : " + legs);
		}
}	
