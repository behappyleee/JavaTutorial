package test;

//자식 클래스, salary*12+sudang=calSalary
public class _12_Sawon extends _12_Employee{

					private int sudang ;
				
					public _12_Sawon() { }
								
					public _12_Sawon(String sabun, String name, String deptName, int salary, int sudang) {
					super(sabun, name, deptName, salary);
					this.sudang= super.getSalary() * 12 +sudang;
					}
				
					public void setSudang(int sudang){
					this.sudang=sudang;
					}
				
					public int getSudang(){
					return this.sudang;
					}
					
					public void calSalary() {
						System.out.println("연수당 : " + (super.getSalary() *12 + sudang));
					}
		
					@Override
					public void printInfo(){
					super.printInfo();
					System.out.println("수당 : " + this.sudang);
				
					}

}