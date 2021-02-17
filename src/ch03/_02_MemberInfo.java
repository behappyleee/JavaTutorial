package ch03;

public class _02_MemberInfo {
			// 클래스 = 멤버변수 + 멤버메소드+생성자
			//멤버변수3 : setter로 전달받은 값을 멤버변수에 저장
			private String birthDay ;    //private 붙이는건 캡슐화라고 함 
			private String name;				
			private int age;
			private String address;  
			
			//private은 메소드를 통해 값을 전달 (setter, getter)
			// setter(값을 설정하는 메소드), getter(값을 가지고오는 메소드)
			// 중괄호의 의미는 동작을 구현	
			//setter	
			//멤버변수 2 :매개변수값을 멤버변수로 전달
			public void setBirthDay (String birthDay) {       //birthDay는 매개변수라 함(매개체  역할을 함), String birthDay는 로컬 변수
				this.birthDay	=  birthDay ; //멤버변수=매개변수;	      //	String birthday는 
				//this의 의미는 현재 내 자신, 힙메모리에 생성된 부분
			}  														
			
			public void setName(String name) {
				this.name = name ;
			}
			
			public void setAge(int age) {
				this.age = age ;
			}
			
			public void setAddress(String address) {
				this.address = address;
			}
			
			//멤버메서드 4 : 멤버변수의 값을 출력
			public  void showInfo ( ) {
			System.out.println(" Brthday : " + birthDay );   //this 가 생략되어있음
			System.out.println(" Name : " + name );
			System.out.println(" Age : " + age );
			System.out.println(" Address : " + address );
		}
			
}
