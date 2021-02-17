package test; //패키지명 오타
public class _23_invalidScore extends Exception {


	private int wrongScore;

	public _23_invalidScore ( ){ }

	public _23_invalidScore (String message){
	super(message);	
	}

	public void setWrongScore(int wrongScore){
	this.wrongScore = wrongScore;
	}

	public int getWrongScore (){
	return this.wrongScore; //return 오타
	}
	

} 