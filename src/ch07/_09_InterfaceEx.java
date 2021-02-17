package ch07;

public class _09_InterfaceEx {
		public static void main(String[] args) {
		
		A09 a = new A09();
		a.autoPlay( new B09() );   //I09 i = new B09(); 다형성 적용   
		a.autoPlay( new C09() );   //I09 s = new C09();	다형성 적용
		
	}
}

//I09 i09 = new B09 () ; ==> 다형성적용

class A09 {                        //매개변수의 다형성 적용
	public void autoPlay( I09 i ) {//call by reference  I09 인스턴스 생성  i주소 값으로 접근 
		i.play();				   //오버라이드 된 메소드 호출
								//인터페이스의 추상메소드 호출 ... 오버라이드된  play( )호출 	
	
	}
}


//부모
interface I09{
	public void play(); //추상메소드
	
}

//자식
class B09 implements I09 {
	
	@Override
	public void play() {
		System.out.println("B09클래스-play()호출");
	}
	
}

//자식
class C09 implements I09 {
	@Override
	public void play() {
		System.out.println("C09클래스-play()호출");
	}
	
}





