package ch06;
//부모 클래쓰
public class _04_Employee {
		// 멤버변수
		// 4. 매개변수 > 멤버변수에  저장
		private String sabun;
		private String name;
		private String deptName;
		private int salary;
		// 디폴트 생성자 - 매개변수 생성자가  존재 하므로 컴파일러가 디폴트생성자를 만들어 주지 않음
		// 디폴트 생성자가 없을시 자식클래스에서 super ( ) 호출 시 에러 발생
		public _04_Employee() {
			System.out.println(" Employee 부모 디폴트 생성자. ");
		}
		
		//3.매개변수 > 멤버변수
		public _04_Employee(String sabun, String name, String deptName, int salary) {
			System.out.println(" Employee 부모 매개변수 생성자 ");
			this.sabun=sabun;
			this.name=name;
			this.deptName=deptName;
			this.salary=salary;
		}
		
		public void setSabun(String sabun) {
			this.sabun=sabun;
		}

		public String getSabun () {
				return this.sabun;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String  getName() {
			return this.name;
		}
		
		public void setDeptName(String deptName) {
			this.deptName=deptName;
		}
		
		public String getDeptName() {
			return this.deptName ;
		}
		
		public void setSalary(int salary) {
			this.salary=salary;
		}
		
		public int getSalary() {
			return this.salary;
		} 
		
		public void printInfo ( ) {
			System.out.println(" 사번 : " + sabun + "\n 이름 : " + name + "\n 부서 : " + deptName + "\n 급여 : " + salary);
		}
					
}
	