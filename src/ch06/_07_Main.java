package ch06;

public class _07_Main {
			public static void main (String [] args) {
				
				   _07_Animal animal0 = new _07_Animal();
					animal0.move();
					_07_Human human = new _07_Human();
					human.move();
					_07_Tiger tiger = new _07_Tiger();
					tiger.move();
					_07_Eagle eagle = new _07_Eagle ();
					eagle.move();
					
					
					//  다형성을 이용 : 상속이 전제조건 하나의 참조변수(부모)로부터 여러타입의 객체(자신)을 참조할 수 있는것.
					// 						    
					
					//  다형성의 장점 - 1. 모든 클래스를 부모 자료형 하나로 쉽게 관리가능(코드 간결)
					// 				2. 매개변수를 부모자료형 하나로 관리하면 코드가 간결해진다.
					// 				3. 상위 클래스에서 공통부분의 메소드를 제공하고, 하위클래스에서 추가 메소드를 구현하면 코드양도 줄어들고 유지보수도 용이
					
					//    다형성 인스턴스 생성
					//    부모클래스  참조변수 = new  자식클래스 ( );    ==>> 다형성 문법 (부모가 큰타입 자식이 작은 타입)
					// 	  부모타입의 갯수가 자식타입의 갯수보다 적으므로 왼쪽에 부모타입이 와야한다.
					//     다향성을 적용했을지라도 오버라이딩시 자식메소드가 호출 (@Override 어노테이션을 생략해도 마찬가지)
					// - 부모 참조변수로 접근시, 부모타입 클래스의 멤버가 힙메모리에 생성된 객체에 존재해야한다.
					// 	 만약 존재하지 않으면 에러가 발생(예 human의 readBook) 부모 메소드는 존재하지않음
					// 	 다운 캐스팅 : 작은타입 참조변수 = (작은타입) 큰타입 참조변수;  ==> 부모가 큰 타입 자식이 작은타입
					// 	 따라서 자식객체에 접근하기 위해서 다운캐스팅(다운형변환)을 해야한다.
					// - 	가상 메소드 원리에 따리 move( ) 메서드(오버리이딩 메소드)는 힙메모리에 존재사는 실제인스턴스의 메소드이다.
					// - 	 if (부모 참조변수 instanceof 자식클래스) {
					//   		자식클래스 참조변수 = (자식클래스)부모참조변수;
					//		}
					//		Animal hAnimal= new Human ( ) ;			
					//	 	if( hAnimal instanceof Human) {
					//			Human human = (Human)hAnimal;
					//			human.readBook( ) ;
					//		}
					//
					
					_07_Animal human1 = new _07_Human ( );
					//메소드 호출
					human1.move( );
				    //상위 클래스로는 묵시적으로 형변환이 되지만, 하위클래스로 형변환 할때는 명시적으로 형변환을 해야한다.
					//다운 캐스팅 : 상위클래스로 형 변환되었던 하위클래스를 다시 원래 자료형으로 형변환 하는것을 다운 캐스팅이라한다.
					//_07_Human human2 = null;
					if  (human1 instanceof _07_Human ) {     // 부모타입 instanceof 자식타입
					
					  // 다운캐스팅 형변환 : 작은타입 = (작은타입) 큰 타입;     // 부모가 큰 타입 자식이 작은타입      
					  	_07_Human human2 = (_07_Human )  human1 ;
						//자식에만 있는 메소드는 자식 타입으로 형변환
						human2.readBook() ;
					}

					_07_Animal tiger1 = new _07_Tiger(); 
					tiger1.move();
					
					if( tiger1	 instanceof _07_Tiger ){
							_07_Tiger tiger2 = (_07_Tiger)tiger1 ;
							tiger2.hunting();
					}
					
					_07_Animal eagle1 = new _07_Eagle();
					eagle1.move();
		
					_07_Eagle eagle2 = (_07_Eagle)eagle1;
					eagle2.flying();
					
		}
	
}
			