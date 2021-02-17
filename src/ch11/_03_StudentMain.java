package ch11;
//equals 오버라이드  page-358 + 361
class ch08_03_Student {
//hashcode 오버라이드 하기 	
	
	//멤버변수
	private int studentId;
	private String studentName;
	
	//생성자
	public ch08_03_Student() {}
	
	public ch08_03_Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	//equals override ==> int와 String은 equals가 정의 되어있지만 다른 타입은 재정의 시켜주어야 함 
		public boolean equals(Object obj ) { 
			if( obj instanceof ch08_03_Student ) {
				ch08_03_Student stu = (ch08_03_Student)obj;
				if(this.studentId == stu.studentId) 
					return true;
				else 
					return false;	
			}
				return true;
		}
	//hashcode override
	
		
		
		
		
}

 public class _03_StudentMain {
	 public static void main(String []  args) {
		 
		 ch08_03_Student student1 = new ch08_03_Student (1001, "홍길동");
		 ch08_03_Student student2 = new ch08_03_Student (1001, "홍길동");
		 
		 //System.out.print((student1 ==student2) + " ");
		 //System.out.print(student1.equals(student2) +  "  ");
		 
		 //System.out.print( "student1의 hashcode 값 : " + student1.hashCode() + " ");
		 //System.out.print( "student2의 hashcode 값 : " + student2.hashCode() + " ");
		 //override 하기전 출력 값 : false false  student1의 hashcode 값 : 366712642 student2의 hashcode 값 : 1829164700 
		 
		 System.out.println(student1.equals(student2));
		 
		 
		 
	 }
	 
	 
	 
 }