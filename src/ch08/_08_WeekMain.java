package ch08;

public class _08_WeekMain {

	public static void main(String[] args) {
		
		//SUN, MON, THUS, WED, THR, FRI, SAT
		System.out.println(_08_Week.SUN);
		System.out.println(_08_Week.SUN.ordinal());
		System.out.println(_08_Week.SAT.ordinal());
		
		System.out.println("===============================");
		String weekend = " " ;
		
		switch( _08_Week.FRI.ordinal() ) {
		
		case 0 : weekend= "일요일";
				break;
		case 1 : weekend= "월요일";
			break;
		case 2 : weekend= "화요일";
			break;
		case 3 : weekend= "수요일";
			break;
		case 4 : weekend= "목요일";
			break;
		case 5 : weekend= "금요일";
			break;
		case 6 : weekend= "토요일";
			break;
	}
		System.out.println("요일 : " + weekend);
		
		System.out.println("===============================");
		
		String week = " ";
		//SUN, MON, THUS, WED, THR, FRI, SAT
		switch(_08_Week.MON) {
		
		case SUN : week= "일요일";
				break;
		case MON : week= "월요일";
				break;
		case THUS : week="화요일";
				break;
		case WED : week= "수요일";
				break;
		case THR : week= "목요일";
				break;
		case FRI : week= "금요일";
				break;
		case SAT : week= "토요일";
				break;
		}	
		System.out.println("요일 : " + week);
		
	}

}
	
