package ch06;

public class _06_Main
{
	public static void main (String [ ] args) {   //static이 있을시 메모리에 올라감
		
				_06_Main main = new _06_Main( );   // 왜 만들었는지 ... ?
				//매개변수에 다형성 적용
				main.moveAnimal( new _06_Human ( ) );  // 참조변수에 주소값 전달
				main.moveAnimal( new _06_Tiger ( ) );  // _06_Tiger tiger = new _06_Tiger(): 힙메모리에 tiger
				main.moveAnimal( new _06_Eagle ( ) );  // 참조변수에 주소값 전달
				
					 //매개변수 _06_Animal animal = new _06_Human ( ); ==> 다형성 적용
			         // 부모걸로 받았지만 실행은 자식걸로됨(override된 메소드)==>다형성 적용	
				
					}	
					//다형성 - 매개변수로 부모타입 받음(코드줄어듬)-실행은 자식메소드 수행됨	
					// animal의미 human이 생성되었을때 주소값(부모타입은 접근용), override시에는 자식메소드 실행, 참조변수는 자식메소드 주소값임
	public void moveAnimal(_06_Animal animal) {   // human에 주소값들어있음
	animal.move();	// 부모쪽호출 >>힙메모리에 있는거 실행(자식꺼 실행) s//_06_Animal animal = new _06_Human() ;
		             // 부모                각각의 자식으로 받아야함
	if ( animal instanceof _06_Tiger) {
		_06_Tiger tiger = (_06_Tiger) animal;
		tiger.hunting();
	} else if ( animal instanceof _06_Human  ) {
			_06_Human human =(_06_Human) animal;
			human.readBook();
	}
						
					}		
					
				}	
					//다형성이 없으면 밑에 코드 다 작성하여야 함 (메소드를 자식 갯수만큼 사용가능)
					//자식의 형태는 다양하지만 부모형태로 하나 받음 
					/*public void moveAnimal_tiger(_06_Tiger tiger) {
						tiger.move();
					}
						
					public void moveAnimal_eagle(_06_Eagle eagle) {	
						eagle.move();
					}
					
					*/
					
				/*_06_Human human = new _06_Human();
				
				human.move();   //override이므로 자식메소드 호출
				human.readBook();
				
				System.out.println("=========== 다형성 =============");
				_06_Animal human2 = new _06_Human();
				
				human2.move();
				// human2.readBook();  ==> 에러발생, 메모리생성시 
				// 부모클래스 메소드1개(설계도에 1개) = 자식클래스 메소드2개(힙메모리에 2개)
				              //큰타입              = 작은타입 ==> 형이다르다
				// 다형성 적용 : 부모클래스 참조변수명 = new 자식클래스 ();
				// 메소드 개수는 자식이 많음 타입은 부모타입이 큼 
				*/		