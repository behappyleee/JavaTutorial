package ch06;

public class _04_SawonMain {
		public static void main(String [ ] args) {
			
			_04_Sawon company = new _04_Sawon () ;
			
			_04_Sawon company1 = new _04_Sawon("S001", "홍길동", "구매", 3000000, 23232);
			company.printInfo();
			
			company1.printInfo();
			
		}
		
}
