package ch06;
//부모 클래스
public class _02_Employee {
				//private String sabun; ==> private을 해제해야지 자식클래스에서 접근가능
				protected String sabun;
				private String name;
				private String deptName;
				private int salary;
				
				//생성자
				
				public _02_Employee() {
					System.out.println(" 디폴트 입니다.");
				}
				
				public _02_Employee(String sabun, String name, String deptName, int salary) {
					this.sabun=sabun;
					this.name=name;
					this.deptName=deptName;
					this.salary=salary;
				}
				
				public void setSabun(String sabun) {
					this.sabun=sabun;
				}
				
				public String getSabun() {
					return this.sabun;
				}
				
				public void setName(String name) {
					this.name=name;
				}
				
				public String getName() {
					return this.deptName;
				}
				
				public void setDeptName(String deptName) {
					this.deptName=deptName;
				}
				
				public String getDeptName() {
					return this.deptName;
				}
				
				public void setSalary(int salary) {
					this.salary=salary;
				}
				
				public int  getSalary() {
					return this.salary;
				}
				
				public void printInfo() {
					System.out.println(" 사번 : " + sabun +"\n 이름 : " + name + "\n 부서 : " + deptName + "\n 급여 : " + salary);
				}
				
}
