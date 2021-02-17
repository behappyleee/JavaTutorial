package ch10;

public class _01_ArrayException {
	
	public static void main(String[] args) {
		/*
		 * [면접]
		 * 예외 처리 목적 : 예외가 발생하더라도 정상종료 목적
		 * 
		 * 	try {
		 *  	예외가 발생할 수 있는 코드 부분
		 * 	} catch(처리할 예외타입 e) {
		 * 	 try 블록안에서 예외가 발생했을 때 예외를 처리하는 부분 	
		 * 	} finally {  ==> 반드시 수행됨 
		 * 	  예외가 발생하지 않으면 catch문은 수행되지 않지만 finally문은 항상 수행되는 부분.
		 *   주로 자원해제를 위한 close(); 문장이 온다.	  
		 * 	}
		 * 
		 */
		 int [] array = new int [5];
		 
		 try {   //정상 : try ==> finally , 예외발생 : try ==> catch ==> finally
			 for(int i = 0; i<=array.length; i++) {
				array[i]= i; 
				System.out.println(array[i]);  //0 ~ 4까지 출력
			 } 
		 } catch (ArrayIndexOutOfBoundsException e) {	// ArrayIndexOutOfBoundsException  ==> 자바에서 제공하여 주는 class 임 
			System.out.println("====== 예외 처리 부분 ======"); 	
			System.out.println(" e : " + e);   // e : java.lang.ArrayIndexOutOfBoundsException: 5
			e.printStackTrace();    		//순서는 쓰레드에의해 순서대로 나오지는 않음, 그냥 error 메세지만 보여줌 (제일 많은 정보 제공해줌)
			System.out.println("e.gettMessage() : " + e.getMessage() );  // ==> 보통이렇게 출력 ( e.getMessage() : 5)
		 } finally {    // 정상이던 예외이던 무조건 finally 부문은 수행되어짐 (주로 close일때 사용되어짐) 
			 System.out.println("====== finally 부분 ======");
			 System.out.println("Hello World !");
		 }
		System.out.println("정상종료");
		
	}
	
}
