package test;

public class _21_Book {
	//Entry를 이용하여 책정보 4건입력, 1건 수정, 1건 삭제
	
	private String bookNo;
	private String bookName;
	private String author;

	public _21_Book () {}

	public _21_Book(String bookNo, String bookName, String  authror) {
	this.bookNo = bookNo;
	this.bookName = bookName;
	this.author=author;
	}

	public void setBookNo(String bookNo){
	this.bookNo= bookNo;
	}

	public String getBookNo(){
	return this.bookNo;
	}

	public void setBookName(String bookName){
	this.bookName=bookName;
	}

	public String getBookName(){
	return this.bookName;
	}

	public void setAuthor(String author){
	this.author=author;
	}

	public String getAuthor(){
	return this.author;
	}

	public void showInfo() {
	System.out.print("책 번호 : " + bookNo + "책 이름 : " + bookName + "책 저자 : " + author);
	}


}