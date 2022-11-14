package ch15_collection.question;

public class Q01Board {
	private String title;
	private String content;
	public Q01Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + "]";
	}
}
