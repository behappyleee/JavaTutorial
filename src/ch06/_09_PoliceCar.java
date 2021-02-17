package ch06;
//자식 클래스
public class _09_PoliceCar extends _09_Car {
		
			public void siren () {
				System.out.println("사이렌을 울리다. ~~");
			}
			
			
			public void start() {
				System.out.println("경찰차가 출발합니다.~~");
			}
			
			
			public void stop() {
				System.out.println("경찰차가 멈춥니다.~~");
			}
			
			
}
