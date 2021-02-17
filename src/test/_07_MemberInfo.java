package test;

public class _07_MemberInfo {

		 	private String juminNo;
			private String name;
			private String job;
			private String  hobby;
			private int salary;
		
			public void setJuminNo(String juminNo){
				this.juminNo=juminNo;
			}
		
			public void setName(String name){
				this.name=name;
			}
		
			public void setJob(String job){
				this.job=job;
			}
		
			public void setHobby(String  hobby){
				this.hobby=hobby;
			}
		
			public void setSalary(int salary){
				this.salary=salary;
			}
		
		
			public void printInfo() {
			System.out.println("주민번호는 : " + juminNo + "이름은 : " + name + 
			" 직업은 : " + job + " 취미는 : " + hobby + " 급여는 : " + salary) ;  //세미콜론안찍음
			
			}

}