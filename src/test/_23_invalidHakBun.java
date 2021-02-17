package test;

//학번,점수 입력 exception, invalid 학번, invalid 점수
//디폴트 매개변수 생성자 학번은 4자리, 
//main에서 input method()에서 각각호출 input 학번 input score , 정상일시에는 studentInfo 출력

public class _23_invalidHakBun extends Exception {   //클래스명 오타

	private int wrongHakBun;

	public _23_invalidHakBun(){} //클래스명 오타

	public _23_invalidHakBun(String message){
	super(message);
	}

	public void setWrongHakbun(int wrongHakbun){
	this.wrongHakBun=wrongHakbun;
	}


	public int getWrongHakbun(){
	return this.wrongHakBun;
	}

}