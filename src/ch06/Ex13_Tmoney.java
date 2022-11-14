package ch06;
/*
 *  Tmoney card
 *  
 *   - 10,000원 충전된 카드 구매
 *   - 1회 요금 1,350원씩 빠져나감
 *   - 금액이 -가 되면 안된다. (잔액이 1,000원이라고 하면 사용할 수 없음)
 *   - 금액을 재충전 해야된다.
 */

public class Ex13_Tmoney {

	public static void main(String[] args) {
		
		Tmoney card = new Tmoney(10000);
		while (true) {
			if(!card.ride())
				break;
			System.out.println(card.cash);
		}
		card.charge(10000);
		while (true) {
			if(!card.ride())
				break;
			System.out.println(card.cash);
		}
	}

}

class Tmoney {
	int cash;			// 필드에 적혀있는 것의 초기값은 배열처럼 초기화 값이 0이다. 다른건 초기값 없음..
	
	Tmoney(int cash){
		this.cash = cash;
	}
	boolean ride() {
		if (this.cash >= 1350) {
			this.cash -= 1350;
			return true;
		}
		return false;
	}
	
	void charge(int cash) {
		this.cash += cash;
	}
}
