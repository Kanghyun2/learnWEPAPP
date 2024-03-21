package app07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserService {
	private UserRepo repo;

	public UserService() {
		repo = UserRepo.getInstance();
	}

	public User findUser(User user) {
		return repo.findUser(user);
	}

	public int insertUser(User user) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			// 커넥션 제어 && 트랜잭션 제어
			conn.setAutoCommit(false);
			// 중복 확인 후,
			boolean exist = repo.existId(user.getId(), conn);
			// 행 추가
			if (!exist) {
				int result = repo.InsertUser(user, conn);
				conn.commit();
				return result;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}
}
