package ch03;
							
public class _03_Workermain {
		public static void main (String [ ]  args) { 
				
			_03_Worker  info = new _03_Worker (); // instance 생성
			
			// 클래스 속성 호출
			info.setSabun("S001");
			info.setName("홍길동");
			info.setSalary(2000000);
			info.setEmail("aaaa@naver.com");
			
			//클래스 메소드 호출
			info.printInfo ( );
			
			
		}
}
