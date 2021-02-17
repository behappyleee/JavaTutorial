package JavaPJ_leech.view;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import JavaPJ_leech.domain.*;
import JavaPJ_leech.service.Guest;
import JavaPJ_leech.service.GuestImpl;
import JavaPJ_leech.service.Host;
import JavaPJ_leech.service.HostImpl;

public class MenuImpl implements Menu, Code{
	static int CODE;
	HashMap <String , String> log = new HashMap<> (); //ID와 PWD를 답는 HashMap 
	Scanner input = new Scanner(System.in);
	String ID;
	String PWD;
	int key;
	HostImpl host;
	GuestImpl guest;
	static int passCode = 0;
	public MenuImpl() {}
	
	@Override //login 메뉴 구현하기 
	public void loginMenu() {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("================LOG IN=================");
		System.out.println("1.고객    2.관리자    3.회원가입     4.종료");
		System.out.println("=======================================");
		System.out.print("메뉴 번호를 입력하세요: ");
		key=input.nextInt();
		//SHOP_LOGIN =999;   
		if(key==1) {
			System.out.print("고객ID: ");
			ID=input.next();
			System.out.print("고객PWD: ");
			PWD=input.next();
			if( log.containsKey(ID) && log.containsValue(PWD) ) { //회원가입때 가입한 hash맵에 로그인 정보가 담긴걸로 이용
				System.out.println("로그인 되었습니다.");
				guestMenu();
			} else if ( log.containsKey(ID) && !log.containsValue(PWD) ){
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (!log.containsKey(ID) && log.containsValue(PWD) ) {
				System.out.println("아이디가 틀렸습니다.");
			} else {
				System.out.println("ID와 PWD를 확인해주세요.");
			}
		} else if(key==2) {
			System.out.print("관리자ID: ");
			ID=input.next();
			System.out.print("관리자PWD: ");
			PWD=input.next();
			if(ID.equals(Host.ID) && PWD.equals(Host.PASSWORD)) {
				System.out.println("로그인 되었습니다.");
				hostMenu();
			} else if ( ID.equals(Host.ID) && !PWD.equals(Host.PASSWORD) ) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (!ID.equals(Host.ID) && PWD.equals(Host.PASSWORD) ) {
				System.out.println("아이디가 틀렸습니다.");
			} else {
				System.out.println("ID와 PW를 확인해 주세요.");
			}
			
		} else if(key==3) {
			System.out.println("====================================");
			System.out.println("===============회원가입===============");
			System.out.print("ID: ");
			String ID = input.next();
			System.out.print("PWD: ");
			String PWD = input.next();
			log.put(ID, PWD);  //ID와 비밀번호 LOG에 HashMap에 담기
			System.out.println("=============회원가입 완료=============");
		}
		
}
	
	@Override //SHOES_LIST = 111;
	public void hostMenu() {
		System.out.println("===============관리자 메뉴=================");
		System.out.println("1.재고관리        2.주문관리       3.로그아웃 ");
		System.out.println("========================================");
		System.out.print("원하시는 번호를 선택하여 주십시오: ");
			int key = input.nextInt();	
			switch(key) {
			case 1 : hostStockMenu(); //상수 HOST_STOCK_MENU 110
				break;
			case 2 : hostOrderMenu(); //상수 HOST_ORDER_MENU 120
				break;
			case 3 : System.out.println("종료 되었습니다.");	
				break;
			}
			
			
	}			
			
		
	
	@Override
	public void hostStockMenu() {
		System.out.println("===============재고관리 메뉴================");
		System.out.println("1.목록    2.추가    3.수정    4.삭제    5.이전");
		System.out.println("========================================");
		System.out.print("메뉴 번호를 입력하세요: ");
		int key = input.nextInt(); //key는 random 함수로 고치기 
			
			if(key == 1) {
				host.getInstance().shoeslist();
			}else{ 
				
				switch(key) {
				
				case 2 : host.getInstance().shoesAdd();
					break;
				case 3 : host.getInstance().shoesUpdate();
					break;
				case 4 : host.getInstance().shoesDel();
					break;
				case 5 : hostMenu();
					break;
				
				}
				
			}		
					
}
	
	
	@Override
	public void hostOrderMenu() {
		System.out.println("===============고객주문메뉴===============");
		System.out.println("1.주문목록 2.결제승인 3.결제취소 4.결산 5.이전");
		System.out.println("=======================================");
		System.out.print("원하시는 번호를 입력하세요 : ");
		int key=input.nextInt();
		
			switch(key) {
			case 1 : host.getInstance().orderList();
				break;
			case 2 : host.getInstance().orderConfirm();	
				break;
			case 3 : host.getInstance().orderCancel();
				break;
			case 4 : host.getInstance().saleTotal();
				break;
			case 5 : hostMenu();
			}
		
	}
	
	@Override
	public void guestMenu() {
		System.out.println("==================고객메뉴=================");
		System.out.println("1.장바구니   2.구매     3.환불      4.로그아웃");
		System.out.println("=========================================");
		System.out.print("원하시는 번호를 입력하세요: ");
		int key=input.nextInt();
			if(key==4) {
				System.out.println("종료 되었습니다.");
			} 
			else
			{
				switch(key) {
				
				case 1 : guest.getInstance().cartList();
					break;
				case 2 : guest.getInstance().nowBuy();
					break;
				case 3 : guest.getInstance().refund();
					break;
				}
				
			}
		
	}

	
	@Override  //guest카트메뉴
	public void guestCartMenu() {
		System.out.println("===============장바구니 목록=================");
		System.out.println("1.추가       2.삭제        3.구매      4.이전 ");
		System.out.println("=========================================");
		System.out.print("번호를 입력하세요: ");
		int key = input.nextInt();
		
			switch(key) {
			case 1 : guest.getInstance().cartAdd();
				break;
			case 2 : guest.getInstance().cartDel();
				break;
			case 3 : guest.getInstance().cartBuy();
				break;
			case 4 : guestMenu();
				break;
			}
		
	
	}
}
