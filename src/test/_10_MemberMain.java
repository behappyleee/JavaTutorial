package test;

public class _10_MemberMain {
		public static void main(String [] args) {
//멤버의 정보를 인스턴스 생성시 배열로 초기화 해서 출력
					
					_10_Member member1 = new _10_Member ( ) ;
					
					_10_Member [ ] member= new _10_Member [5];
				
					member [0] =new _10_Member("홍길동", 30 ,  "xxx@naver.com " , "강서구" , 3000000);
					member [1] =new _10_Member("김철수", 25 ,  "aaa@naver.com " , "강북구" , 2500000);
					member [2] =new _10_Member("이미지", 27 ,  "sss@naver.com  " , "마포구" , 2700000);
					member [3] =new _10_Member("이철수", 26 ,  "qqq@naver.com " , "강남구" , 2600000);
					member [4] =new _10_Member("김영희", 28 ,  "ccc@naver.com  " , "강북구" , 2900000);
				
					for(int i = 0; i < member.length ; i++) { // 맨 마지막 i++이아닌 ++로 작성
						member[i].printInfo();
					System.out.println(member[i]);
					System.out.println("=============================================" );
					}
			
		}

}