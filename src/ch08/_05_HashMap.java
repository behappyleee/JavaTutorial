package ch08;

import  java.util.HashMap;

import java.util.Map;

public class _05_HashMap {
		
		public static void main(String[] args) {
				/*
				 *   [면접 page 439]
				 * 	해싱(hashing) : 키를 이용해서 해시테이블로부터 데이터를 가져오는 과정 	
				 * 	
				 * 	HashMap
				 * 	1) 특징
				 * 	-  데이터의 순서를 보장하지 않는다.
				 * 	-  key 와 value 쌍으로 저장한다.
				 * 	-  key는중복되면 안된다.
				 * 	-  key를 이용해서  value를 가지고온다.
				 * 	- List 계열과 달리 index가 없다.
				 * 	- Map 이라는 인터페이스를 구현한 클래스이다. 
				 * 	
				 * 	2) 선언
				 * 	- HashMap <Key 타입, value 타입> map = new HashMap <key타입, value 타입> ();
				 * 	- Map<Key 타입, value 타입> map = new HashMap <key 타입 , value타입>(); //  다형성 적용
				 * 	
				 * 	3) 메소드
				 * 	- 데이터 추가 : put(key , value);
				 * 	- 데이터 삭제 : remove(key)
				 * 	- 데이터가 비어있는지 여부 : isEmpty();
				 * 	- 해당 키가 있는지여부  : containsKey();
				 * 	- 해당 값이 있는지 여부 : contatinsValue(value)
				 * 	- 해당개수 :  size()
				 * 
				 *  	int 는 Intger로 입력 
				 */
					
		Map<Integer  , _06_Member>map = new HashMap<> ();
					// key , value         데이터 추가 : put( key, value );
		
		map.put(1,new _06_Member(1,"홍길"));
		map.put(2,new _06_Member(2,"홍갈"));
		System.out.println(map);
		
		
		/*map.put(2, "아이유");
		map.put(3, "유재석");
		map.put(4, "신동엽");
		map.put(5, "박하나");*/
				
		for(int i=1; i<map.size(); i++) {
			System.out.println(map.get(i) );
		}
				System.out.println("=============================");
		//신동엽 데이터 가져오기 
		//데이터 가져오기 : get(key) 이용
		System.out.println(map.get(4));

		System.out.println("================================");
		map.remove(3);  //삭제할때 키를  이용 
		System.out.print("유재석 삭제후 데이터 출력 : " +map);
		System.out.println();
		System.out.println("=================================");
		
		for(int i=1;  i<=map.size();  i++) {   	  //삭제 후 size가 4로됨 4개까지만 출력이됨.HashMap은 순서가 바뀌지않으므로 유재석 null된후 사이즈 4까지만 출력이됨 당겨지지않음              
			System.out.print(map.get(i) +"  ");   //중간에 빠진부분 null로 들어가며 당겨지지않는다. ArrayList 와는 다름 
		}
		
		System.out.println();
		System.out.print("데이터가 비어 있는지 여부 :   map.isEmpty() ");
		System.out.println(map.isEmpty());    //map이  데이터 비어있는지 여부물음 false로 출력이됨 

		System.out.println("해당 키가 있는지 여부 :  map.containsKey(Key); ");
		System.out.println( map.containsKey(2) );      //2번이라는 key가 있으므로 true로 출력이됨
		System.out.println(map.containsKey(3));        //3번이라는 key를 아까 삭제하였기때문에 false로 출력이 됨 
		
		System.out.println("해당 값이  있는지 여부 : map.contatinsValue(value)");
		System.out.println(map.containsValue("아이유"));    //해당 value가 있으므로 true로 출력이됨
		System.out.println(map.containsValue("유재석"));	//해당 value가 삭제되었으므로 false로 출력이됨 
		
		System.out.println("====해당 갯수 :  map.size() =======");
		System.out.println(map.size());   //4개로출력 1개가 삭제가되었음 
		
					
					
		}
}
