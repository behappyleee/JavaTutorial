package ch15;

public class _02_MyThread implements Runnable {

	@Override
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.print(i+ " ");
		}

	}
	
	
}
