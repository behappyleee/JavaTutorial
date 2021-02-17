package ch08;

public class _09_Main {
	
	public static void main(String[] args) {
		/*
		 * [면접]
		 * 제네릭 : 여러 참조 자료형이 쓰일 수 있는 곳에 특정한 자료형을 지정하지않고
		 * 		    클래스나 메소드를 지정한 후 사용하는 시점 (제네릭 클래스의 인스턴스 생성시점)에
		 *        어떤 자료형을 사용할 것인지 지정하는 방식
		 * 			T : type           K : Key
		 * 			E : element        V : value
		 *    - 제네릭으로 구현하면 형변환을 하지 않아도된다.(매개변수의 다형성, 다운캐스팅 ==> 안해도 된다.)
		 * 
		 * => 제네릭 클래스를 사용하면 컴파일러는 일단 대입된 자료형이 잘 쓰였는지 확인한다.
		 * 	  class 파일을 생성할 때 T를 사용한 곳에 지정된 자료형에 따라서 컴파일한다.
		 * 	
		 */                     
		_09_GenericPrinter < _09_Powder > powderP = new _09_GenericPrinter <> ();   //T가 파우더일때      
											  
		powderP.setMaterial( new _09_Powder() ); //T material = new Powder(); 주소값넣어주어야함
												
		powderP.getMaterial();
		
		_09_Powder powder = powderP.getMaterial();  //형변환 하지 않아도 된다.
		      										//재료는 powder입니다.
		System.out.println( powder.toString() );
			
		
		_09_GenericPrinter < _09_Plastic > plasticP= new _09_GenericPrinter < >();  //후자 다이아몬드는 내용 생략가능
		
		plasticP.setMaterial( new _09_Plastic () );  //_09_Plastic 참조변수 = new _09_Plastic();

		plasticP.getMaterial();
		
		System.out.println(plasticP);
		
		_09_Plastic plastic = plasticP.getMaterial();
		System.out.println(plastic);
		plastic.doPrinting();
		
		//_09_Plastic plastic = (_09_Plastic)_09_GenericPrinter ();
		
	}
	
}
