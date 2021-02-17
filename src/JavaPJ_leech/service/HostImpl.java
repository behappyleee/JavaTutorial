package JavaPJ_leech.service;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
//host 인터페이스 구현
import java.util.Scanner;

import JavaPJ_leech.domain.Cart;
import JavaPJ_leech.domain.Shoes;
import JavaPJ_leech.view.Console;
import JavaPJ_leech.view.MenuImpl;

public class HostImpl extends Shoes implements Host{
		
		GuestImpl guest;
		MenuImpl menu = new MenuImpl();
		Scanner input = new Scanner(System.in);
		int num =(int)(Math.random()*1000)+1000;
		
		
		//싱글톤
		private HostImpl() {}
			
		private static Host host = new HostImpl();
		
		public static  Host getInstance() {   // ==>직접 메소드생성public으로 getter생성
			if(host == null) { 
				host = new HostImpl();
			} else if (host != null) {
			} 
			return host; //주소값 리턴
		}
		
		@Override  //관리자 신발목록
		public void shoeslist() {
			System.out.println("===========신발목록=============");
			System.out.println("번호  브랜드   사이즈    가격    수량");
				for(int i =0; i<super.shoes.size(); i++) {
					System.out.println(super.shoes.get(i));
				}
			System.out.println("=============================");
			menu.hostStockMenu();
		}			

		@Override  //host 신발추가
		public void shoesAdd() {
			System.out.println("=============신발등록=============");
			super.setShoesCode((int)(Math.random()*1000)+1000); 
			System.out.print("브랜드: " ); 
			super.setShoesBrand(input.next());
			System.out.print("\n사이즈: "); 
			super.setShoesSize(input.nextInt());
			System.out.print("\n가격: ");   
			super.setShoesPrice(input.nextInt());
			System.out.print("\n수량: ");   
			super.setShoesCount(input.nextInt());
			Shoes sh = new Shoes(super.getShoesCode() , super.getShoesBrand(), super.getShoesSize() , super.getShoesPrice(), super.getShoesCount());
			super.shoes.add(sh);
			System.out.println("================================");
			System.out.println("=========추가 되었습니다===========");
			menu.hostStockMenu();
		}
		
		@Override   //관리자신발삭제  //삭제오류 여러개 등록시 밑에꺼 삭제시 같이 삭제되어버림 
		public void shoesDel() {
			System.out.println("===========신발목록=============");
			System.out.println("번호  브랜드   사이즈    가격    수량");
			for(int i =0; i<shoes.size(); i++) {
				System.out.println(super.shoes.get(i));
			}
			
			System.out.print("삭제 원하시는 번호를 입력하여 주세요: ");//여러개 등록 후 삭제시 원하는 번호가 삭제가 안됨 
			int key = input.nextInt();
			for(int i=0; i<super.shoes.size();i++ ) {
				key=super.shoes.get(i).getShoesCode();
				if(key == super.shoes.get(i).getShoesCode()) {
					super.shoes.remove(i);
					System.out.println("===========삭제 되었습니다.============");
					break;
				} else {
					System.out.println("번호를 잘못 입력하셨습니다.");
				}
			}
			menu.hostMenu();
		}	
			
		
		@Override  //신발수정
		public void shoesUpdate() {
			System.out.println("==============신발수정==================");
			System.out.println("===========신발목록=============");
			System.out.println("번호    브랜드     사이즈      가격      수량");
			for(int i =0; i<shoes.size(); i++) {
				System.out.println(super.shoes.get(i));
			}
			System.out.print("신발번호를 입력해주세요: ");
			int key = input.nextInt();
			for(int i=0; i<super.shoes.size(); i++) {
				key = super.shoes.get(i).getShoesCode();
				if(key==super.shoes.get(i).getShoesCode()) {
					super.shoes.remove(i+1);
					super.setShoesCode(num);
					System.out.print("브랜드: "); 
					super.setShoesBrand(input.next());
					System.out.print("\n사이즈: "); 
					super.setShoesSize(input.nextInt());
					System.out.print("\n가격: "); 
					super.setShoesPrice(input.nextInt());
					System.out.print("\n수량: "); 
					super.setShoesCount(input.nextInt());
					Shoes sb = new Shoes(super.getShoesCode(), super.getShoesBrand(), super.getShoesSize() , super.getShoesPrice() , super.getShoesCount());
					super.shoes.add(i+1, sb);   //set도 replace임 다시 확인해보기
					System.out.println("===============변경되었습니다.================");
					menu.hostMenu();
					break;
				} 
				menu.hostMenu();
			}
			
}

		@Override   //구매목록
		public void orderList() {
			System.out.println("==============주문목록=============");
			System.out.println("번호  브랜드   사이즈    가격    수량");
			for(int i=0; i<super.order.size(); i++) {
				System.out.println(super.order.get(i));
			}
			menu.hostMenu();
		}

		
		@Override
		public void orderConfirm() {
			System.out.println("===============결제승인=================");
			System.out.println("1.주문목록 2.결제승인 3.결제취소 4.결산 5.이전");
			System.out.println("======================================");
			int key=input.nextInt();
				if(key==2) {
					System.out.println("주문 확인되었습니다.");
				} else {
					
					switch(key) {
						
					case 1 : orderList(); 	
						break;
					case 3 : orderCancel();
						break;
					case 4 : saleTotal();
						break;
					case 5 : menu.hostMenu();
						break;
					}
				}
					
}

		@Override  //주문 취소 기능구현 (Host의 주문 취소)
		public void orderCancel() {
			System.out.println("==============결제취소================");
			for(int i=0; i<super.order.size(); i++) {
				super.order.get(i);
			}
			System.out.print("원하시는 번호를 입력해주세요: ");
			int key =input.nextInt();
				
			for(int i=0; i<super.order.size(); i++) {
				if(key==super.order.get(i).getShoesCode()) {
					super.order.remove(i);
					shoes.add(i, super.order.get(i));
					System.out.println("주문 취소 되었습니다.");
				}
			
			}
			
		}

		
		@Override   //TOTAL PRICE   //Guest 가 주문 한 총 주문 금액 합산하여 totalprice print 출력
		public void saleTotal() {  //결산방법구현 - guest가 시킨 총 주문금액 
			System.out.println("===============총결산================");
			System.out.print("결산: ") ;
			for(int i=0; i<super.order.size(); i++) {
				sum += order.get(i).getShoesPrice();
				System.out.println(sum);
			}
			menu.hostMenu();
		}
	
		
		
		
	
	
}
