package test;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class _17_ArrayListEx {
		public static void main(String[ ] args) {  //메인클래스 적지않음 
//ArrayList : 데이터 순서가 있고 중복허용가능하다 (list.add (값) ...... list.add(추가할 index. 값)
//List인터페스와 Set인터페이스가 있다
//List 인터페이스 특징은 순서가 있고 중복 허용가능하다.(ArrayList, Vector, LinkendList)
//Set 인터페이스 특징은 순서가 없고 중복허용 불가하다.
//ArrayList 선언 방법에는 두가지가있다. 한가지는 부모인 List를 이용하여 다형성을 적용하는것과 ArrayList로 선언하는것이있다.
//List 다형성 적용방법 : List <데이터타입 클래스> 참조변수 = new ArrayList <데이터타입 클래스> ( );
//ArrayList 선언 : ArrayList <데이터타입 클래스> 참조변수 = new ArrayList <데이터타입 클래스> ( );
//값 가져오기 : liste.get(가져올index), list.size( ) 만큼 반복
			
			List <String> dietFoods = new ArrayList <String> ( );
				dietFoods.add ( "계란" );
				dietFoods.add( "고구마" );
				dietFoods.add( "현미밥" );
				dietFoods.add( "물" );
			
				//for문
				
				for(int i = 0; i<dietFoods.size(); i++){   // 배열 : 배열명.length
				System.out.print(dietFoods.get(i) +"  "); //get 적지않음 
				}
				System.out.println();
				System.out.println("==================="); //스펠링 오타	
				
				//향상된 for 문
				for(String abc : dietFoods){
				System.out.print(abc +"  ");
				}
				System.out.println();
				System.out.println("===================");	//스펠링 오타
				
				//Iterator 출력
				Iterator iterator = dietFoods.iterator();
				while( iterator.hasNext()  ) {     //iterator대신 dietFoods로 적음 문법 오류남 dietFoods <iterator.hasNext() 로 적음 , hasNext()의미는다음 값있니 ? 물어보는 기능
					String str = (String)iterator.next();	//next(); 넥스트 다음 값 읽어와라 명시적 형변환 해주어야함-자료손실 일어나지않게 사용 
					System.out.print(str +"  ");
				}

				
		}
}