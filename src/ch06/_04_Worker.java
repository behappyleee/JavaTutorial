package ch06;
//부모 클래쓰
public class _04_Worker {
	
		private String sabun;
		private String name;
		private String deptName;
		private int salary;
		
		public _04_Worker( ) {
			System.out.println(" 부모 기본 생성자 ");
		}
		
		public  _04_Worker (String sabun, String name, String deptName, int salary) {
			System.out.println(" 부모 매개변수 생성자 ");
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
		
		public  void setName(String name) {
			this.name=name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setDeptNmae(String deptName) {
			this.deptName=deptName;
		}
		
		public String getDeptName() {
			return this.deptName;
		}

		public void setSalary(int salary) {
			this.salary=salary;
		}

		public int getSalary() {
			return this.salary;
		}
		
		public void printInfo() {
			System.out.println(" 사번 : " + sabun + "\n 이름 : " + name + "\n 부서 : " + deptName + "\n 급여 :  " + salary);
		}
		
}
