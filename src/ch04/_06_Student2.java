package ch04;

public class _06_Student2 {
	
		//static 변수
		public static int serialNum = 1000;

		//멤버변수

		public int studentID;
		public String studentName;
	
		//디폴트 생성자
		public _06_Student2() {
			serialNum++;  //학생이 생성될때 마다 증가
			studentID = serialNum;  //증가된 값을 학번 인스턴스에 부여
		}
		
		public int getStudentID(int studentID) {
			return this.studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID=studentID;
		}
		
		public void setSerialNum(int serialNum) {
			this.serialNum=serialNum;
		}
		
		public int getSerialNum(int SeerialNum) {
			return this.serialNum;
		}
		
		public String getStudentName(String studentName) {
			return this.studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName=studentName;
		}
		
		//public void printInfo() {
			//System.out.println("학번 : "+  studentID + "\n이름 " + studentName);
		//}
		
			
}
