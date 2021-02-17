package ch04;

public class _03_MemberMain {
		public static void main (String [] args) {
		//멤버변수 :  private String ;  Name;
			_03_MemberInfo member = new _03_MemberInfo ( ); //인스턴스 생성
																													
			member.setEmail("xxx@naver.com");
			member.setAge(30);
			member.setName("홍길동");
			
			member.printInfo( );
		}
}
