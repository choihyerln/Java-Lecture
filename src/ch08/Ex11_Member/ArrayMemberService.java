package ch08.Ex11_Member;

public class ArrayMemberService implements MemberService{
	
	private Member[] members = new Member[10];

	@Override
	public void register(String id, String password, String name) {
		Member member = findById(id);
		if (member != null) {
			System.out.println("id가 중복되었습니다.");
			return;
		}	
		member = new Member(id, password, name);
		for (int i=0; i<members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}
	}

	@Override
	public void printAllMembers() {
		for (Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}

	@Override
	public Member findById(String id) {
		for (Member member : members) {
			if (member == null) 
				break;
			if (id.equals(member.getId()))
				return member;
		}
		return null;
	}

	@Override
	public boolean login(String id, String password) {
		Member member = findById(id);
		if (member == null)
			return false;
		else {
			
		}
	}

	@Override
	public void logout(String id) {
	}

}
