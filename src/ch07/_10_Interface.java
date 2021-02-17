package ch07;

public class _10_Interface {
	public static void main(String[] args) {
		
		A10 a = new A10();
		//a.methodA( new B10 () );     // I10 참조변수 = new B10 (); 다형성 적용  new B10(); 대입 
		a.methodA();

		B10 b =new B10();
		b.methodB();
		
		
	}
	
}

class A10 {
	public void methodA() {
		// 10I i = new B10 (); 다형성 
		//i.methodB();
		I10 i10 = InstanceManager.getInstance(); //static은 클래스명.메소드명으로 접근가능
		
	}
}


interface I10 {
	public void methodB();
	//I10 참조변수 = new B10();
}	

class B10 implements I10{
	
	public B10 () {
		System.out.println("B10 디폴트 생성자 호출");
	}
	@Override
	public void methodB() {
		System.out.println(" B10 클래스 -methodB() ");
	}
	
}

class InstanceManager {
	/*
     * 	팩토리메소드(factory method)
	 * 	- 객체를 생성하는 정적 팩토리 메소드이다.
	 * 	- 이것은 디자인 패턴이 하나로써 객체를 만드는 부분을 자식클래스에게 위임하는 패턴 
	 *  - 즉 new 연산자를 호출하여 객체를 생성하는 코드를 위임하는 패턴
	 *  - 사용하는 이유는 하나의 클래스가 변경되었을 경우에 다른클래스의 변경을 최소화 하가 위함 
	 * 
	 *	    팩토리 메소드 이름으로 많이 사용되는것은 getInstance() 이다. 
	 *	    인터페이스에서 팩토리 메소드를 제공할 때 정적메소드를 사용하게된다
	 * 	  static 이므로 클래스명.정적메소드로 접근
	 * 	
	 * 
	 */

	//I10 i10 = new B10(); 다형성 적용 
	public static I10 getInstance() {
		return new B10();
	}
	
	
}

