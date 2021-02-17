package ch06;
						
public class _02_EmplyeeMain {
		public static void main (String [ ] args) {
				_02_Sawon company = new _02_Sawon( );
				// 부모메소드
				//매개변수하나나 이렇게설정할수도 있고 _04_Sawon처럼 한꺼번에 설정할 수 있음
				company.setSabun("S001");
				company.setName("홍길동");
				company.setDeptName("경영");
				company.setSalary(3000000);
				// 자식 메소드
				
				company.setSudang(200000);
				company.printInfo( );
				System.out.println(company);
				//@Override - 자식 클래스에서 부모  클래스 재정의 (자식클래스 필요대로 수정가능)
				// 부모클래스와 자식클래스중에 메소드명 같은거있으면 자식꺼 수행
				// 부모꺼 메소드명 똑같은게 있지만 자식거에서 수정할시 그것만 재 정의(부모꺼 무시)
				System.out.println("============================");
				// _02_Sawon company1 = new _02_Sawon ("S002", " 홍길동 ", "인사", 2500000);
				_03_Manager manager = new _03_Manager ();
				manager.setSabun("S002");
				manager.setName("김철수");
			    manager.setDeptName("인사");
				manager.setSalary(4000000);
				manager.setSudang(350000);
				manager.setBonus(5000000);
				manager.printInfo();
				//  재정의된 자식 메소드 실행
				//  manager.printInfo() 는 상속받은 두 부모 클래쓰 모두 이 메소드가 있지만 재정의된 메소드가 실행한번만 실행됨 
				System.out.println(manager);
				
				}
}
