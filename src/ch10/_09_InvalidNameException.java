package ch10;
//사용자 정의 Exception Exception 상속

public class _09_InvalidNameException extends Exception {
	
	private String wrongName;
	
	public _09_InvalidNameException() {
	}
	
	public _09_InvalidNameException(String message) {
		super(message);
	}

	public void setWrongName(String wrongName) {
		this.wrongName=wrongName;
	}
	
	public String getWrongName() {
		return this.wrongName;
	}
	
}


