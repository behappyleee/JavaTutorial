package ch02;

public class _07_SwitchCaseEx {
		public static void main  (String [ ]   args) {
				/*
				 *  switch(조건) {   조건 : 조건식 or 변수 올 수 있음 
				 *        case 값 1 : 수행문 1;
				 *                              break;
				 *        case 값 2 : 수행문 2; 
				 *                              break;
				 *        case 값 3 : 수행문 3;
				 *                              break;
				 *            default : 수행문 4; 
				 * }
				 */
               // ranking 에 따른 메달 색 출력 
			
				String medal = "은메달";
				int ranking =  1 ;
 				
				switch(medal) {
				case  "금메달"  : ranking =1;
					break;
				case  "은메달" :  ranking =2 ;				
				    break;
				case  "동메달" :  ranking =3;
				    break;
				    default : ranking =4;
				 }
				System.out.println( medal +"은 " + ranking+" 등 입니다. ");
		
			switch(ranking) {
			
			case 1 : medal = "금메달";
			break;
			case 2 : medal =  "은메달";
			break;
			case 3 : medal = "동메달";
			break;
			default : medal ="참가상";
			}
			System.out.println(ranking + " 등은 "  + medal +"  입니다.");
		
			String 등급 = "1등급" ;
	        char level;
			
			switch(등급) {
			   
			case  "1등급"  :  level= 'A' ; 
			    break;
			case  "2등급"  : level = 'B' ;
			 break;
			case  "3등급" : level = 'C' ;
	          break;		
			default  : level= 'N';
			}
			System.out.println(등급 + "은" + " 레벨이" + level +" 입니다.");		
	}
}


 
