package test;
														
public class _09_MemberMain {
		
		public static void main (String [ ]  args) {  //static을 빼먹음
																					
				_09_MemberInfo c1 = new _09_MemberInfo();
				
				c1.setJuminNo("999999-9999999") ;   //set을 빼먹음
				c1.setName("홍길동");
				c1.setAge(30);
				c1.setSalary(3000000);
				
				c1.printInfo();
				System.out.println(c1);
				System.out.println(" ============= " );
			
				_09_MemberInfo c2 = new _09_MemberInfo ("888888-8888888", "Hong", 30 , 2500000);
				
				System.out.println( c2.getJuminNo() );			//앞에 참조변수를 까먹음
				System.out.println( c2.getName() ) ;
				System.out.println( c2.getAge() ) ;
				System.out.println( c2.getSalary() ) ;
			
				}
}