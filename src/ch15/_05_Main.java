package ch15;
				
public class _05_Main {
		
	public static void main(String[] args) {
		
		// 객체 5개, 스레드 5개
		// 각각 영향을 받지않고, 각자 일을 한다.
		Thread loc1 = new Thread(new _05_VoteThread(), "서울" );
		Thread loc2 = new Thread(new _05_VoteThread(), "부산" );
		Thread loc3 = new Thread(new _05_VoteThread(), "대전" );
		Thread loc4 = new Thread(new _05_VoteThread(), "대구" );
		Thread loc5 = new Thread(new _05_VoteThread(), "원주" );
		
		loc1.start();
		loc2.start();
		loc3.start();
		loc4.start();
		loc5.start();
	
		}
}
