package app07;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class TestUserRepo {
	private UserRepo repo;

	@Before
	public void setup() {
		repo = UserRepo.getInstance();
	}

	@Test
	public void testFind() {
		User user = new User("admin", "admin");
		User find = repo.findUser(user);

		assertEquals(user, find);
	}

	@Test
	public void testFind2() {
		User user = new User("nonexist", "nonexist");
		User find = repo.findUser(user);

		assertNull(find);
	}

	@Test
	public void testInsert() {
		User user = new User("newuser2", "newuser2");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");) {
			conn.setAutoCommit(false);
			int result = repo.InsertUser(user, conn);
			assertEquals(1, result);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCount() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");) {
			boolean result = repo.existId("admin", conn);

			assertTrue(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
