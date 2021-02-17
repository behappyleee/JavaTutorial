package ch07;
//인터페이스 예제.한 클래스 안에 여러개 넣을때는 public 한곳만 작성하기, main이 있는곳에 public 붙이기 
public class _08_Interface {
			//main method 있는 부분이 public class임 
			public static void main(String [] args) {

				M1 m1 = new M1();  // M1 인스턴스 생성
				m1.methodM1( new M2() );
			}
			
}


class M1{
	public void methodM1(M2 m2) {    //M2 m2 =new M2() ;
		System.out.println("M1클래스 - methodM1()");
		m2.methodM2(new M3() );  //M3 m3 = new M3();
	}
	
}
			

class M2{
	public void methodM2(M3 m3) {   //M3 me = new M3();
		System.out.println("M2 클래스 - methodM2()");
		m3.methodM3();
			
	}
	
}

class M3{
	public void methodM3() {
		System.out.println("M3클래스 - methodM3()");
	}

	
}