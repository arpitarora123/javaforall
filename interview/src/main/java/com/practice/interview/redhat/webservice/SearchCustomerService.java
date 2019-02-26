package com.practice.interview.redhat.webservice;

import java.util.List;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public interface SearchCustomerService {

	/**
	 * Search for customers based on search criteria.
	 * 
	 * @param criteria
	 *            - Criteria to search the Customers.
	 * @return the list of Customers full filling the search criteria.
	 */
	public List<Customer> getCustomers(SearchCriteria criteria);

}