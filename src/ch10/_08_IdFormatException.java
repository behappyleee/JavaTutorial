package ch10;


//사용자정의 exceotion이며,반드시 Exception을 상속받아야 한다.
public class _08_IdFormatException extends Exception{

		// thorw new 사용자정의 예외에서   호출
	public _08_IdFormatException(String message) {
		// Exception 부모 매개변수 생성자로 message 전달  ==> 부모 멤버변수 전달 ==> getMesage( ) 에서 리턴
		super(message); //Exception의 getter호출 부모의 getter 호출임 부모에게 message 전달해줌 
	}
	
	
}	
	
	
	
