package ch15_collection.question;

import java.util.ArrayList;
import java.util.List;

public class Q01ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Q01Board> list = dao.getBoardList();
		for (Q01Board board: list)
			System.out.println(board.getTitle() + "-" + board.getContent());
	}
}

class BoardDao {

	public List<Q01Board> getBoardList() {
		List<Q01Board> list = new ArrayList<>();
		list.add(new Q01Board("제목1", "내용1"));
		list.add(new Q01Board("제목2", "내용2"));
		list.add(new Q01Board("제목3", "내용3"));
		return list;	
	}
}