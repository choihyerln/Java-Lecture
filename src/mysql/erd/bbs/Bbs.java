package mysql.erd.bbs;

import java.time.LocalDateTime;

public class Bbs {
	private int bid;
	private String btitle;
	private String uname;
	private LocalDateTime modTime;
	private int viewCount;
	private int replyCount;
	
	Bbs(){}

	public Bbs(int bid, String btitle, String uname, LocalDateTime modTime, int viewCount, int replyCount) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.uname = uname;
		this.modTime = modTime;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}

	@Override
	public String toString() {
		return "Bbs [" + bid + ", " + btitle + ", " + uname + ", " + modTime + ", "
				+ viewCount + ", " + replyCount + "]";
	}

	public int getBid() {
		return bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public String getUname() {
		return uname;
	}

	public LocalDateTime getModTime() {
		return modTime;
	}

	public int getViewCount() {
		return viewCount;
	}

	public int getReplyCount() {
		return replyCount;
	}
}
