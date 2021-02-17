package test;

//부모 클래스
public class _12_Employee {

					private String sabun;
					private String name;
					private String deptName;
					private int salary;
				
					public _12_Employee ( ){ }
				
					public _12_Employee(String sabun, String name, String deptName, int salary){
					this.sabun = sabun;
					this.name= name;
					this.deptName=deptName;
					this.salary=salary;
					}
				
					public void setSabun(String sabun){
					this.sabun=sabun;
					}
				
					public String getSabun(){
					return this.sabun;
					}
				
					public void setName(String name){
					this.name=name;
					}
				
					public String getName() {
					return this.name;
					}
				
					public void setDeptName(String  deptName){
					this.deptName=deptName;
					}
				
					public String getDeptName() {
					return this.deptName;
					}
				
					public void setSalary(int salary){
					this.salary=salary;
					}
				
					public int getSalary(){
					return this.salary;
					}
				
					public void printInfo(){
					System.out.println("사번 : " + sabun + "\n이름 : " + name + "\n부서 : " + deptName + "\n급여 : " + salary);
					}
	
}