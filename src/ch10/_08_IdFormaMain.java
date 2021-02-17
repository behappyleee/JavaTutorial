package ch10;

public class _08_IdFormaMain {
	
	private String  userId;
	
	//Id에대한 제약조건 구현
	public void setUserId (String userId)  throws _08_IdFormatException {  //4. 상위메소드에게 예외처리를미루는 throws Exception
		
		if(userId == null) {
			throw new _08_IdFormatException ("Id는 null 불가");//2.강제 예외 발생  super(message)==>발생 
		} if(userId.length() > 20 || userId.length() < 8) { 
			throw new _08_IdFormatException ("Id는 20자 미만 8자 이상");  //super(message)==>발생
		}
		this.setUserId(userId);
	}
	
	
	public String getUserId() {
		return this.userId;
	}
	
	
	
	public static void main(String[] args) {
	
		_08_IdFormaMain id = new _08_IdFormaMain();
		String  userId = null ;
	
		// 1.예외가 발생할 수 있는 코드부분 = id값이 null임  호출
		try {
			id.setUserId(userId);
		} catch (_08_IdFormatException e) {
			System.out.println( e.getMessage() );   //Exception 부모의 getMesage(); 메소드 가져옴 
		}
		
		System.out.println("정상종료");
		
		
		
	}
	
}
