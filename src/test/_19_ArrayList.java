package test;

import java.util.ArrayList;

public class _19_ArrayList {

					ArrayList <_19_Member> arrayList ;
				
					public _19_ArrayList () {
					arrayList = new ArrayList <_19_Member> ( );
					}
				
					public void addMember(_19_Member member) {
					arrayList.add(member);
					}
				
					public boolean removeMember(int memberId) {  //문법실수
					
						for(int i =0; i<arrayList.size(); i++) {
							_19_Member mems = arrayList.get(i);
							int tempId=mems.getMemberId();
							if(tempId == mems.getMemberId() ) {
								arrayList.remove(i);
								return true;
							}
						}
							System.out.println(memberId +" 가 존재하지 않습니다.");
							return false;
						}
						
						
						public void showAllMember() {
							for(_19_Member mems : arrayList){
								System.out.println(mems);
							}		
						}

}