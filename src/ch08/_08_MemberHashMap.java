package ch08;

import java.util.HashMap;
import java.util.Map;

public class _08_MemberHashMap {
	public static void main(String[] args) {
		/*
		 * 	[시험]
		 * 	1. 다형성 이용HashMap 생성	
		 *  2. 
		 * 
		 */
		// Map 다형성을 이용한 HashMap 선언 
		Map < String , _06_Member > map = new HashMap < String , _06_Member > () ;
		
		//HashMap 추가정보입력은 put
		map.put( "M001" , new  _06_Member(1, "홍길동") );
		map.put( "M002" , new  _06_Member(2, "유재석") );
		map.put( "M003" , new  _06_Member(3, "강호동") );
		
		//toString 출력이됨 
		System.out.println(map);
		// {key == value1, key==value2 , key3==value3 ....} 순서가 없다. ArrayList는 순서가 있음 key와 value로 구분되었기 때문 순 
		
		map.remove("M002");
		System.out.println(map);
		System.out.println("==================================================");
		//map에서 정보추가시에는 put메소드 이용
		map.put("M003", new _06_Member(3, "아이유" ));
		System.out.println(map);
		System.out.println("===================================================");
		
		//멤버 신규추가
		map.put("M004",new _06_Member(4, "BTS") ) ;
		System.out.println(map);
		
		//조회 key value 가져오기 
		//향상된 for문 
		//map.entry< String, _06_Member > ==> getKey(), getValue()를 가지고 있는 인터페이스
		//Map.Eentry<String, _06_Member> 하나자체가 인터페이스
		for(Map.Entry <String ,_06_Member> str : map.entrySet()) {
			String key = str.getKey();
			_06_Member value = str.getValue();
			System.out.println(" key : " +key+ " value : " + value);
		}
	
		
		
	}
}
