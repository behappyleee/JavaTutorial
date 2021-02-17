package test;

public class _09_MemberInfo {
			
			private String juminNo;  //juminNo 오타
			private String name;
			private int age;
			private int salary;
			
			public _09_MemberInfo () {                   //return이 없는데 void 뺴먹음
			System.out.println(" 디폴트 입니다.");
			}
		
			public _09_MemberInfo( String juminNo, String name, int age, int salary){
			System.out.println("매개변수 생성자 입니다.");   //return이 없는데 void 뺴먹음
			this.juminNo=juminNo;
			this.name=name;
			this.age=age;
			this.salary=salary;
			}
		
			public void setJuminNo(String juminNo){
				this.juminNo=juminNo;
			}
		
			public String getJuminNo(){
				return this.juminNo;
			}
			
			public void setName(String name){
				this.name=name;
			}	
			
			public String getName() {
				return this.name;
			}
		
			public void setAge(int age){
				if( age <0 ) {
				System.out.println("나이는 0보다 커야합니다.");
				return; //return이 없으면 다음행을 타버림(this.age=age; 수행되버림)
				}			//return이 있으면 this.age=age; 문장수행안됨(만약 음수면)
				this.age=age;
			}
			
			public int getAge(){
				return this.age;
			}
		
			public void setSalary(int salary){
				if( salary < 0 ) {
				System.out.println( " 급여는 0보다 커야합니다. ");
				} else {
				this.salary=salary;
				}
			}
			
			public int getSalary(){		
				return this.salary; //세미콜론 안찍음
			}
		
			public void printInfo(){
			System.out.println(" 주민 번호 : " + juminNo + "\n 이름 : " + name + "\n 나이 : " + age + "\n 급여 : " + salary);
			}
}