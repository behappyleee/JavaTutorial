package test;
     
public class _07_MemberMain {
		public static void main (String [ ] args) {
				
				_07_MemberInfo info = new _07_MemberInfo ( );
				
				info.setName(" 홍길동 " );
				info.setJob( " 회사원 " ) ;
				info.setHobby(" 영화감상 ");
				info.setSalary(2000000);
				info.setJuminNo("900000-1111111");
				
				info.printInfo( );
		}
}

//Class : 객체를 만들기 위한 일종의 틀 (멤버변수<속성> +멤버메소드<기능> + 생성자)로 구성
//객체 (Object) : 객체는 클래스(디자인, 설계도)를 통하여 만들어지는 대상 (ex Class : 붕어빵 틀, Object :  붕어빵)
//생성 : Class를 메모리에 올려야 사용가능, 메모리에 올라가지 않으면 그냥 문서로만 존재
//Class를 힙메모리에 올리는 방법은 Main Class 에서 올림
//데이터타입 참조변수 = new 데이터타입 ( ); 참조변수는 스택메모리에 올라가고 클래스는 힙메모리 등재
//앞에 데이터타입은 클래스를 호출하기 위함 뒤 데이터타입은 힙메모리에 올리기 위함
//힙 메모리에 올라감 (힙 메모리에 올라간 순간 인스턴스로 불림)
//참조변수는  일종의 클래스를 호출하기 위한 주소값을 가짐, 클래스  메소드나 필드를 호출원할시(인스턴스만 가능)
//참조변수 이용(ex. 참조변수.해당속성 or 참조변수.해당메소드 로 접근