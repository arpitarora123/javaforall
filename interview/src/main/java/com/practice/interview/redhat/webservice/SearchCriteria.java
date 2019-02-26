/**
 * 
 */
package com.practice.interview.redhat.webservice;

/**
 * Search criteria class to define the fileds on which search can be performed.
 * 
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public class SearchCriteria {
	private String name;
	private String lastName;
	private String street1;
	private String street2;
	private String state;
	private String sortingField;
	private String sortingOrder;
	private Integer recordLimit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSortingField() {
		return sortingField;
	}

	public void setSortingField(String sortingField) {
		this.sortingField = sortingField;
	}

	public String getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public Integer getRecordLimit() {
		return recordLimit;
	}

	public void setRecordLimit(Integer recordLimit) {
		this.recordLimit = recordLimit;
	}
}
