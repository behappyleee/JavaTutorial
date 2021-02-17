package ch06;
//자식 클래스
public class _02_Sawon extends _02_Employee {

				private int Sudang;
				
				public void setSudang(int Sudang) {
					this.Sudang=Sudang;
				}
				
				public int getSudang( ) {
					return this.Sudang;
				}
				//부모 메소드명과 자식 메소드명이 똑같으므로 재정의(부모의 메소드를  재정의)메소드명 똑같고 재정의 안할시 자식 메소드 실행
				@Override //( @Override안붙인다고 에러발생나지는않음 )
				public void printInfo( ) {
					/*		super - 부모의 참조변수
					 * 		super  :  하위클래스에서 상위클래스로 접근할 때 사용
					 * 		하위클래스는 상위클래스의 주소,  즉 참조값을 알고 있다.
					 *		상위클래스의 생성자를 호출할때도 사용
					 *		ex) super( );  
					 *		
					 *		this : 자기 자신의 주소값
					 * 		
					 */
					// 출력방법 1 : super 이용    super.printInfo ( ) ;  //부모 클래스의 printInfo(); 앞에 super.메소드명 (부모메소드), super 생략시 자식 메소드 호출
					// 출력방법2- 부모 멤버변수이용
					// 부모의 private된 변수를 고침 (==> protected)
					// System.out.println(" 사번 : " + sabun +"\n 이름 : " + name + "\n 부서 : " + deptName + "\n 급여 : " + salary);
					// 출력방법3 - 부모 멤버메소드 ; 부모멤버변수가 private인 경우 (메소드 getter이용)
					//아래 메소드들은 부모 class에만 있으므로 super써도되고 생략도 가능
					//System.out.println(" 사번 : " +super.getSabun() +"\n 이름 : " + getName() + "\n 부서 : " + getDeptName() + "\n 급여 : " + getSalary());
					super.printInfo();
					System.out.println(" 수당 : " + Sudang);
					//@Override - 자식 클래스에서 부모  클래스 재정의 (자식클래스 필요대로 수정가능)
					//자식클래스의 메소드가 부모클래스의 메소드를 오버라이드(재정의) 한다라고 한다.
					// 상속에서 부모클래스의 메소드를 변경하고자 할 때 사용한다
					// 상속해서 자식 클래스에서 부모클래스를 변경하고자 할 때 사용
					// 메소드의 이름, 매개변수, 매개변수 자료형, 반환형까지 모두 동일해야한다.
					// (동일하지 않으면 컴파일러가 다른 메서드로 인식)
					// 호출시 오버라이딩 한 자식 메소드가 호출됨
					// 오버라이드의 목적은 부모클래스의 메소드를 변경해서 자식쪽에서 호출하고자 하는 의도
					// 오버로드랑 오버라이딩 구분 잘 하기 
					
				}
}
