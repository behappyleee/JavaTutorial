package ch08;

import java.util.ArrayList;

import ch08._04_Member;

public class _04_MemberArrayList {
	
			private ArrayList<_04_Member> arrayList;
			
			public _04_MemberArrayList() {
				arrayList = new ArrayList<_04_Member>();
			}
		
			public void  addMember( _04_Member member ) {
				arrayList.add(member);
			}
			
			public boolean removeMember(int memberId) {
					for(int i=0; i<arrayList.size();   i++ ) {
						_04_Member member = arrayList.get(i);
						int tempId = member.getMemberId();
						if(tempId == member.getMemberId()) {
							arrayList.remove(i);
							return true;
						}
					}
					System.out.println(memberId + "가 존재하지 않습니다.");
					return false;
			}
			
			
			public void showAllMember() {
				for(_04_Member member : arrayList) {
					System.out.println(member);
				}
				System.out.println( );
				}
			
	
}
