package ch10;
import java.util.Scanner;

public class _09_Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//readMemberInfo(); //한번에 호출 정상이면 showMemberInfo() 프린터출력 	
		//if( info.age < 0 || info.name.length() < 2) {
			try {
				_09_MemberInfo mems = readMemberInfo(); //호출의 의미
				mems.showInfo();
			} catch (_09_InvalidNameException e) {
				System.out.println( e.getMessage() );
			} catch (_09_InvalidAgeException e) {
				System.out.println( e.getMessage() );
			}	finally {
					input.close();
				System.out.println("finally 문장 ");
			}
							
}
	
	static _09_MemberInfo readMemberInfo() throws _09_InvalidNameException, _09_InvalidAgeException {
		String name =readName(); 
		int age = readAge();
		_09_MemberInfo member = new _09_MemberInfo(name, age);
		return member;
	}
	
	
	static String readName ( ) throws _09_InvalidNameException {
		System.out.print("이름을 입력하세요 : ");
		String name = input.next();
		if(name.length() < 2 ) {
			_09_InvalidNameException in =new _09_InvalidNameException();
			in.setWrongName(name);
			throw new _09_InvalidNameException ("이름은 두 글자 이상이어야 합니다. "); //강제 예외 발생 
		}
		return name;
	}
	
	
	static int readAge() throws _09_InvalidAgeException {
		System.out.print("나이를 입력 하세요 : ");
		int age = input.nextInt();
		if(age  < 0 ) {
			_09_InvalidAgeException to = new _09_InvalidAgeException ();
			to.setAge(age);
			throw new _09_InvalidAgeException ("나이는 양수이야 합니다.");   //강제 예외발생
		} 
		return age;
	}
	
	
	
	
	
}
