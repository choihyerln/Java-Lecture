package mysql.bbs.erd;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 사용자 테이블 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Users implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 사용자 아이디. */
	private String uid;

	/** 패스워드. */
	private String pwd;

	/** 사용자 이름. */
	private String uname;

	/** 이메일. */
	private String email;

	/** 가입일자. */
	private Date regdate;

	/** 게시판 목록. */
	private Set<Board> boardSet;

	/** 댓글 목록. */
	private Set<Reply> replySet;

	/**
	 * 생성자.
	 */
	public Users() {
		this.boardSet = new HashSet<Board>();
		this.replySet = new HashSet<Reply>();
	}

	/**
	 * 사용자 아이디을 설정합니다..
	 * 
	 * @param uid
	 *            사용자 아이디
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 사용자 아이디을 가져옵니다..
	 * 
	 * @return 사용자 아이디
	 */
	public String getUid() {
		return this.uid;
	}

	/**
	 * 패스워드을 설정합니다..
	 * 
	 * @param pwd
	 *            패스워드
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 패스워드을 가져옵니다..
	 * 
	 * @return 패스워드
	 */
	public String getPwd() {
		return this.pwd;
	}

	/**
	 * 사용자 이름을 설정합니다..
	 * 
	 * @param uname
	 *            사용자 이름
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * 사용자 이름을 가져옵니다..
	 * 
	 * @return 사용자 이름
	 */
	public String getUname() {
		return this.uname;
	}

	/**
	 * 이메일을 설정합니다..
	 * 
	 * @param email
	 *            이메일
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 이메일을 가져옵니다..
	 * 
	 * @return 이메일
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 가입일자을 설정합니다..
	 * 
	 * @param regdate
	 *            가입일자
	 */
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	/**
	 * 가입일자을 가져옵니다..
	 * 
	 * @return 가입일자
	 */
	public Date getRegdate() {
		return this.regdate;
	}

	/**
	 * 게시판 목록을 설정합니다..
	 * 
	 * @param boardSet
	 *            게시판 목록
	 */
	public void setBoardSet(Set<Board> boardSet) {
		this.boardSet = boardSet;
	}

	/**
	 * 게시판를 추가합니다..
	 * 
	 * @param board
	 *            게시판
	 */
	public void addBoard(Board board) {
		this.boardSet.add(board);
	}

	/**
	 * 게시판 목록을 가져옵니다..
	 * 
	 * @return 게시판 목록
	 */
	public Set<Board> getBoardSet() {
		return this.boardSet;
	}

	/**
	 * 댓글 목록을 설정합니다..
	 * 
	 * @param replySet
	 *            댓글 목록
	 */
	public void setReplySet(Set<Reply> replySet) {
		this.replySet = replySet;
	}

	/**
	 * 댓글를 추가합니다..
	 * 
	 * @param reply
	 *            댓글
	 */
	public void addReply(Reply reply) {
		this.replySet.add(reply);
	}

	/**
	 * 댓글 목록을 가져옵니다..
	 * 
	 * @return 댓글 목록
	 */
	public Set<Reply> getReplySet() {
		return this.replySet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Users other = (Users) obj;
		if (uid == null) {
			if (other.uid != null) {
				return false;
			}
		} else if (!uid.equals(other.uid)) {
			return false;
		}
		return true;
	}

}
