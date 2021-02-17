package ch15;

public class _03_MyRunnableMain {
	
	public static void main(String[] args) {
		
		//2개의 thread 생성 .. A ...B
		
		//인스턴스 생성하여 참조변수로 접근
		/*_03_MyRunnable t= new _03_MyRunnable();
		t.run(); */
		
		//매개 변수 생성자로 호출
		Thread threadA = new Thread( new _03_MyRunnable("A") );
		Thread threadB = new Thread( new _03_MyRunnable("B") );
		
		threadA.start();
		threadB.start();		
			
		
		}
	
}
