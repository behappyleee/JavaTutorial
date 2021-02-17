package ch14;
//450page 코딩 (인스턴스 내부 클래스)
public class _01_OutClass {

	private int num =10;
	private static int sNum =20;
	
	private InClass inClass;
	
	
	public _01_OutClass () {
		inClass = new InClass ();
	}
	
	
class InClass {
	int nNum = 100;
	
	void inTest() {
		System.out.println("OutClass num = : " + num+ "(외부 클래스의 인스턴스 변수");
		System.out.println("OutClass sNum : " + sNum +"(외부 클래스의 정적 변수)");
		
	}
	
}


public void usingClass() {
	inClass.inTest();
}



}



