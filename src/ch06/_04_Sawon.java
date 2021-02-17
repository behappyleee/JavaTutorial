package ch06;
//자식 클래스
public class _04_Sawon extends _04_Worker {

			private int bonus;
			
			public _04_Sawon() {
				System.out.println(" 자식 디폴트 생성자 ");
			}
		
			public _04_Sawon(String sabun, String name, String deptName, int salary, int bonus) {
				super(sabun, name, deptName, salary);
				System.out.println(" 자식 매개변수 생성자");
				this.bonus=bonus;
			}
			
			public void setBonus(int bonus) {
				this.bonus=bonus;
			}
			
			public int getBonus() {
				return this.bonus;
			}
			
			public void printInfo() {
				super.printInfo();
				System.out.println(" 보너스 : " + bonus);
			}
			
			
}
