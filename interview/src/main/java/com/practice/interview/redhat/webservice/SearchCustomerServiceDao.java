/**
 * 
 */
package com.practice.interview.redhat.webservice;

import java.util.List;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public interface SearchCustomerServiceDao {

	public List<Customer> getCustomers(SearchCriteria criteria);
}
