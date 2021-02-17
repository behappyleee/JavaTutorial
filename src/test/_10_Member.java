package test;

public class _10_Member {

			private String name;
			private int age;
			private String email;
			private String address;
			private int salary;
		
			public _10_Member( ) {
			System.out.println("디폴트 입니다.");
			}
		
			public _10_Member(String name, int age, String email, String address, 
					int salary) {
			this.name=name;
			this.age=age;
			this.email=email;
			this.address=address;
			this.salary=salary;
			}
		
			public void setName(String name){
			this.name=name;
			}
		
			public String getName() {
			return this.name;
			}
		
			public void setAge(int age){
			this.age=age;
			}
		
			public int getAge() {
			return this.age;
			}
			
			public void setEmail(String email){
			this.email=email;
			}
		
			public String getEmail(){
			return this.email;
			}
		
			public void setAddress(String address){
			this.address=address;
			}
		
			public String getAddress(){
			return this.address;
			}
		
			public void setSalary(int salary){
			this.salary=salary;
			}
		
			public int getSalary(){
			return this.salary;
			}
		
			public void printInfo () {
			System.out.print(" 이름  : " +name);
			System.out.print(" 나이  : " +age);
			System.out.print(" 메일  : " +email);
			System.out.print(" 주소  : " + address);
			System.out.print(" 급여  : " +salary);
			}

}