package test;

public class _18_CDInfo {

				private String registerNo;   //등록번호
				private String title;		 //타이틀
			
				public _18_CDInfo ( ){ }
			
				public _18_CDInfo(String registerNo, String title){
					this.registerNo=registerNo;
					this.title=title;	
				}
			
				public void setRegisterNo(String registerNo){
					this.registerNo=registerNo;
				}
			
				public String getRegisterNo(){
					return this.registerNo;
				}
			
				public void setTitle(String title){
					this.title=title;
				}
			
				public String getTitle(){
					return this.title;
				}

}