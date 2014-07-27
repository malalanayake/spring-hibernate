package com.app.spring.service;

import java.util.List;

import com.app.spring.model.Customer;

/**
 * 
 * @author malalanayake
 *
 */
public interface CustomerService {

	public void addCustomer(Customer p);

	public void updateCustomer(Customer p);

	public List<Customer> listCustomers();

	public Customer getCustomerById(int id);

	public void removeCustomer(int id);

}
