package test;

//자식 클래스, bonus : salary의 20%
public class _12_Manager extends _12_Employee {

					private int bonus ;
					
					public _12_Manager ( ){ }
				
					public _12_Manager (String sabun, String name, String deptName, int salary, int   bonus) {
					super ( sabun, name, deptName, salary);
					this.bonus= super.getSalary() *bonus + bonus ;
					}
				
					public void setBonus(int bonus){
					this.bonus=bonus;
					}
					
					public int getBonus(){
					return this.bonus;
					}
					
					public void calBonus() {
						 System.out.println(" 보너스 : " + ( super.getSalary( ) + bonus) );
					}
				
					public void printInfo() {
					super.printInfo();
					System.out.println("보너스 : " + bonus);
					}
					
}