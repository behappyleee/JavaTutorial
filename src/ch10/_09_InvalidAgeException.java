package ch10;

public class _09_InvalidAgeException extends Exception {
	//멤버변수
	
	private int wrongAge;
	
	//디폴트 생성자
	public _09_InvalidAgeException() {}
	
	
	public _09_InvalidAgeException(String message) {
		super(message);
	}
	
	public void setAge(int wrongAge) {
		this.wrongAge=wrongAge;
	}
	
}
	

