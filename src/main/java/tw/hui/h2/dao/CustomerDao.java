package tw.hui.h2.dao;

import org.hibernate.Session;

import tw.hui.h2.entity.Customer;
import tw.hui.h2.util.HibernateUtil;

public class CustomerDao {
	public Customer getById(String id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(Customer.class, id);
		}
	}
}
