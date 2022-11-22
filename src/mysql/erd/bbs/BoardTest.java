package mysql.erd.bbs;

import java.time.LocalDateTime;
import java.util.List;

public class BoardTest {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		
		Board board = dao.getBoard(1);
		board.setBtitle("첫번째 글");
		board.setBcontent("첫번째 글 입니다.");
		board.setViewCount(0);
		dao.updateBoard(board);
		
		List<Board> list = dao.listBoard();
		for (Board b: list)
			System.out.println(b);
//		System.out.println(LocalDateTime.parse("2022-11-21 17:10:09".replace(" ", "T")));
//		System.out.println(LocalDateTime.parse("2022-11-21 17:10:09"));
	}
}