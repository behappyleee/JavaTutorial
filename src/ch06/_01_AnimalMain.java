package ch06;

public class _01_AnimalMain {
		public static void main (String [ ] args) {
				// Cat  자식 클래스 정보 출력
				
			_01_Cat cat= new _01_Cat( );
			cat.cry();
			cat.setKind( " 고양이 ");
			cat.setLegs("4개");
			cat.eat();
			cat.play();
			cat.sleep();
			cat.printInfo();
			System.out.println(cat);
			System.out.println("=====================");
			
			_01_Dog dog = new _01_Dog();  //dog의 주소값에는 dog정보가 담겨있음 
			dog.bark();
			dog.eat();
			dog.play();
			dog.sleep();
			dog.setKind(" 강아지");
			dog.setLegs("4개");
			dog.printInfo();
			System.out.println(dog);
			
			
			
		}
}
