package test;
import java.util.Map;
import java.util.HashMap;

public class _21_BookMain{
	
	public static void main (String [] args ) {
	//책 번호, 책 이름, 책 저자 
	Map <String  , _21_Book > map = new HashMap < > ();  //new 빼먹음

	map.put("M001",new _21_Book("1", "박경리","박경리") ); 
	map.put("M002",new _21_Book("2", "데미안","헤르만헤세") ); 
	map.put("M003",new _21_Book("3", "어린왕자","생텍쥐베리") ); 
	map.put("M004",new _21_Book("4", "사피엔스","유발하라리") ); 
	
	
	map.remove("M002");
	
	for(Map.Entry <String  , _21_Book > abc : map.entrySet()) {
		String key =abc.getKey();
		
		
		System.out.println(map);
	}
	

	}
	
	}

