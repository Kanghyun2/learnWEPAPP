package app07.content;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app07.DBCPInit;

public class ContentRepo {
	public ContentRepo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public int write(Content content) {
		String sql = "INSERT INTO content (heading, text) VALUES (?, ?)";
		try (Connection conn = DBCPInit.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, content.getHeading());
			stmt.setString(2, content.getText());

			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Content> getAll() {
		String sql = "SELECT * FROM content";
		List<Content> list = new ArrayList<>();
		try (Connection conn = DBCPInit.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				int no = rs.getInt("no");
				String heading = rs.getString("heading");
				String text = rs.getString("text");

				list.add(new Content(no, heading, text));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int delete(int no) {
		String sql = "DELETE FROM content WHERE no = ?";
		try (Connection conn = DBCPInit.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, no);
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
