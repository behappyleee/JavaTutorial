package ch11;
public class _05_Circle implements Cloneable {

/* 마커인터페이스 : 구현할 메소드가 없는 인터페이스 
 * 				abstarct 처리안해도 오류안남 
 * 예) Cloneable :객체를 복제할 떄 사용하는 인터페이스, 인터페이스에서 cloneable인터페이스에서 구현 할 메소드는 없다.
 * 	하지만 clone()을 하지 않으면 복제되지 않는다.
 * 	clone() 시 implements Cloneable을 하지 않으면 예외(CloneNotSupportedException)이 발생 
 * 
 */
	_05_Point point;
		
	int radius;
	
	_05_Circle (int x, int y, int radius) {
		this.radius=radius;
		point = new _05_Point(x, y);
				
	}
	
	@Override
	public String toString() {
		return "원점은 : " +  point +" 이고 " + " 반지름은 : " + radius +" 입니다.";  
	}
	
	/*  복제
	 * 	CloneNotSupportedException : 클래스의 clone() 메소드가 지원되지 않았을 경우의 예외 클래스 
	 * 
	 */
	
	@Override  
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
