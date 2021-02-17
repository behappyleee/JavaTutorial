package ch15;

//공유영역 - 계좌이체 , 잔액합계 //thread에서  공유하여 작업을함 

public class _06_SharedArea {
	/*	synchronized(동기화) - 동기화 ...문서출력 
	 * 	예) A,B,C 출력순서는 달라질 수는 있으나(시분할) 문서는 섞이면 안된다.
	 * 	
	 *  동기화란 공유된 자원중에서 동시에 사용하면 안되는  자원에 대해 잠금(lock)을 수행하여 보호하는 도구이다.
	 *  즉 메소드로 호출할 때 객체에 잠금을 하고, 메소드 수행이 끝나면 잠금을 해제한다.	 
	 *  이 때 Vector라는 자료구조가 사용되고, 메소드가 호출될 때마다  잠금과 해제가 일어나므로 ArrayList 보다 속도가 느리다. 
	 * 
	 * [임계영역(critical section)]
	 * - 한 사용자가 자원을 사용하고 있으면, 다른 사용자는 사용이 끝날때까지 기다려야 한다.
	 * 	  이러한 영역을 임계영역이라고 한다.
	 *
	 * - 동기화 메소드를 만들기 위해서는 synchronized 라는 키워드를 메서도 선언에 붙이면된다.
	 * - synchronized 키워드를 사용하면, 어떤 한 순간에 하나의 스레드만이 임계영역 안에서 실행하는 것이 보장된다.
	 * - synchronized 키워드가 붙어있으면, 하나의 스레드가 공유메소드를 실행하는 동안에 다른 스레드는 공유메소드를 실행할 수 없다.
	 * 
	 * - wait() 메소드는 어떤 일이 일어나기를 기다릴 때 사용하는 메소드이다.
	 * - notify() 메소드는 반대로 어떤 일이 일어났을 때 이를 알려주는 메소드이다.
	 * 
	 * <임계 영역(critical section)의 동기화>
	 * - critical section이 문제를 일으키지 않으려면 그 부분이 실행되는 동안 
	 * 	  다른 스레드가 공유 데이터를 사용할 수 없도록 만들어야 하는 것을 말한다.
	 * 
	 * 
	 * 
	 */
		//멤버변수
		_06_Account account1; //김태희계좌
		//김태희 계좌
		_06_Account account2; //비계좌
		//비계좌
		//각각의 스레드에서호출
		//String accountNo, String ownerName , int balance
		//계좌 이체를 한다.
		
		synchronized void transfer(int amount) {
			//account1 = new _06_Account("A001", "김태희" , 3000000);
			//account2 = new _06_Account("A002", "비", 2000000);
			//인출메소드 호출
			account1.withdraw(amount);	
			System.out.println("김태희 계좌 : " +amount + "인출 " + "김태희 잔액: " + account1.getBalance());
			//입금메소드 호출
			account2.deposit(amount);
			System.out.println("비 계좌:" + amount + "입금 "+"비 잔액: " + account2.getBalance());
			//System.out.println("김태희가 비에게"+ amount +" 금액을 입금하였습니다.");
			//System.out.println("김태희 현재금액: " + account1.getBalance() + "비 현재금액: " + account2.getBalance() );
		}
		
		
		//잔액합계를 구한다.
		synchronized int getTotal() {
			return account1.getBalance()+ account2.getBalance();
		}
	
}
