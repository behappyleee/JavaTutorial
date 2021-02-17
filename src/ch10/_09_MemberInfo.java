package ch10;

public class _09_MemberInfo  {
	//멤버변수
	String name;
	int age;
	
	//디폴트 생성자
	public _09_MemberInfo() { }
	
	//매개변수 생성자
	public _09_MemberInfo(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge (int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void showInfo() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	
}
