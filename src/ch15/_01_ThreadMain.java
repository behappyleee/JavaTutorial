package ch15;

public class _01_ThreadMain {
	public static void main(String[] args) {
		/*
		 * 	[면접]
		 * 	Thread 생성과 실행
		 * 	(1) Thread 클래스 상속받기
		 * 	1. Thread 클래스를 상속받아서 클래스를 작성한다.
		 * 	2. run ()이라는 메소드를 재정의하여라  (override)
		 *  3. main에서 Thread라는 객체를 생성한다.
		 * 	4. start() 메소드를 호출해서 thread를 실행한다.
		 * 	5. run()메소드가 실행된다.
		 * 
		 */
		_01_MyThread t = new _01_MyThread();
		// start() : thread 실행  ==> run() 호출
		t.start();  //주의 : run() 이 아닌 start() 호출
		
	}
	
}
