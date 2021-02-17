package ch07;
//자식 클래스
public class _05_SamsungTv implements  _05_Tv {

			@Override
			public void turnsOn() {
				System.out.println(_05_Tv.BRAND + " TV를 키다.");
			}

			@Override
			public void turnOff() {
				System.out.println(_05_Tv.BRAND+" TV 를 끄다");
			}

			//템플릿메소드
			public  void  operation( ) {
				turnsOn();
				turnOff(); 
			}
		
}
