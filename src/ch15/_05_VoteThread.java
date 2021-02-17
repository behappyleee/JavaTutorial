package ch15;

import java.util.Random;

public class _05_VoteThread implements Runnable  {
	//지역별 개표율  현황
	
	int sum =0; //총 개표율
	int targetNum =100; //개표율 100%
	Random random = new Random(); //개표율 속도
	
	public void  run() {
		StringBuffer sb = new StringBuffer();   // 투표율의 진행률 만큼 별을 출력 ==> 개표율을 *의 갯수로 출력
		
		 while(true) { 
			 sum += random.nextInt(10);  // 10까지의 난수를 발생 숫자 누적
			 sb.delete(0, sb.length()) ; // 초기화, * 길이만큼  
			 
			 if(sum >= targetNum ) {
				 sum = 100;
				 for(int i =0; i<sum; i++) {
					 sb.append('*');
				 }
				 System.out.println(Thread.currentThread().getName() + "개표율 " + sum + "\t" + sb);
				 break;
			 } else {
				 for(int i =0; i <sum ; i++ ) {
					 sb.append('*');
				 }
				 System.out.println(Thread.currentThread().getName() + "개표율 " + sum + "\t" + sb);
			 }  
			 
			 
			 
			 try {  				//sleep 은 (1000밀리초) : 1초     500밀리면 0.5초
				 Thread.sleep(500); //500밀리면 0.5초임 , CPU의 시간을 다른 스레드에게 넘겨주는 효율적인 방법, 현작업을 중지하고 넘겨준다
			 } catch (InterruptedException e) {
				 System.out.println( e.getMessage() );
				 e.getStackTrace();
			 }
			 
			 
		 }
		
	}
	
	
}
