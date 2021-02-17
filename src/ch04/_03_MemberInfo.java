package ch04;

public class _03_MemberInfo {
		 	//멤버변수 :  private String ;  Name, email;
			
	 		private String name;
			private int age;
			private String email;
			
			//생성자(default) >> 생략가능
			public _03_MemberInfo () {
					System.out.println("디폴트 생성자");
			}
			
			//멤버 메소드
			public void setName(String name) {
				this.name=name;
			}
			//setter에 의해 초기화
			public void setAge(int age) {
				if(age < 0 ) {
					System.out.println("나이는 양수이어야 합니다.");
				} else {            //else 작성안하고 return 적어도됨 return 의미는 함수종료임
					this.age=age;   // return 의미는 함수종료이며, 아래문장을 수행하지 않는다.
				}
			}
			
			public void setEmail(String email) {
				this.email=email;
			}
			//출력
			public void printInfo() {
				System.out.println("이름 : " + name  + "\n나이 : " + age + "\n메일 : " + email);
			}
}



