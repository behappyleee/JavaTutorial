package ch08;

import java.util.Iterator;
import java.util.ArrayList;


public class _03_ArrayListEx {

			public static void main(String [ ] args) {
				
				ArrayList <_03_Book> book = new ArrayList<_03_Book> ( );
				
				book.add(new _03_Book ("태백산맥", "조정래") );
				book.add(new _03_Book ("데미안",  "헤르만헤세") );
				book.add(new _03_Book ("어떻게 살것인가",  "유시민") );
				book.add(new _03_Book ("토지",  "박경리") );
				book.add(new _03_Book ("어린왕자", "생텍쥐베리") );
				_03_Book is = new _03_Book("무정","이광수");
				book.add(is);   //is에 주소값을 담음 왼쪽 오른쪽 똑같으니 왼쪽오른쪽 둘다주어도 가능 is는 오른쪽 주소값을가짐 호출 가능 
				//for문 출력 
				
				for(int i=0; i<book.size(); i++) {
					_03_Book  library =book.get(i);
					library.showBookInfo();
				}
				System.out.println();
				System.out.println("=========향상된for문===========");
			
				//향상된 for
				
				for(_03_Book abc : book) {
					abc.showBookInfo();
				}
			
				System.out.println();
				System.out.println("==========Iterator문=========");
					
				Iterator iterator = book.iterator();
				
				while( iterator.hasNext() ) {
					_03_Book star = (_03_Book)iterator.next();
					star.showBookInfo();
				}
				
				}

}


