package test;

public class _23_StudentInfo {

	private int hakBun;
	private int score;

	public _23_StudentInfo( ){ }

	public _23_StudentInfo(int hakBun, int score){
	this.hakBun=hakBun;
	this.score = score;
	}	

	public void setHakBun(int hakBun){
	this.hakBun=hakBun;
	}

	public int getHakBun(){
	return this.hakBun;
	}

	public void setScore(int score){
	this.score=score;
	}

	public int getScore(){
	return this.score;
	}

	public void showInfo(){
	System.out.println("학점 : " + hakBun +"\n점수 : " + score);
	}

}