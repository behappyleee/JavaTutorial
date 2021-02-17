package ch15;

public class _04_Thread {
	public static void main(String[] args) {
		
		//Thread 클래스의 상수라서 클래스명.이름으로 접근가능 
		
		System.out.println("현재 수행되고 있는 스레드 이름 : " + Thread.currentThread().getName( )); //main
		System.out.println("스레드의 최소 우선순위 값 : " + Thread.MIN_PRIORITY ) ;  //1    
		System.out.println("스레드의 최대 우선순위 값 : " + Thread.MAX_PRIORITY);    //10
		System.out.println("스레드의 중간 우선순위 값 : " + Thread.NORM_PRIORITY);   //5
		System.out.println("현재 수행되고 있는 스레드 우선순위 : " + Thread.currentThread().getPriority() ); //5
		
		}
	
	
}
