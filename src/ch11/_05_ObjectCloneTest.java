package ch11;

public class _05_ObjectCloneTest {
//367page 수행 
	public static void main(String[] args) throws CloneNotSupportedException {
	
			_05_Circle circle = new _05_Circle(10, 20, 30);
			
			_05_Circle copycircle = (_05_Circle)circle.clone();  //다운캐스팅이유는 자식에만 있는 toString 사용하기 위하여서이다.
            	 
			System.out.println(circle);   //circle.toString() 생략 override해서 주소값출력이 아님
			System.out.println(copycircle); 
			
			System.out.println(System.identityHashCode(circle));
			
			System.out.println(System.identityHashCode(copycircle));
			//clone 할 시 멤버변수 값은 동일하고, 주소값이 다르다.
			//clone의 의미는 복제이며 새로운 공간(주소값)이 하나 더 생긴다 
			
			
			
		}
	
}
