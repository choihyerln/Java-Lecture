package ch06;

public class Ex42_Memberservice {
	private Ex41_Member[] members = new Ex41_Member[10];
	
	void register(String id, String password, String name) {
		Ex41_Member member = new Ex41_Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null)
				members[i] = member;
			break;
				
		}
	}

}
