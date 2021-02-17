package ch04;

public class _07_Student {
	
		//static 변수
		private static int serialNum = 1000;

		//멤버변수
		public int studentID;
		public String studentName;
		
		//디폴트 생성자
		public _07_Student() {  //호출한순간 serialNum이 1001로 바뀜
		  serialNum++;  //학생이 생성될때 마다 증가
		  studentID = serialNum ;   //증가된 값을 학번 인스턴스에 부여
		}
		
		public int getStudentID() {
			return this.studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID=studentID;
		}
		
		public static void setSerialNum(int serialNum) {
			_07_Student.serialNum=serialNum;
		}
		
		public static  int getSerialNum() {
			String str="aaa";    //지역변수 이기때문에 오류가 발생하지 않음 
			// studentName="홍길동";  ==> 오류발생 static메소드는 static 변수만 접근가능, 일반변수는 접근 불가능(일반변수는 인스턴스가  생성될때 변수가 만들어짐)
			return serialNum ;   //일반변수,static변수는 level이 다름 
		}
		
		public String getStudentName() {
			return this.studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName=studentName;
		}
		
		//public void printInfo() {
			//System.out.println("학번 : "+  studentID + "\n이름 " + studentName);
		//}
					
			
}
