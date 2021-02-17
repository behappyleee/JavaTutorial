//싱글톤
package test;

	public  class _14_Student {
	
			String studentID;
			String name;
			String address;
		
			private _14_Student(){
			System.out.println("기본 생성자");
			}
		
			private static _14_Student instance = new _14_Student();
		
			public static _14_Student getInstance() {   //static 미 입력
				if(instance==null) {
				instance = new _14_Student();
				}
				return instance;
			}

			public void setStudentID(String studentID){
			this.studentID=studentID;
			}
		
			public String getStudentID(){
			return this.studentID;
			}
		
			public void setName(String name){
			this.name=name;
			}
		
			public String getName(){
			return this.name;
			}
		
			public void setAddress(String address){
			this.address=address;
			}
		
			public String getAddress(){
			return this.address;
			}
		
			public void printInfo(){
			System.out.println("학번 : " + studentID +"\n이름 : " + name + "\n주소 : " + address);    //studentID 오타발생
			}

}

