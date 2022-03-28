package shop;

import java.util.Scanner;

public class MyShop implements IShop {
	
	
	private String title;
	private User users[] = new User[2];
	
	private Scanner sc = new Scanner(System.in);
	
	//계정 선택에서 선택한 사용자 정보 담기
	private int selUser;
	
//	private SmartTV smartTV[] = new SmartTV[2];
//	private CellPhone cellphone[] = new CellPhone[3];
	private Product[] products = new Product[5];
	private Product[] carts = new Product[10];//장바구니
	
	

	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		//User 객체를 이용해서 2명 생성
		//User 생성 후 배열에 담기
		users[0] = new User("홍길동",PayType.CARD);
		users[1] = new User("성춘향",PayType.CASH);
	}

	@Override
	public void genProduct() {
		//핸드폰 3개 생성, 스마트 TV 2개 생성
		products[0] = new CellPhone("갤럭시 노트11 ", 1500000, "SKT");
		products[1] = new CellPhone("아이폰 12 ", 1300000, "KT");
		products[2] = new CellPhone("아이폰 11 ", 900000, "LGU+");
		products[3] = new SmartTV("삼성울트라HD", 2500000, "4K");
		products[4] = new SmartTV("LG스마트 ", 1400000, "1080p");		

	}

	@Override
	public void start() {
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("============================");
		//향상된 for문
		int i=0;
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n", i++,user.getName(),user.getPayType());
		}
//		for(int i=0;i<users.length;i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());
//		}
		System.out.println("[x] 종료");
		System.out.print("선택 : ");
		String input = sc.nextLine();
		
		// input : 0,1,x
		// switch
		switch(input) {
		case"0": case"1":
			System.out.println("### " + input+" 선택 ###"); //user가 선택되는 부분
			
			selUser = Integer.parseInt(input); //사용자 정보 담아 놓는 부분
		
		//System.out.println("### " + input + " 선택 ###");
		
			
			// 0,1 =>위 출력문 보여주고, productList()호출
		productList();
		break;
		
		
		case "x": case "X":
		// x(X) => 프로그램 종료
		System.out.println("프로그램 종료합니다.");
	 	break;
	 	
	 	default : 
	 		System.out.println("입력값을 확인해주세요");
	 		start();
	 		break;
		// 다른게 입력되면  => 입력값을 확인해 주세요
		//                계정선택 화면 보여주기
	 		
		}
		
		
		
	}
	public void productList() {//상품목록 띄우기
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("============================");
		
		int i=0;
		for(Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}

		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String input = sc.nextLine();
		
		
		switch (input) {
		case "0": case "1":case "2":case "3":case "4": //0~4장바구니 담고 다시 한번 목록 화면 보여주기
		
			for(int j=0;j<carts.length;j++) {
				if(carts[j] == null) {
					carts[j] =products[Integer.parseInt(input)];
					break;
				}
			}
				productList();	
			break;
		case "h": case "H": //start()호출
			start();
			break;
		case "c": case "C"://checkOut()호출
			checkOut();
			break;

		default : //productList()호출
	 		System.out.println("입력값을 확인해주세요");
	 		productList();
	 		break;
		}
	}
				
	
	

	//input : 0~4 상품, h : 계정 선택, c : 체크아웃(checkOut 호출)
	//        0~4 상품 : 장바구니에 담고 다시 한번 상품 목록 보여주기
	public void checkOut() {		
		System.out.println(title + " : 체크아웃");
		System.out.println("============================");
		
		int i=0;
		int sum=0;
		for(Product p:carts) {
			if(p!=null) {
				System.out.printf("[%d] %s(%d)\n",i++,p.getName(),p.getPrice());
				sum +=p.getPrice();
			}			
		}		
		System.out.println("============================");		
		System.out.println("결제방법 : "+ users[selUser].getPayType());
		System.out.println("합계 : "+sum +" 원 입니다.");
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String input = sc.nextLine();	
		
		
		//input : p,q
		//p : 이전화면 productList()
		//q : 결제가 완료되었습니다. 감사합니다.
		
		
		switch (input) {
		case "p":
			productList();			
			break;
		case "q":
			System.out.println("결제가 완료되었습니다. 감사합니다.");		
			break;
		default:
			checkOut();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
