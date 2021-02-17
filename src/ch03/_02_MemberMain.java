package ch03;

public class _02_MemberMain {   // static : 인스턴스 생성하지않고 바로 메소드 사용가능		
		public static void main (String [ ]  args) {     // static은 객체생성않고 사용
			// 힙메모리에 올라가야 변수 선언 가능	// static은 바로 메모리에 올라감(그래서 바로 사용가능)
			// main( ) 함수는 JVM 이 프로그램 시작하기 위해 호출하는 함수
			// 클래스 내부에 만들지만, 클래스의 멤버메소드가 아니다
			_02_MemberInfo info = new _02_MemberInfo ( );
			//멤버변수1
			//info.birthDay = " 93.06.09 ";   ==>private사용하지 않을때 사용
			info.setBirthDay("93.06.09") ; //setBirthday 호출
			//info.name = " 이철한 ";			
			info.setName("이철한");     // 호출시에는 반드시 변수명, 자료타입 일치
			//info.age = 28; 
			info.setAge(28);
			//info.address = "서울 강서구";
			info.setAddress("서울 강서구");
			//메소드는 가로까지 작성해야함 
			
			info.showInfo ( );
		
		}
}
