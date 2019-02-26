/**
 * Question #6
 */
package com.practice.interview.redhat.webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SearchCustomerServiceImpl implements SearchCustomerService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	@POST
	@Path("/search")
	public List<Customer> getCustomers(SearchCriteria criteria) {

		SearchCustomerServiceDaoImpl searchCustomerServiceDaoImpl = new SearchCustomerServiceDaoImpl();
		searchCustomerServiceDaoImpl.getCustomers(criteria);

		List<Customer> cusomerList = searchCustomerServiceDaoImpl.getCustomers(criteria);
		return cusomerList;
	}

}
