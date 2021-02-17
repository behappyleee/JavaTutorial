package ch02;

public class _18_ForEx {

	public static void main(String[ ] args) {
		
				// 1~10 까지의 합 
			    //sum을 바깥으로 출력하려면 local variable 이므로 for 문 밖에서 출력 원할 시 반드시 선언 해주어야함
				int i ;
				int sum;   
				int num;
			
				for(i =1, sum =0 ; i<=10;  i++) {
					sum   += i;
					System.out.println(" num " + i +  " ,  sum  = " + sum);
				}
					System.out.println(sum);
	}

}
