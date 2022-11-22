package mysql.erd.bbs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BoardDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	BoardDAO() {
		try {
			InputStream is = new FileInputStream("/Users/choihyerin/eclipse-workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void deleteBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "DELETE FROM board WHERE bid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "UPDATE board SET btitle=?, bcontent=?, uid=?, modTime=NOW(), viewCount=?, replyCount=?"
				+ "	WHERE bid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, b.getBtitle());
			pStmt.setString(2, b.getBcontent());
			pStmt.setString(3, b.getUid());
			pStmt.setInt(4, b.getViewCount());
			pStmt.setInt(5, b.getReplyCount());
			pStmt.setInt(6, b.getBid());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Board getBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board WHERE bid=?;";
		Board b = new Board();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public List<Board> listBoard() {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board ORDER BY bid DESC;";
		List<Board> list = new ArrayList<>();
		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Board b = new Board();
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
				list.add(b);
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO board(btitle, bcontent, uid) VALUES(?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, b.getBtitle());
			pStmt.setString(2, b.getBcontent());
			pStmt.setString(3, b.getUid());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}