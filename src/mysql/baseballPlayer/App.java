package mysql.baseballPlayer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);
	private static DAO dao = new DAO();
	
	/* 초기 화면 */
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.선수 목록 | 2.선수 등록 | 3.선수정보 수정 | 4.선수 방출 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
	 
			case 1:
				listPlayers(); break;
			case 2:
				registerPlayer(); break;
			case 3:
				updatePlayer(); break;
			case 4:
				deletePlayer(); break;
			case 5:{
				run = false; break;
			}
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}

	public static void listPlayers() {
		List<Player> list = dao.getPlayers();
		for (Player p: list)
			System.out.println(p);
	}
	/* 선수 등록 */
	public static void registerPlayer() {
		int bNum;
		while (true) {
			System.out.print("선수 등번호> ");
			bNum = Integer.parseInt(scan.nextLine());
			Player p = dao.getPlayer(bNum);
			if (p.getName() == null)
				break;
			System.out.println("이미 사용중인 등번호입니다. 다시 입력하세요.");
		}
		System.out.print("이름> ");
		String name = scan.nextLine();
		System.out.print("포지션> ");
		String position = scan.nextLine();
		System.out.print("생년월일> ");
		String birthDate = scan.nextLine();
		System.out.print("신장> ");
		int height = Integer.parseInt(scan.nextLine());
		
		Player np = new Player(bNum, name, position, LocalDate.parse(birthDate), height);
		dao.insertPlayer(np);
		System.out.println("선수 등록이 완료되었습니다.");
	}
	
	/* 선수 정보 수정 */
	public static void updatePlayer() {
		System.out.print("선수 등번호> ");
		int bNum = Integer.parseInt(scan.nextLine());
		Player p = dao.getPlayer(bNum);
		
		System.out.print("이름(" + p.getName() + ")> ");
		String name = scan.nextLine();
		name = (name.length() == 0) ? p.getName() : name;	// Enter를 치면 기존 값을 변경하지 않음
		
		System.out.print("포지션(" + p.getName() + ")> ");
		String position = scan.nextLine();
		position = (position.length() == 0) ? p.getPosition().toString() : position;
		
		System.out.print("생년월일(" + p.getBirthDate().toString() + ")> ");
		String birthDate = scan.nextLine();
		birthDate = (birthDate.length() == 0) ? p.getBirthDate().toString() : birthDate;
	
		System.out.print("신장(" + p.getName() + ")> ");
		String h = scan.nextLine();
		int height = (h.length() == 0) ? p.getHeight() : Integer.parseInt(h);
		
		p = new Player(bNum, name, position, LocalDate.parse(birthDate), height);
		dao.updatePlayer(p);
		System.out.println("선수 정보 수정이 완료되었습니다.");
	}
	
	/* 선수 방출 */
	public static void deletePlayer() {
		System.out.print("선수 등번호> ");
		int bNum = Integer.parseInt(scan.nextLine());
		dao.deletePlayer(bNum);
		System.out.println("선수 탈퇴가 완료되었습니다.");
	}
	
}
