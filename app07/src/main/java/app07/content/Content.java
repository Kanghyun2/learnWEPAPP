package app07.content;

import java.util.Objects;

public class Content {
	private int no;
	private String heading;
	private String text;
	public Content(String heading, String text) {
		super();
		this.heading = heading;
		this.text = text;
	}
	public Content(int no, String heading, String text) {
		super();
		this.no = no;
		this.heading = heading;
		this.text = text;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Content [no=" + no + ", heading=" + heading + ", text=" + text + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Content other = (Content) obj;
		return no == other.no;
	}
}
