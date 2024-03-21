package app07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn 
				= DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT 1")) {
			if (rs.next()) {
				System.out.println("커넥션 확인: " + (rs.getInt(1) == 1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
