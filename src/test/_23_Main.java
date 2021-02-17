package test;
import java.util.Scanner;

public class _23_Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String [ ] args ) {
				
		try { 
		_23_StudentInfo info = method(); //클래스명 오타
		info.showInfo();
		} catch (_23_invalidScore e   ) {
		System.out.println( e.getMessage() );
		} catch (_23_invalidHakBun e      ) {
		System.out.println( e.getMessage () ) ;
		} finally {
		System.out.println("finally 문 !! ");
		input.close( ) ;
		}


	}
	
	static _23_StudentInfo method() throws _23_invalidHakBun, _23_invalidScore {
	int score = setScore();
	int hakBun = setHakBun();
	_23_StudentInfo info = new _23_StudentInfo(score, hakBun);
	return info;
	}

	
	static int setScore () throws _23_invalidScore {
	System.out.print("점수를 입력하세요 : " );
	int score = input.nextInt();

	if(score <0  ||  score > 100 ){
	_23_invalidScore in = new _23_invalidScore ();
	in.setWrongScore(score);
	throw new _23_invalidScore ( "점수는 양수이거나 100점 이하입니다.");
	}
	return score;
	}


	static int setHakBun() throws _23_invalidHakBun {
	System.out.print("학번을 입력하세요 : " );
	int hakBun = input.nextInt();	
	if ((int)(Math.log10(hakBun)+1) > 4  || (int)(Math.log10(hakBun)+1) < 4 ) {
	_23_invalidHakBun to = new _23_invalidHakBun();
	to.setWrongHakbun(hakBun);
	throw new _23_invalidHakBun("학번은 4자리 입니다.");
	}
	return hakBun;
	}


}