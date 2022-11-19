package mysql.baseballPlayer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		DAO dao = new DAO();
		Player p1 = new Player(36, "김기훈", "투수", LocalDate.parse("1998-04-07"), 190);
		Player p2 = new Player(41, "남하준", "투수", LocalDate.parse("1996-09-13"), 182);
		Player p3 = new Player(37, "놀린", "투수", LocalDate.parse("1989-12-26"), 193);
		
		
		Player p4 = new Player(10, "박동원", "포수", LocalDate.parse("1990-04-07"), 178);
		Player p5 = new Player(042, "신명승", "포수", LocalDate.parse("2002-11-02"), 183);
		Player p6 = new Player(4, "한승택", "포수", LocalDate.parse("1994-06-21"), 174);
		
		
		Player p7 = new Player(5, "김도영", "내야수", LocalDate.parse("2003-10-02"), 183);
		Player p8 = new Player(8, "류지혁", "내야수", LocalDate.parse("1994-01-13"), 181);
		Player p9 = new Player(67, "윤도현", "내야수", LocalDate.parse("2003-05-07"), 181);
		
		Player p10 = new Player(27, "김호령", "외야수", LocalDate.parse("1992-04-30"), 178);
		Player p11 = new Player(47, "나성범", "외야수", LocalDate.parse("1989-10-03"), 183);
		Player p12 = new Player(30, "소크라테스", "외야수", LocalDate.parse("1992-09-06"), 188);
		
		System.out.println(p12);
		
		dao.insertPlayer(p1);
		dao.insertPlayer(p2);
		dao.insertPlayer(p3);
		dao.insertPlayer(p4);
		dao.insertPlayer(p5);
		dao.insertPlayer(p6);
		dao.insertPlayer(p7);
		dao.insertPlayer(p8);
		dao.insertPlayer(p9);
		dao.insertPlayer(p10);
		dao.insertPlayer(p11);
		dao.insertPlayer(p12);
	}

}
