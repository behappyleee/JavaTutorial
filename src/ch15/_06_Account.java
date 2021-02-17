package ch15;

public class _06_Account {
	
	//매개변수
	private String accountNo;  //계좌번호
	private String ownerName; //예금주 이름
	private int balance;	//잔액
	
	//디폴트 생성자
	public _06_Account () {}
	
	//이때 주소값은 _06_SharedAread에  멤버변수로 전달이되어야함 
	public _06_Account (String accountNo, String ownerName , int balance) {
		this.accountNo=accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit (int amount) {
		balance += amount;
	}
	
	
	public int withdraw(int amount) {
		if(balance < amount) return 0;
		balance -= amount;
		return amount;
	}

	
	
}
