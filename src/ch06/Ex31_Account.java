package ch06;

public class Ex31_Account {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		// 내 account의 total balance가 0이상 100만원 이하
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
		this.balance += balance;
		
		// 매개변수 balance가 0이상 100만원 이하
//		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
//		this.balance = balance;
	}


}
