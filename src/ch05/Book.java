package ch05;

public class Book {
		
		private String bookName;
		private String author;
		
		public void Book( ) {
			System.out.println("디폴트 입니다.");
		};
		
		public void Book(String bookName, String author) {
			this.bookName=bookName;
			this.author=author;
		}
	
		public void setBookName(String name) {
			this.bookName=name;
		}
	
		public String getBookName() {
			return bookName;
		}
	
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void showBookInfo() {
			System.out.println("제목 : " + bookName + "  저자 : ");
			
		}
}
