//싱글톤 메인
package test;  //package명 미입력
public class _14_Main {
	public static void main(String [ ] args) {  //String오타

	//싱글톤 : 인스턴스를 딱 한번만 생성하여 사용
	//싱글톤 생성방법 1. 클래스내에 private으로 생성자 생성 2.클래스내에 static 으로생성자생성 3. getInstance()이용하여 호출

				_14_Student student =_14_Student.getInstance();
				
				student.setStudentID("S001");
				student.setName("홍길동");
				student.setAddress("강서구");
				student.printInfo();
			
				System.out.println("=============================");
			
				_14_Student student1 =_14_Student.getInstance();
			
				student1.setStudentID("S002");
				student1.setName("김철수");
				student1.setAddress("강남구");
				student1.printInfo();


				}

}