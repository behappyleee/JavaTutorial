package ch15;

public class _02_ThreadMain {
	
	public static void main(String[] args) {
		
		/*  Thread 생성과 실행
		 *  
		 *  [면접] 
		 * 	Thread 생성과 실행
		 *  (2) Runnable 인터페이스를 구현하는 방법
		 * 	1.  Runnable 인터페이스를 implements 받아 클래스를 작성 
		 *  2.  추상메소드 run() 메서드를 재정의 한다. 
		 * 	3.  main ()에서 thread 객체를 생성하고, 이 때 implements 받은 클래스 객체를 매개변수로 전달한다.
		 * 	4.  start() 메소드를 호출하여 thread 를  실행한다.
		 * 	5.  run() 메소드가 실행된다.
		 * 
		 */
		Thread t= new Thread( new _02_MyThread() );
		
		t.start();
	
		//System.out.println( (int)(Math.random()*1000) );
		
	}
}
