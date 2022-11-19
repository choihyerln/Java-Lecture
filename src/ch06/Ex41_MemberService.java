package ch06;

public class Ex41_MemberService {
	private Ex41_Member[] members = new Ex41_Member[10];
	
	void register(String id, String password, String name) {
		Ex41_Member member = findById(id);
			if (member != null) {	// 동일한 아이디가 이미 존재함
				System.out.println("이미 사용중인 id 입니다.");
				return;
			}
			member = new Ex41_Member(id, password, name);
			for (int i = 0; i < members.length; i++) {
				if (members[i] == null) {
					members[i] = member;
					break;
				}
			}
	}
	void printAllMembers() {
		for (Ex41_Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}

	Ex41_Member findById(String id) {
		for (Ex41_Member member : members) {
			if (member == null)		// id 에 해당하는 member를 못찾고 끝까지 간 경우
				break;
			if (id.equals(member.getId()))	// id에 해당하는 member를 찾은 경우
				return member;
		}
		return null;
	}

	boolean login(String id, String password) {
		Ex41_Member member = findById(id); // id에 해당하는 member가 없는 경우
		if (member == null) // id에 해당하는 member가 없는 경우
			return false;
		if (id.equals(member.getId()) && password.equals(member.getPassword()))
			return true;
		else {
			return false;
		}
	}

	void logout(String id) {
		Ex41_Member member = findById(id);
		System.out.println(member.getName() + "님 로그아웃 되셨습니다.");
	}
}