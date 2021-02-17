package ch02;

public class _04_IfEx {
	public static  void main (String [] args) {
		//점수 score 변수, 학점 grade 변수
        // 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F        출력 ==> 점수 : Score, 학점 : grade		
		
		int score = 70; 
		char grade ;
		
		if(score >= 90 ) {
			grade = 'A';			
		} else if (score >= 80 ){
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C'; 
		} else if (score >= 60) {
		    grade = 'D';
		} else {
			grade = 'F';  
		}
		System.out.println("점수 : " + score +" , 학점 : " + grade);
		
		
	}
}
