package ch04;

public class _05_Student {
	
			//static 변수
			public static int serialNum = 1000;
	
			//멤버변수
			
			public int studentID;
			public String studentName;
			
			//디폴트 생성자
			
			public _05_Student() {
			}
			
			public int getStudentID(int studentID) {
				return this.studentID;
			}
	
			public void setStudentID(int studentID) {
				this.studentID=studentID;
			}
			
			public String getStudentName(String studentName) {
				return this.studentName;
			}
	
			public void setStudentName(String studentName) {
				this.studentName=studentName;
			}
			
			public void printInfo() {
				System.out.println("serialNum  : " + serialNum + "\n학번 : "+  studentID + "\n이름 " + studentName);
			}
				
}
