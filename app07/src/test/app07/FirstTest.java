package app07;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class FirstTest {
	@Test
	public void testValue() {
		int value = 10;

		assertEquals(10, value);
	}

	@Test
	public void testNotNull() {
		Object o = new Object();

		assertNotNull(o);
	}

	@Test
	public void testConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn = DBCPInit.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT 1")) {
			if (rs.next()) {
//				System.out.println("커넥션 확인: " + (rs.getInt(1) == 1));
				assertEquals(1, rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
