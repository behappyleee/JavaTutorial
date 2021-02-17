package ch03;

public class _03_Worker {
			//멤버변수 - 속성
			private String sabun;    //private 사용이유는 잘못된 값 대입을 막기 위함
			private String name;
			private int salary;
			private String email;
			//멤버 메소드 - 기능 
			//setter
			
		   public void setSabun(String sabun) {  
				this.sabun=sabun;
			}
			
			public void setName(String name) {
				this.name=name;
			}
			
			public void setSalary(int salary) {
				this.salary=salary;
			}
			
			public void setEmail(String email) {
				this.email=email;
			}
		
			public void printInfo() {
				System.out.println(" 사번 : " + sabun);
				System.out.println(" 이름 : " + name);
				System.out.println(" 급여 : " + salary);
				System.out.println(" 메일 : " + email);
			}
		
			
			
			
			
			
}
