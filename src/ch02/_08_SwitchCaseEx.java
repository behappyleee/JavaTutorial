package ch02;

public class _08_SwitchCaseEx {
		public static void main (String [] args) {
			// 숫자 출력 하나, 두서넛, 대여섯 ,  많음
			
			int num=4;
			String str = "";
			
			switch(num) {
			case 1 : str = "하나";
				break;
			case 2 : case 3 : case 4 : str = "두서넛";
				break;
			case 5 : case 6 : str ="대여섯";
				break;	
			default : str ="많음" ;
			}
			System.out.println(num+" : "+ str );
		
			
			
			
			
			
			
			
			
			
		}
}
