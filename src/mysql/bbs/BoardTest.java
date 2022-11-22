package mysql.bbs;

import java.time.LocalDateTime;
import java.util.List;

public class BoardTest {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		
		Board board = dao.getBoard(2);
		board.setBtitle("두번째 글");
		board.setBcontent("두번째 글 수정합니다.");
		board.setViewCount(1);
		dao.updateBoard(board);
		
		List<Board> list = dao.listBoard();
		for (Board b: list)
			System.out.println(b);
		System.out.println(LocalDateTime.parse("2022-11-21 17:10:09".replace(" ", "T")));
//		System.out.println(LocalDateTime.parse("2022-11-21 17:10:09"));
	}
}