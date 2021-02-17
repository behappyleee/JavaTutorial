package ch06;
//자식 클래스
public class _04_Manager extends _04_Employee {
				
				private int bonus ;
				
				public _04_Manager() {
					System.out.println("Manager 자식 디폴트 생성자");
				}
                 //	2.	매개변수 생성자 ==> (자식쪽에서) 부모 매개변수 생성자로 전달 (매개변수 한번의 전달)
				public _04_Manager(String sabun, String name, String deptName, int salary,  int bonus ) {
					super (sabun, name, deptName, salary);  //==>자료타입은 작성하면 안됨
					System.out.println(" Manager 자식 매개변수 생성자 ");
					//super (sabun, name, deptName, salary);  ====> 부모매개변수는 반드시 첫 줄에 위치 아니면 에러 발생
					this.bonus=bonus ;
				}
				
				public void setBonus(int bonus) {
					this.bonus=bonus ;
				}
				
				public int getBonuse() {
					return this.bonus ;
				}
				
				@Override
				public void printInfo() {
					super.printInfo();
					System.out.println(" 보너스  : " + bonus);
				}
				
}				
				
				
				
