package ch04;

public class _08_Company {

		//멤버변수
		private String companyName;
		private String address;
		private String telno;
		//싱글톤
		//싱글톤은 딱 한번 인스턴스 생성함 
		
		//1단계 : 생성자를 private으로 만들기   ==> 기본생성자로 만들기 방지 ex)_08_Company com = new _08_Company();
		private _08_Company ( )  {		     //==> 기본생성자인것을 인지시켜주려함
			System.out.println("기본 생성자");  //==>	 public이면 의미없음 
		}
		
		//2단계 : 클래스 내부에 static으로 유일한 인스턴스 생성
		private static _08_Company instance = new _08_Company (); // ==> 변수선언, 주소값 생성 
		
		public static  _08_Company getInstance( ) {   // ==>직접 메소드생성public으로 getter생성
			if(instance == null) { 
				instance = new _08_Company();
			}
			return instance; //주소값 리턴
		}
		
		//멤버 메소드
		public void setCompanyName(String companyName) {
			this.companyName=companyName;
		}
		
		public String getCompanyName() {
			return this.companyName;
		}
		
		public void setAddress(String address) {
			this.address=address;
		}
		
		public String getAddress() {
			return this.address;
		}
		
		public void setTelno(String telno) {
			this.telno=telno;
		}
		
	
		public String getTelno() { 
			return this.telno;
		}
		
		//멤버메소드
		public  void printInfo() {
			System.out.println("회사이름 : " + companyName + "\n주소 " + address + "\n번호 : "  +telno);
		}
		
					
					
}				
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					