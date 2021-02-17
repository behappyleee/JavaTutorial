package ch08;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayList {
		public static void main(String[] args) {
	/*
	 *   검색 : list.indexOf(검색할 값);  //중요
	 *	   리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서  그 위치의 인데스를 리턴 	 	
	 *    검색할 값과 일치한 데이터가없으면 -1을 리턴한다
	 *		
	 *	 list.lastOfIndex(검색할 값); ==> 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴 
	 *
	 *		
	 */
	
		  List <String> list = new ArrayList <String>();
		  list.add(" H ");   //0번째
		  list.add(" O ");
		  list.add(" N ");
		  list.add(" G ");
		  list.add(" G ");
		  list.add(" I " );
		  list.add(" L ");
		  list.add(" D ");
		  list.add(" O ");
		  list.add(" N ");
		  list.add(" G ");  //10번째
	
		  //일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		  System.out.println("G문자의 인덱스" +list.indexOf(" G ") );//3
		  System.out.println("N문자의 인덱스" +list.indexOf(" G ") );
		  System.out.println("G문자의 마지막 인덱스 : "+ list);
		  System.out.println("Z문자의 마지막 인덱스 : "+list.lastIndexOf(" G ")  ); //10
		  System.out.println("Z문자의 마지막 인덱스 : "+ list.indexOf(" Z" ));// -1검색할 값 없으면 -1출력
		  
		  //향상된 for문
		  System.out.print(list + "   ");
		  System.out.println();
		  for(String str : list) {
			  System.out.print(str + "  ");
		  }
		  System.out.println();
		  
		  //리스트  삭제
		  list.clear();   //==> clear는완전 list를 삭제하는것임 remove는 해당 인덱스의 값을 제거
		  System.out.println("리스트  삭제 후 ");
		  System.out.println("list : " + list );    //list : [ ] 리스트가 삭제되었음 
		  
		}

}
