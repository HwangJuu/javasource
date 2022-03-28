package member.util;

import java.util.List;
import java.util.Scanner;

import member.dto.MemberDTO;

public class ConsoleUtil {
	
	public MemberDTO getNewMember(Scanner sc) {
		System.out.println("member 정보 입력");
		System.out.println("=====================");	
		System.out.print("1. id >> ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("2. name >> ");
		String name = sc.nextLine();
		System.out.print("3. addr >> ");
		String addr = sc.nextLine();
		System.out.print("4. email >> ");
		String email = sc.nextLine();
		System.out.print("5. age >> ");
		int age = Integer.parseInt(sc.nextLine());
		
		return new MemberDTO(id, name, addr, email, age);		
	}
	
	public void printAddSuccessMessage() {
		System.out.println("회원정보 추가 성공");
	}
	public void printAddFailMessage() {
		System.out.println("회원정보 추가 실패");
	}
	
	
	//list 출력 메소드
	public void printListMessage(List<MemberDTO> list) {
		System.out.println();
		System.out.println("****** member List ******");
		System.out.println("----------------------------------");
		System.out.println("id\tname\taddr\temail\tage");
		System.out.println("----------------------------------");
		
		for(MemberDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%d\n",dto.getId(),dto.getName(),
					dto.getAddr(),dto.getEmail(),dto.getAge());
		}
		System.out.println();
	}
	//수정
	public int printModifyIdMessage(Scanner sc) {
		System.out.println("아이디 입력");
		System.out.println(">> ");
		int id = Integer.parseInt(sc.nextLine());		
		return id;
	}	
		
	public int printModifyMessage(Scanner sc) {
		System.out.println("--- 수정항목 선택 ---");
		System.out.println("1. 주소");
		System.out.println("2. 이메일");
		System.out.println(">> ");
		
		int no = Integer.parseInt(sc.nextLine());
		return no;
		
	}
	
	public String printModifyValueMessage(Scanner sc) {
		System.out.println("수정 내용 입력");
		System.out.println(">> ");
		String input = sc.nextLine();
		return input;	
		
	}
	public void printModifySuccessMessange() {
		System.out.println("수정 성공");
	}
	public void printModifyFailMessange() {
		System.out.println("수정 실패");
	}
	
	//삭제
	public int pintRemoveMessage(Scanner sc) {
		System.out.println("삭제할 아이디 정보 입력");
		System.out.println(">> ");
		return Integer.parseInt(sc.nextLine()); //3 엔터
		
	}
	public void printRemoveSuccessMessange() {
		System.out.println("삭제 성공");
	}
	public void printRemoveFailMessange() {
		System.out.println("삭제 실패");
	}
	
}

