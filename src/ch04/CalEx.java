package ch04;
// 한 클래스 안에 2개 이상 클래스 생성시 Main 클래스 제외 public 사용 금지
public class CalEx{
			
			private String bookName;
			private String author;
			
			public CalEx () {
				System.out.println("디폴트 입니다.");
			}
			
			public CalEx(String bookName, String author) {
				this.bookName=bookName;
				this.author=author;
			}
	
			public void setBookName(String bookName) {
				this.bookName=bookName;
			}
			
			public String getBookName() {
				return this.bookName;
			}
		
			public void setAuthor(String author) {	
				this.author=author;
			}
				
			public String getAuthor() {
				return this.author;
			}
			
			public void printInfo() {
				System.out.println(bookName);
				System.out.println(author);
			}
			
}
		
	
	
	
	
	
	
	
	
	
	
	
