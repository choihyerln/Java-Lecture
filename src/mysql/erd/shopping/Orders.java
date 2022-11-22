package mysql.erd.shopping;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 주문 테이블 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Orders implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 주문 아이디. */
	private Integer oid;

	/** 주문일시. */
	private Date orderdate;

	/** 총 주문금액. */
	private Integer totalprice;

	/** 사용자. */
	private Users users;

	/** 카트 테이블 목록. */
	private Set<Cart> cartSet;

	/**
	 * 생성자.
	 */
	public Orders() {
		this.cartSet = new HashSet<Cart>();
	}

	/**
	 * 주문 아이디을 설정합니다..
	 * 
	 * @param oid
	 *            주문 아이디
	 */
	public void setOid(Integer oid) {
		this.oid = oid;
	}

	/**
	 * 주문 아이디을 가져옵니다..
	 * 
	 * @return 주문 아이디
	 */
	public Integer getOid() {
		return this.oid;
	}

	/**
	 * 주문일시을 설정합니다..
	 * 
	 * @param orderdate
	 *            주문일시
	 */
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	/**
	 * 주문일시을 가져옵니다..
	 * 
	 * @return 주문일시
	 */
	public Date getOrderdate() {
		return this.orderdate;
	}

	/**
	 * 총 주문금액을 설정합니다..
	 * 
	 * @param totalprice
	 *            총 주문금액
	 */
	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}

	/**
	 * 총 주문금액을 가져옵니다..
	 * 
	 * @return 총 주문금액
	 */
	public Integer getTotalprice() {
		return this.totalprice;
	}

	/**
	 * 사용자을 설정합니다..
	 * 
	 * @param users
	 *            사용자
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 * 사용자을 가져옵니다..
	 * 
	 * @return 사용자
	 */
	public Users getUsers() {
		return this.users;
	}

	/**
	 * 카트 테이블 목록을 설정합니다..
	 * 
	 * @param cartSet
	 *            카트 테이블 목록
	 */
	public void setCartSet(Set<Cart> cartSet) {
		this.cartSet = cartSet;
	}

	/**
	 * 카트 테이블를 추가합니다..
	 * 
	 * @param cart
	 *            카트 테이블
	 */
	public void addCart(Cart cart) {
		this.cartSet.add(cart);
	}

	/**
	 * 카트 테이블 목록을 가져옵니다..
	 * 
	 * @return 카트 테이블 목록
	 */
	public Set<Cart> getCartSet() {
		return this.cartSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oid == null) ? 0 : oid.hashCode());
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
		Orders other = (Orders) obj;
		if (oid == null) {
			if (other.oid != null) {
				return false;
			}
		} else if (!oid.equals(other.oid)) {
			return false;
		}
		return true;
	}

}
