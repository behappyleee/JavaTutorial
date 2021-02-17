package ch07;
//부모 클래스 - 추상클래스
public abstract class _01_Computer {
			
			//추상메소드 선언
			public abstract void display( );
			public abstract void typing ( );
			
			//일반 메소드 
			public void turnOn( ) {
				System.out.println(" 전원을 켭니다. ");
			}
			
			public void turnOff( ) {
				System.out.println(" 전원을 끕니다. ");
			}
	
}
