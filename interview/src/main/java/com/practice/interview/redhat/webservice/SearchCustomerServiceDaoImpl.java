/**
 * 
 */
package com.practice.interview.redhat.webservice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */

public class SearchCustomerServiceDaoImpl implements SearchCustomerServiceDao {

	private final int DEFAULT_LIMIT = 10;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Customer> getCustomers(SearchCriteria criteria) {
		Session session = HibernateUtil.getSession();
		List<Customer> results = null;
		try {
			Criteria cr = session.createCriteria(Customer.class);
			cr = prepareCriteria(criteria, cr);
			results = cr.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return results;
	}

	private Criteria prepareCriteria(SearchCriteria criteria, Criteria cr) {
		if (null != criteria) {
			if (null != criteria.getName()) {
				cr.add(Restrictions.eq("name", criteria.getName()));
			}
			if (null != criteria.getLastName()) {
				cr.add(Restrictions.eq("lastName", criteria.getLastName()));
			}
			if (null != criteria.getStreet1()) {
				cr.add(Restrictions.eq("addresses.street1", criteria.getStreet1()));
			}
			if (null != criteria.getStreet2()) {
				cr.add(Restrictions.eq("addresses.street2", criteria.getStreet2()));
			}
			if (null != criteria.getState()) {
				cr.add(Restrictions.eq("addresses.state", criteria.getState()));
			}
			if (null != criteria.getSortingField()) {
				if (null != criteria.getSortingOrder()) {
					if ("asc".equals(criteria.getSortingOrder())) {
						cr.addOrder(Order.asc(criteria.getSortingField()));
					} else {
						cr.addOrder(Order.desc(criteria.getSortingField()));
					}
				}
			}
			if (null != criteria.getRecordLimit()) {
				cr.setMaxResults(criteria.getRecordLimit().intValue());
			} else {
				cr.setMaxResults(DEFAULT_LIMIT);
			}
		}
		return cr;
	}

}
