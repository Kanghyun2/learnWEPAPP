package app07;

import java.util.Objects;

public class User {
	private String id;
	private String pw;
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	private String role;

	public User(String id, String pw, String role) {
		super();
		this.id = id;
		this.pw = pw;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, pw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
}
