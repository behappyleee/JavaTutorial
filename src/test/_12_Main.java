package test;

public class _12_Main {
		public static void main (String [ ]   args) {
					//다형성 : 부모타입 참조변수 = new 자식클래스 ( ) ;
					//상위클래스로 형변환은 묵시적 하위클래스로 형변화은 명시적
						showInfo(new  _12_Manager  ( "S001",  "김영희"  ,  "자재", 2700000, 10000 )  ); //method static 안쓸시 메인메소드만들어서 참조변수로 접근
						showInfo(new  _12_Sawon      ( "S002",  " 김철수 ", "경영", 2800000 , 20000 ) );
		             // _12_Employee employee = new _12_Employee ( );
					//employee.setSabun("S001");
					//	employee.setName("홍길동");
					//	employee.setDeptName("경영");
					//employee.setSalary(3500000);
					//employee.printInfo();
					
					//_12_Employee employee1 = new _12_Manager () ;
					
					//if(employee1 instanceof  _12_Manager) {
					//	_12_Manager manager = (_12_Manager)employee1;
					//	manager.calBonus(150000);
					//	}
					    
					//    _12_Manager manager1 = new _12_Manager ("S002", " 홍길동",  "경영" ,  3000000 , 100000);
					//	manager1.printInfo();
						
						//_12_Sawon sawon =  new  _12_Sawon (" S003 ", " 김철수 " , " 구매 " ,  2800000 , 150000 );
	 			}
			public static void showInfo( _12_Employee emp ) {
			//emp.printInfo();   //override 메소드이므로 자식메소드 호출
			
				if(emp instanceof _12_Manager) {
				_12_Manager manager = (_12_Manager)emp;    // 다운캐스팅 : 자식메소드 접근하기 위하여
					manager.printInfo( );
					manager.calBonus( );
				} 	else if (emp instanceof _12_Sawon) {
					_12_Sawon sawon = (_12_Sawon)emp;
					sawon.printInfo( );
					sawon.calSalary( );
				}

			}
		
}