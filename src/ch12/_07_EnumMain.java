package ch12;

import java.util.List;
import java.util.ArrayList;

public class _07_EnumMain {
		
		public static void main(String[] args) {

			//매개변수를 통하여 값 전달 
			//enum Animal {CAT, DOG, FISH}
			_07_Enum cat  =  new _07_Enum(Animal.CAT , "고양이");
			_07_Enum dog  =  new _07_Enum(Animal.DOG , "개"); 
			_07_Enum fish =  new _07_Enum(Animal.FISH, "물고기");
			
			//리스트에 담는다
			List <_07_Enum> list = new ArrayList <> ();
			
			list.add(cat);
			list.add(dog);
			list.add(fish);
			
			for(_07_Enum animal : list ) {
				System.out.println(animal.getKind() + " : " + animal.getName() );
				
			}

			
		}	
			
}
