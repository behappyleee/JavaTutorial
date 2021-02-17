package ch08;

public class _09_SpreadMain {
	public static void main(String[] args) {
			
		_09_SpreadArgs var = new _09_SpreadArgs();
		
		var.callArg("샌드위치","연어스테이크" , "샐러드" , "ABC쥬스" ,"고구마"); //컴파일 시점에 배열이 생성됨(갯수는 상관x ==> 매개변수로 점3개를 줌 ...)
															
		var.callArg2("홍길동" , 60, 50 , 40);
		
		
		
		
	}
	
}
