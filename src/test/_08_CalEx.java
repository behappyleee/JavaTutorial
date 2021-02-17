package test;

public class _08_CalEx {

			public int getTotal(int num1, int num2){
				int result = num1 + num2;
				return result;
			}
		
			public int getAvg(int num1, int num2) {     //getTotal로 작성ERROR발생
				int result =(num1 +num2)/2 ;					// 중괄호가 아닌 세미콜론 찍음
				return result;
			}
	}
