package tw.hui.h2;

public class Hui08 {
	public static String hql = """
			SELECT
				o.customer.cname,
				o.employee.lastName,
				p.productName,
				d.unitPrice,
				d,quantity
			FROM order o
			JOIN o.orderDetails d
			JOIN d.product p
			where o.orderId = :orderId
			""";


	public static void main(String[] args) {

	}
}
