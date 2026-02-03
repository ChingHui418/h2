package tw.hui.h2;

import tw.hui.h2.dao.CustomerDao;
import tw.hui.h2.entity.Customer;

public class Hui02 {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer c1 = dao.getById("ANTON");
		System.out.println(c1.getCname() + ":" + c1.getPhone());
	}

}
