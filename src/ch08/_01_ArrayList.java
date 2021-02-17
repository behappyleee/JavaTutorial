package ch08;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;

public class _01_ArrayList  {
	
	public static void main(String[] args) {
		/*
		 *  컬렉션 프레임 워크
		 * 		
		 *  Collection 인터페이스 
		 * 	- List 인터페이스 : 클래스는 ArrayList, Vector, LinkedList
		 * 	- set 인터페이스 :클래스는 HashSet,TreeSet
		 * 
		 *        Map 인터페이스 : 클래스(HashMap, HashTable, TreeMap)
		 *  
		 *  [면접] 
		 * 1.특징
		 * List 인터페이스 : 순서가 있는 자료관리, 값 중복허용한다.
		 * 				index를 사용해서 요소에 접근한다.
		 * 				리스트에 들어있는 요소들의 인덱스는 0부터 시작한다.
		 * 				클래스는 ArrayList, Vector, LinkedList
		 * 			
		 * Set 인터페이스 : 순서가 없는 자료관리, 중복허용 않는다.
		 * 				          클래스종류는 Hashset, TreeSet
		 * 		
		 * 	[ArrayList]
		 * 	2.선언  
		 * 	ArrayList <데이터타입클래스> 변수명 = new ArrayList <데이터타입클래스>();
		 *
		 *		 다형성 적용 //부모가 List   //자식이 ArrayList
		 * 	List <데이터타입클래스> 변수명 = new ArrayList<데이터타입클래스>();
		 * 
		 *		3. 특징 : 데이터 순서가 있고, 중복허용된다.
		 *
		 * 	4. 추가 : 참조변수명.add(값); 추가는 add
		 *		     참조변수명.add(추가할 위치 index,값); //지정한 인덱스에 값을 추가, 그 뒤 값은 밀려난다.
		 * 		   
		 * 	5. 값 가져오기 : list.get(가져올 index);   //list.size() 만큼 반복	
		 *     
		 *     6. 교체 : list.set(교체할 위치 index, 값);  //지정한 index에 값을 변경한다....그 뒤 값은 그대로다
		 *     7. list.remove(삭제할 위치 index, 값);   
		 * 	8. 검색 : list.indexOf(검색할 값);  //중요
		 *		    	리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서  그 위치의 인데스를 리턴 	 	
		 * 			검색할 값과 일치한 데이터가없으면 -1을 리턴한다
		 * 	9.전체 삭제 : list.clear();
		 * 	
		 *     10.반복자 : Iterator <E> iterator : while(hasNext() ){ next() }
		 * . 
		 * 	
		 * 
		 * 
		 * 
		 */
		//2.선언 
		
		List <String> list = new ArrayList<String>(); //다형성작용시 앞에 List 작성(인터페이스)
		
		//ArrayList<String> list = new ArrayList<String> ( );
		
		//4.추가 list.add(값)
		list.add("귤");  //arg0에 String이 들어감    //0번쨰
		// int [ ] 배열명 = new int[갯수] ;
		list.add("감");   //2번째
		list.add("바나나"); //5번쨰
		list.add(1,"군고구마"); //1번쨰
		list.add(3, "피자");		//3번쨰
		list.add(4, "바나나우유");	//4번쨰
		list.remove(3);  //피자
		System.out.println(list.size());
		System.out.println("============================");
		
		//출력방법1-for문 이용  
		
		for (int i=0; i<list.size(); i++) {   
			System.out.print( list.get(i) + " ");
			System.out.println();//귤 군고구마 감 피자 바나나우유 바나나
		}
		
		System.out.println("============================");
		//출력방법2- 향상된 for문
		
		for(String str : list) {
			System.out.print(str + " ");
		}
		//출력방법3- 반복자(Interator) 사용하기
		/* 	사용목적 : java.util에 정의되어있음 (Iterator 인터페이스를 구현하는 객체이다.)
		 * 	        즉 컬렉션의 원소들에 접근하는것이 목적이다.
		 * 
		 * 	사용메소드 
		 * 	hasNext() : 아직 접근하지 않은 요소가 있으면 true를 반환  
		 * 	next() : 다음 요소를 반환 ... Object타입을 반환 =>Object는 모든 클래스의 조상(부모)
		 * 	remove() : 최근에 반환된 요소를 삭제한다.
		 * 	
		 */
		//다형성임 인터페이스 List로 받음 List가 부모 
		List <String> list2 = new ArrayList<String>(); 
		list2.add("봄");
		list2.add("여름");
		list2.add("여름");
		list2.add("겨울");
		System.out.println();
		System.out.println("=========================================");
		System.out.print("4 계절 : ");
		
		//hasNext() 접근해서 값을 가져오겠다(접근해서 너 값이 있니 ? 하고 가져옴)
		Iterator iterator = list2.iterator();   //hasNext()를 사용하기위하여서는 Iterator가 필요 접근하기 위하여 선언  
		while(iterator.hasNext()) {       //ArrayList의 값이 존재하는지 체크/ 리턴 타입이 boolean(존재하면 true 존재하지 않으면 false)
			//while은 값이 존재하는동안 돌음 이동해 가면서 출력(배열의 다음값이 존재하는 동안),값이 없으면 반복문 빠져 나가라 
			//String str = (String) Object; //존재하면 반복자는 값을 읽어서 Object타입으로 리턴하므로, String으로 형변환 Object는 가장큰 자료형(모든 클래스의 부모)
			String season = (String) iterator.next();//값이 존재할 시 season에 대입    // ==> 왼쪽은 Stirng str = Object; (Object는 가장 큰 자료형)큰타입에서 작은타입으로 가니 자료손실이 일어남 Object는 모든 클래스의 조상
			 System.out.print(season + " ");   //봄 여름 가을 겨울 출력
		}
		
		
	}
	
}
