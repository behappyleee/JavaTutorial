package ch04;

public class _09_Student {
				//public은 외부에서 접근을 허용해줌, public이 없을시 default 의미는 크게없음 
			
				public String studentName;
				public int grade;										
				public int money;
				
				//생성자
				public _09_Student(String studentName, int money) {
					this.studentName = studentName;
					this.money = money;
				}
				
				//메소드
				public void takeBus(_09_Bus bus) {	// call by value : 메서드 호출 시 매개변수에 값 전달
					bus.takemoney(1000);		    // call by reference : 메서드 호출 시 매개변수에 주소(참조값)전달
					this.money -= 1000;
				}
			
				public void takeSubway(_09_Subway subway) {
					subway.takemoney(1500);
					this.money -= 1500;
				}
				
				public void showInfo() {
					System.out.println(studentName + "님의 남은 돈은" + money + " 입니다.");
				}
	
}
