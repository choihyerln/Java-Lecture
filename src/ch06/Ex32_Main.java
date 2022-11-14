package ch06;

import java.util.Scanner;

public class Ex32_Main {
	private static Ex32_Account[] accountArray = new Ex32_Account[100];
	private static Scanner scan = new Scanner(System.in);
	private static int index = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if (selectNo == 1) {
				createAccount();
			}
			else if (selectNo == 2) {
				accountList();
			}
			else if (selectNo == 3) {
				deposit();
			}
			else if (selectNo == 4) {
				withdraw();
			}
			else if (selectNo == 5) {
				run = false;
			}
			else
				System.out.println("Warning : 1에서 5까지의 숫자만 입력하세요.");
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌생성하기
	private static void createAccount() {
		
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		
		String ano = (1001 + index) + "";
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		
		accountArray[index++] = new Ex32_Account(ano, owner, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	// 계좌목록보기
	private static void accountList() {
		
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		
		for (int i=0; i<index; i++) {
			System.out.printf("%8s", accountArray[i].getAno());
			System.out.printf("%8s", accountArray[i].getOwner());
			System.out.printf("%12d%n", accountArray[i].getBalance());

		}
		
	}
	
	// 예금하기
	private static void deposit() {
		
		System.out.println("------------");
		System.out.println("입금");
		System.out.println("------------");
		
		System.out.print("계좌번호> ");
		String ano = scan.nextLine();
		System.out.print("입금액> ");
		int amount = Integer.parseInt(scan.nextLine());
		Ex32_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.> ");
			return;
		}
		
		account.setBalance(account.getBalance() + amount);
		System.out.println("입금이 완료되었습니다.");
		
	}
	
	// 출금하기
	private static void withdraw() {
		
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		
		System.out.print("계좌번호> ");
		String ano = scan.nextLine();
		System.out.print("출금액> ");
		int amount = Integer.parseInt(scan.nextLine());
		Ex32_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		
		int balance = account.getBalance() - amount;
		if(balance >= 0) {
			account.setBalance(balance);
			System.out.println("출금이 완료되었습니다.");
		}
		else
			System.out.println("잔액이 부족합니다.");
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Ex32_Account findAccount(String ano) {
		
		for (Ex32_Account acc : accountArray) {
			if (acc == null)
				break;
			if (ano.equals(acc.getAno()))
				return acc;
		}
		return null;		
		}
			
	}

