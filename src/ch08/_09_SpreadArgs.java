package ch08;

public class _09_SpreadArgs {

	//디폴트 생성자
	public _09_SpreadArgs () {}
	
	/*
	 * 	스프레드  매개변수 
	 * 	1.용도 : 메소드 호출시 매개변수 인자의 수가  일치하지 않아도 호출이 가능 
	 * 	        args는 인자의 수를 동적으로 처리할 수 있도록 유연성을 제공  
	 * 
	 * 	2.방법 : 메소드 인자(데이터 Type ... 변수) 로 지정하나 , 스프레드 매개변수는 1개밖에 사용할 수 없다. 
	 * 			 컴파일시에 매개변수 인자로 넘어온 갯수만큼 배열이 생성된다.
	 * 			
	 * 
	 * 
	 */
	
	public void callArg(String ... str) {  // ... 세개 있을시 컴파일러가 배열로 인식
		for(int i =0; i< str.length; i++) {
			System.out.println(str[i]);
		}
	
	
	for(String s : str) {
		System.out.println(s);
	}
}
	
	public void callArg2(String name, int ... score) { //int[score]
			System.out.println(name + " ");			// spread argument 라고 함 
			
			for(int abc : score) {
				System.out.println(abc);
			}
	}
	
	
}
