package db_과제2_최혜린;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import java_과제1_최혜린.*;

public class EmployeeDAO {
	public class DAO {
		private String host;
		private String user;
		private String password;
		private String database;
		private String port;
		
	DAO() {
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
	
	// 2.1
	public void createTables() { 
		Connection conn = myGetConnection();
		String sql = "CREATE TABLE employee (\n"
				+ "  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
				+ "  name varchar(4) NOT NULL,\n"
				+ "  position varchar(4) NOT NULL,\n"
				+ "  joinDate datetime,\n"
				+ ");";
		
		Set<Employee> hs = new HashSet<>();
		try {
			Statement stmt = conn.createStatement();
			
			boolean b = stmt.execute(sql);
			System.out.println("b=" + b);
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2.2
	public void insertEmployee(Employee emp) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO Employee(id, name, position, joinDate) VALUES(?, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, emp.getId());
			pStmt.setString(2, emp.getName());
			pStmt.setString(3, emp.getPosition());
			pStmt.setString(4, emp.getJoinDate().toString());

			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	//2.3
	public void printAllEmployee() {
		Connection conn = myGetConnection();
		List<Employee> list = new ArrayList<>();
		String sql = "SELECT * FROM employee ORDER BY joinDate;";
	
		}
	}
}