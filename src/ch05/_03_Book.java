package ch05;

public class _03_Book {
				//멤버변수
				private String bookName;
				private String author;
			
				//디폴트 생성자
				public _03_Book( ) {
					System.out.println("디폴트 생성자 입니다.");
				}
				
				//매개변수 생성자
				public _03_Book(String bookName, String author) {
					this.bookName=bookName;
					this.author=author;
				}
		
				//멤버메소드(setter/getter)
				public void setBookName(String bookName) {
					this.bookName=bookName;
				}
				
				public String getBookName() {
					return bookName;
				}
				
				public void setAuthor(String author) {
					this.author=author;
				}
				
				public String getAuthor() {
					return  author;
				}
				
				//showbookInfo
		
				public void showBookInfo() {
					System.out.println(" 책 이름 :  " + bookName );
					System.out.print(" 책 저자 : " + author);
				
				}
}
		
