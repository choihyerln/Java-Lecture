package mysql.erd;

public class ShoppingTest {

	public static void main(String[] args) {
		ShoppingDAO dao = new ShoppingDAO();
		
		Order order = dao.getOrder(101);
		System.out.println(order);
		for (Cart c : order.getCartSet())
			System.out.println(c.getPname() + " 가격 : " + c.getQuantity() + " * " + c.getPrice());
	}
}