package ch07;
//부모클래스
public class _07_CDInfo {
		//멤버변수
		private String registerNo;   //등록번호
		private String title;		 //타이틀
		
		//생성자
		public _07_CDInfo() {
		}
		
		public _07_CDInfo(String registerNo, String title) {
			this.registerNo=registerNo;
			this.title=title;
		}
		
		
		//멤버메소드
		public String getRegisterNo() {
			return this.registerNo;
		}

		
		public void setRegisterNo(String registerNo) {
			this.registerNo = registerNo;
		}

		
		public String getTitle() {
			return this.title;
		}

		
		public void setTitle(String title) {
			this.title = title;
		}
				

}
